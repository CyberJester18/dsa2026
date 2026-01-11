public class SecondLargest{
    public static void main (String[] args){
        int[] arr = {2,3,57,98,987,678};
        int largest=arr[0];
        int secondlargest = -1; //assume all positive elements

        for (int i=1; i<arr.length ; i++){
            if (arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];

            }
            else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
    System.out.println("second largest element is " +secondlargest);
}
    }