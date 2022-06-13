package Algorithms.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int a [] = {10,12,9,4,9,6,5};
        for(int i:a){
            System.out.print(i+"->");
        }
        bubble_sort(a);
        System.out.println();
        for(int i:a){
            System.out.print(i+"->");
        }


    }
    public static void bubble_sort(int [] a ){
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j <a.length-i-1 ; j++) {
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }

        }

    }
}
