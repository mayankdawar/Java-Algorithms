public class quickUnion {
    private int[] id;
    public quickUnion(int n){
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }
    private int root(int i)
    {
        while (id[i] != i) {
            i = id[i];
        }
        return i;
    }
    public boolean connected(int p, int q){
        return root(p) == root(q);

    }
    public void union(int p, int q)
    {
        p = root(p);
        q = root(q);
        id[p] = q;
    }
}
