package programs_practice;

import java.util.Arrays;

public class MedianOfArrays {
    public static void main(String[] args) {
        int a[]={1,2,3,6,4};
        int b[]={7,8,7,9,11};
        int al = a.length;
        int bl = b.length;

        int c[] = new int[al+bl];

        int cl = c.length;
        System.out.println(cl);

        for(int i =0; i<al; i++){
            c[i]=a[i];
        }
        for(int i=0;i<bl;i++){
            c[al+i]=b[i];
        }

        Arrays.sort(c); // learn how to sort without built in function

        for(int i = 0;i<cl;i++){
            System.out.println(c[i]);
        }
        int mid = cl/2;

        System.out.println(c[mid-1]);
    }
}
