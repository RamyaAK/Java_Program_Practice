package programs_practice;

public class CountPairsWithSumInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};//A
        int sum = 5; //k
        countPairsWithSumInArray(arr, sum);
    }

    private static void countPairsWithSumInArray(int[] arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
        System.out.printf("Count of pairs is " + count);
    }
}

