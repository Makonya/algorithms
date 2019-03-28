package com.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(2, 5, 8, 10, 5, 6, 1, 5));
        System.out.println(countArrayElements((ArrayList<Integer>) array.clone()));
        System.out.println(sum((ArrayList<Integer>) array.clone()));
        System.out.println(findMaxInteger((ArrayList<Integer>) array.clone()));
        System.out.println(quickSort((ArrayList<Integer>) array.clone()));
    }

    public static int factorial(int number) {
        if (number == 1) return 1;
        else return number * factorial(number - 1);
    }

    public static int sum(ArrayList<Integer> arrayList) {
        if (arrayList.size() == 0) return 0;
        else {
            int lastArrayIndex = arrayList.size() - 1;
            int x = arrayList.get(lastArrayIndex);
            arrayList.remove(lastArrayIndex);
            return x + sum(arrayList);
        }
    }

    public static <T> int countArrayElements(ArrayList<T> arrayList) {
        if (arrayList.size() == 0) return 0;
        else {
            int counter = 1;
            int lastArrayIndex = arrayList.size() - 1;
            arrayList.remove(lastArrayIndex);
            return counter + countArrayElements(arrayList);
        }
    }

    public static int findMaxInteger(ArrayList<Integer> arrayList) {
        if(arrayList.size() == 1) return arrayList.get(0);
        else{
            int lastArrayIndex = arrayList.size()-1;
            int lastElement = arrayList.get(lastArrayIndex);
            arrayList.remove(lastArrayIndex);
            int temp;
            return lastElement > (temp = findMaxInteger(arrayList)) ? lastElement : temp;
        }
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> arrayList){
        if (arrayList.size() <= 1) return arrayList;
        else {
            int main = arrayList.get(0);
            ArrayList<Integer> less = new ArrayList<>();
            ArrayList<Integer> greater = new ArrayList<>();
            for (int i = 1; i < arrayList.size(); i++) {
                if(arrayList.get(i)>=main)
                    greater.add(arrayList.get(i));
                else less.add(arrayList.get(i));
            }
            ArrayList<Integer> newArrayList = new ArrayList<>();
            newArrayList.addAll(quickSort(less));
            newArrayList.add(main);
            newArrayList.addAll(quickSort(greater));
            return newArrayList;
        }
    }
}
