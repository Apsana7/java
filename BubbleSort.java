public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {5,6,20,8,9,12};
        int length = 6;

        int temp = 0;
        for(int i=0; i<length-1; i++){
            for(int j=0; j<length-1; j++){
                if(arr[j]>arr[j+1]){
             temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp; 
                }
            }
        }

        System.out.println("Sorted array:\n");
        for(int i=0; i<length-1; i++){
                System.out.printf("%d\t",arr[i]);
            
        }

    }
}
