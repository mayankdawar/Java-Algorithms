public class Main  {
    public static void main(String[] args) {
        quickFind obj = new quickFind(10);
        obj.union(1,2);
        obj.union(8,3);
        obj.union(2,9);
        obj.union(4,5);
        obj.union(7,4);
        System.out.println(obj.connected(1,9));
        System.out.println(obj.connected(7,1));   
    }
}
