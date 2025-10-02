public class smallestAndLargestElement {
    public static void main(String[] args) {
            
            int arr[]={12,13,1,10,34,10};
            int largestno=arr[0];
            int smallestNo=arr[0];
        
            for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>largestno) {
                largestno=arr[i];
            }
             if (smallestNo>arr[i]) {
                smallestNo=arr[i];
            }
        }

        System.out.println("Largest Number is:"+largestno);
        System.out.println("Smallest Number is:"+smallestNo);
    }
}
