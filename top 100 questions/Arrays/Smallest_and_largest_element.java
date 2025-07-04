package Arrays;

public class Smallest_and_largest_element {
    public static void main(String[] args) {
        int []arr={12,13,1,10,36,10};
        int small=arr[0];
        int big=arr[0];

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>big)
            {
                big=arr[i];
            }
            if (small>arr[i])
            {
                small=arr[i];
            }
        }
        System.out.println("The Smallest and largest element in an array:"+small+ " "+big);
    }
}
