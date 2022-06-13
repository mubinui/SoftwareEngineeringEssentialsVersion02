package Algorithms.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int a [] = {10,12,9,4,9,6,5};
        int b [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean result = linear_search(a,x);
        boolean result1 = binary_search(0,b.length-1,b,x);
        System.out.println(result+"<-lin |bin->"+result1);




    }
    public static boolean linear_search(int [] a, int search){
        boolean flag = false;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]== search){
                flag = true;
                break;
            }

        }
        return flag;

    }
    public static boolean binary_search(int start, int end, int [] a,int item){
        if(start<end){
            int mid = (start+end)/2;
            if(a[mid]==item){
                return true;
            } else if (item>a[mid]) {
                return binary_search(mid+1,end,a,item);
            }
            else{
                return binary_search(start,mid,a,item);
            }

        }
        else {
            return false;
        }


    }
}
