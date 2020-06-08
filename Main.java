package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedStack obj = new LinkedStack();
        Scanner scanner =new Scanner(System.in);
        boolean cond = true;

        System.out.println("Press:" +
                "1: For pushing in Stack\n" +
                "2: For pop out from stack\n" +
                "3: to exit\n" +
                "4: to print this info");
        while (cond){
            int cho = scanner.nextInt();
            switch (cho){
                case 1: {
                    String str = scanner.next();
                        obj.push(str);
                        System.out.println("String added Successfully");
                        break;
                }
                case 2:{
                    if (obj.isEmpty()){
                        System.out.println("Stack underflow");
                    }else {
                        System.out.println(obj.pop());
                    }
                    break;
                }
                case 3:{
                    cond = false;
                    break;
                }
                case 4:{
                    System.out.println("Press:" +
                            "1: For pushing in Stack\n" +
                            "2: For pop out from stack\n" +
                            "3: to exit\n" +
                            "4: to print this info");
                    break;
                }
                case 5:
                    obj.print();
                    break;
                default:
                    cond = true;
                    break;
            }
        }
    }
}
