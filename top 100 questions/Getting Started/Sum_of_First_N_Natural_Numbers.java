//Sum of First N Natural Numbers
import java.util.*;
public class Sum_of_First_N_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        int sum=0;

        for (int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of First N Natural Numbers is:"+sum);
    }
}
