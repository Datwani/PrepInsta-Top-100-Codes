//Positive or Negative number
import java.util.Scanner;

public class PositiveorNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();

        if (num>0)
        {
            System.out.println("positive number");
        }
        else if (num==0)
        {
            System.out.println("number is zero");
        }
        else {
            System.out.println("not");
        }
    }
}
