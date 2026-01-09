public class Marks {
    public static void main(String[] args) {
        int[] mark={23,34,56,43,21,78,98,21,12};
        System.out.print(" students roll no who failed : ");
        for (int i=0;i<mark.length;i++){
            if(mark[i]<=35){
                System.out.print(i+" ");
            }
        }
        
    }
    
}
