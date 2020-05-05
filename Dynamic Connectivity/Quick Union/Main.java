public class Main {

    public static void main(String[] args) {
	// write your code here
        quickUnion obj = new quickUnion(10);
        obj.union(0,9);
        obj.union(2,3);
        obj.union(3,8);
        obj.union(2,7);
        obj.union(7,0);
        System.out.println(obj.connected(6,9));
        System.out.println(obj.connected(0,8));
    }
}
