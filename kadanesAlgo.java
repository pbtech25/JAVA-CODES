public class kadanesAlgo {

    public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0; // reset the current sum to zero since we are looking at a new  
            }

            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subArray sum is: " + ms);
    }

    public static void main(String[] args) {
        //int numbers[] = {-2, -3, 4, -1, -2, 1,  5, -3};
        int numbers[] = {-1,-2,-3,-4};
        kadanes(numbers);
    }
}
