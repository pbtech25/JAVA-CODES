//import java.util.*;

public class ReverseAnArray {

    public static void reverse(int arr[]){
        int first = 0, last = arr.length-1;
        
        while(first < last){
            //swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};

        reverse(arr);

        for(int k:arr){
            System.out.print(k + " ");
        }
    }
}
