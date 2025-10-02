public class smallestElement {
    public static void main(String[] args) {
        int arr[]={12,13,1,10,34,10};
        int smallestNo=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if (smallestNo>arr[i]) {
                smallestNo=arr[i];
            }
        }
        System.out.println(" Smallest Number is:" + smallestNo);
    }
}
