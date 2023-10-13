import java.util.*;

public class MaxSubArrSum_Prefix {
        public static void maxSubArraySum(int arr[]){
            int currSum = 0; 
            int maxSum = Integer.MIN_VALUE;
            
            //declaring prefix sum array
            int prefix[] = new int[arr.length];
            prefix[0] = arr[0];
            for (int i = 1; i < prefix.length; i++) {
                prefix[i] = prefix[i-1] + arr[i];
            }

    
            for(int i=0; i<arr.length; i++){
                int start = i;
                for(int j=i; j<arr.length; j++){
                    int end=j;

                    currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                    // for(int k=start; k<=end; k++){
                    //     currSum += arr[k];
                    // }
                    // System.out.println(currSum);
                    if(maxSum < currSum){
                        maxSum = currSum;
                    } 
                }
            }
            System.out.println("Maximum sum is: " + maxSum);
        }
        public static void main(String[] args) {
            int array[] = {1,-2,6,-1,3};
            maxSubArraySum(array);
            
        }
    }
