
public class InitializationOfArrays  {
    public static void main(String[]args){
        int[] arr= {1,2, 3,4,44,5,78};
// for (int i=0;i<arr.length;i++){
//     System.out.print(arr[i] + "  ");
//     }
    arr[3] = 33;
   for (int i=0;i<arr.length;i++){
    System.out.print(arr[i] + "  ");
    }
    System.out.println(arr.length);
}
}


