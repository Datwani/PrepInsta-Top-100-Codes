import java.util.Scanner;

//Even or Odd number
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check:");
        int num=sc.nextInt();

        if (num%2==0)
        {
            System.out.println("The is Even number:"+num);
        }else {
            System.out.println("The is ODD number:"+num);
        }

    }
}
