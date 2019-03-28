package com.java;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(5,6,8,2,1,3,10,85,1,10,12,5));
        System.out.println(arrayList);
        System.out.println(doSelectionSort(arrayList));
    }

    public static int findSmallestIndex(ArrayList<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (smallest > arr.get(i)) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static ArrayList<Integer> doSelectionSort(ArrayList<Integer> arr){
        ArrayList<Integer> newArray = new ArrayList<>();
        int smallestIndex;
        int iterationCount = arr.size();
        for (int i = 0; i < iterationCount; i++) {
            smallestIndex = findSmallestIndex(arr);
            newArray.add(arr.get(smallestIndex));
            arr.remove(smallestIndex);
        }
        return newArray;
    }
}
