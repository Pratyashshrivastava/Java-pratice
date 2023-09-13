package codes;

public class quickSort {
    static void sort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            int min_index = i;
            for(int j = 0; j<n; j++){
                if (arr[j]<arr[min_index]){
                    min_index =j;
                }
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }

        }
    }

    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[] = {4,8,3,7,9,0,1,6};
        int arr1 = sort(arr);
        
    }
}
