package programs_practice;

public class ArraySort {
    public static void main(String[] args) {
        int arr[] = {2,1,1,1,2,0,1,2,0,2,1};

        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
