public class SecondSmallest{
    public static void main(String[]args){
    
        int[] arr={3,4,5,6,78,67,45,899,677};
        int smallest = arr[0];
        int secondsmallest= Integer.MAX_VALUE;

            for(int i=1 ; i< arr.length ;i++)
            {
                if (arr[i]< smallest){
                secondsmallest = smallest;
                smallest= arr[i];
            }
                else if(arr[i] > smallest && arr[i]<secondsmallest){
                    secondsmallest= arr[i];
                    }
        
        }
        System.out.println("the second smallest is" +secondsmallest);
        }
        }
