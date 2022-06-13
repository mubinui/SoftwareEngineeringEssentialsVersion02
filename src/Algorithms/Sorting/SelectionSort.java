package Algorithms.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int a [] = {10,12,9,4,9,6,5};
        for(int i:a){
            System.out.print(i+"->");
        }
        selection_sort(a);
        System.out.println();
        for(int i:a){
            System.out.print(i+"->");
        }


    }
    public static void selection_sort(int [] a){
        for (int i = 0; i < a.length-1; i++) {
            int min_idx = i;
            for (int j = i+1; j <a.length; j++) {
                if(a[min_idx]>a[j]){
                    int temp = a[min_idx];
                    a[min_idx] = a[j];
                    a[j] = temp;

                }

            }

        }

    }
}
