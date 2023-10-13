// import java.util.*;

// public class binarySearch {

//     public static int bin_ser(int arr[], int num){
//         int start = arr[0];
//         int end = arr.length -1;

//         while (start<=end) {
//             int mid = (start + end)/2;

//             if (arr[mid] == num) {
//                 return mid;
//             }
//             else if (arr[mid] > num){
//                 end = mid - 1;
//             }
//             else{
//                 start = mid+1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,4,6,8,10,12,14};

//         System.out.println("Element to serach: ");
//         Scanner sc= new Scanner (System.in);    
//         int n=sc.nextInt();

//         int index = bin_ser(arr, n);

//         if (index == -1) {
//             System.out.println("Element not found!!");
//         } else {
//             System.out.print("Index of element " +n+ ": "+  index );    
//         }

//         sc.close();
//     }
// }


import java.util.*;

public class binarySearch {

    public static int bin_ser(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        
        while (start<=end) {
            int mid = (start+end)/2;

            if (arr[mid]==key) {
                return mid;
            }
            else if (arr[mid] > key) {
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {34, 56, 12, 3, 4, 8, 89, 67, 54, 34, 55, 18};

        System.out.println("Original Array is: ");
        for (int k:arr) {
            System.out.print(k+ " ");
        }

        Arrays.sort(arr);

        System.out.println();
        System.out.println();

        System.out.println("Sorted Array is: ");
        for (int k:arr) {
            System.out.print(k+ " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Enter the key to search: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int index = bin_ser(arr, key);

        System.out.println();


        if (index == -1) {
            System.out.println("Key not found");
        }else{
            System.out.println("Key is at index: " + index);
        }
    }
}