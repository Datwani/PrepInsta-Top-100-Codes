package Arrays;

public class Largest_element {
    public static void main(String[] args) {
        int [] arr={12,13,1,10,34,10};
        int big=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>big) {
                big=arr[i];
            }
        }
        System.out.println("Largest element in an array is:"+big);
    }
    
}
