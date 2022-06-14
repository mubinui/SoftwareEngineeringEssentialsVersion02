package Algorithms.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int a [] = {10,12,9,4,9,6,5};
        for(int i:a){
            System.out.print(i+"->");
        }
        merge_sort(a,0,a.length-1);
        System.out.println();
        for(int i:a){
            System.out.print(i+"->");
        }

    }
    public static void merge_sort(int [] a, int l, int r){
        if (l<r){
            int mid = (l+r-1)/2;
            merge_sort(a,l,mid);
            merge_sort(a,mid+1,r);

            merge(mid,l,r,a);

        }
    }
    public static void merge(int mid, int left, int right, int a[]){
        int n1 = mid -left+1;
        int n2 = right - mid;

        int L [] = new int[n1];
        int R [] = new int[n2];

        for (int i = 0; i <L.length ; i++) {
            L[i] = a[i+left];

        }
        for (int i = 0; i <R.length ; i++) {
            R[i] = a[i+mid+1];
        }
        int i = 0 , j = 0, k=0;
        while (i<n1 && j<n2){
            if (L[i]<=R[j]){
                a[k] = L[i];
                i++;

            }
            else{
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (n1>i){
            a[k]=L[i];
            i++;
            k++;
        }
        while (n2>j){
            a[k]=R[j];
            j++;
            k++;
        }


    }
}
