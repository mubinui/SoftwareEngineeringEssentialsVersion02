package Algorithms.Sorting;

import static Algorithms.Sorting.BubbleSort.bubble_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int a [] = {10,12,9,4,9,6,5};
        for(int i:a){
            System.out.print(i+"->");
        }
        insertion_sort(a);
        System.out.println();
        for(int i:a){
            System.out.print(i+"->");
        }


    }
    public static void insertion_sort(int a []){
        for (int i = 1; i <a.length ; i++) {
            int key = a[i];
            int j = i-1;

            while (j>=0 && a[j]>key){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;



        }

    }
}
