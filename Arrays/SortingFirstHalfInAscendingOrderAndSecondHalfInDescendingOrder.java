import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingFirstHalfInAscendingOrderAndSecondHalfInDescendingOrder {
    public static void main(String[] args) {
        int []arr={1,90,34,89,7,9};
        sort(arr);
    }
    public static void sort(int[] arr){
       
        //sort array
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++)
        {
             //sort first half 
            for(int j=0;j<arr.length/2;j++)
            {
                if (arr[j]>arr[j+1]) {
                   int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
            //sort second half
            for(int j=arr.length/2;j<arr.length-1;j++)
            {
                if (arr[j]<arr[j+1]) {
                   int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
        System.out.println(Arrays.toString(arr));

    }
}
