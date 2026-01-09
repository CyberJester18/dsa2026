import java.util.Scanner;
public class InputOutput {
    public static void main(String[]args){
        //input
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextIn
        
        
        int[]arr = new int [n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
            }
             //output
             for (int i=0;i<n;i++){
                System.out.println(arr[i]*3+" ");
             }
            sc.close();
    }
    
}
