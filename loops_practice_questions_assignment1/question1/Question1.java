package question1;
import java.util.Scanner;
class Question1 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a natural number : ");
        int sum=0;
        int n=sc.nextInt();
        if(n<1){
            System.out.println("entered number is not a natural number");
        }
        else{
        for (int i = 1; i <=n; i++) {
            sum=sum+i;
        }
        System.out.print("sum of natural numbers up to a entered number is : "+sum);
    }
}}