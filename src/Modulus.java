import java.util.Scanner;

public class Modulus {
    public static void main(String [] args){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a number: ");

       int num1 = key.nextInt();

       for (int i = 1 ; i <= num1 ; i++){
           if (i % 2 == 0){
               System.out.println(i + " it's an even number");
           } else {
               System.out.println(i + " it's an odd number");
           }
       }

    }
}
