package com.java;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        System.out.println(searchInt(array, 3));
        System.out.println(searchInt(array, 4));
    }

    private static boolean searchInt(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;
        int i = 0;
        while (low <= high){
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if(guess==item){
                return true;
            }
            if(guess>item){
                high = mid-1;
            } else {
                low = mid+1;
            }
            System.out.println(++i);
        }
        return false;
    }
}
