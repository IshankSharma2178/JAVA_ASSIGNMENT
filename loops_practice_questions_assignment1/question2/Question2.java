package question2;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(n+" X " +i+ " = " + n*i);
        }
    }
}
