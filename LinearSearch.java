// import java.util.*;

// public class LinearSearch{

//     public static int lin_ser(int num[], int key){
//         for (int i = 0; i <num.length ;i++){
//             if (key == num[i]){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int num[] = {1,2,3,4,5,6,7,8,9,10};

//         System.out.println("Enter the number to serach: ");

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         int index = lin_ser(num,a);

//         if (index == -1) {
//             System.out.println("Not Found");            
//         }else{
//             System.out.println("Element is at: " + index +"th index");
//         }

//         sc.close();
//     }
// }

import java.util.*;

public class LinearSearch {

    public static int lin_ser(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,18};

        System.out.println("Enter the key to search: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int index = lin_ser(arr, key);

        if (index == -1) {
            System.out.println("Key not found :(");
        } else {
            System.out.println("Key is at index: " + index);
        }

        sc.close();

    }
    
}