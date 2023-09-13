package codes;

public class LeadersInArray {
    static void Leaders(int arr[], int n){
        int max_from_right = arr[n-1];
        System.out.print(max_from_right + " ");
        for (int i = n-2; i>=0; i--){
            if (arr[i]>max_from_right){
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
            
        }
    }
    public static void main(String[] args){
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        Leaders(arr, n);
    }
}
