
//SubArray: any continuous part of an array

public class PrintSubarrays {

    public static void printSubArrays(int arr[]){
        int tot_SubArr=0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                tot_SubArr++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subArrays are: " + tot_SubArr);
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        printSubArrays(array);
        
    }
}
