import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QueueOfStrings obj = new QueueOfStrings();
        Scanner scanner =new Scanner(System.in);
        boolean cond = true;

        System.out.println("Press:\n" +
                "1: For adding item in Queue\n" +
                "2: For removing item from Queue\n" +
                "3: to exit\n" +
                "4: to print this info\n" +
                "5: to print the queue");
        while (cond){
            int cho = scanner.nextInt();
            switch (cho){
                case 1: {
                    String str = scanner.next();
                    obj.enqueue(str);
                    System.out.println("String added Successfully");
                    break;
                }
                case 2:{
                    if (obj.isEmpty()){
                        System.out.println("Queue underflow");
                    }else {
                        System.out.println(obj.dequeue());
                    }
                    break;
                }
                case 3:{
                    cond = false;
                    break;
                }
                case 4:{
                    obj.print();
                    break;
                }
                case 5:{
                    System.out.println("Press:\n" +
                            "1: For adding item in Queue\n" +
                            "2: For removing item from Queue\n" +
                            "3: to exit\n" +
                            "4: to print the queue"+
                            "5: to print this info\n");
                    break;
                }
                default:
                    cond = true;
                    break;
            }
        }
    }
}
