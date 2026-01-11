public class CheckSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 5};

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println(false);
                return;
            }
        

        System.out.println(true);
    }
}
}
