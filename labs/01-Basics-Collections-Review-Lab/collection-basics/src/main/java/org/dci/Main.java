package org.dci;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1,400, 99, -10, 20, 500, 500, 1312, 10, 99));

        System.out.println(integerList);
        System.out.println("Second biggest element is: " + findSecondLargest(integerList));

        System.out.println("After duplicate removal: ");
        System.out.println(removeDuplicates(integerList));

        ArrayList<Integer> sumList = new ArrayList<>(Arrays.asList(5,5,5,5,5));
        System.out.println("Sum of elements in range of 0 to 3: ");
        System.out.println(sumInRange(sumList, 0, 3));

        ArrayList<String> palindrome = new ArrayList<>(Arrays.asList("A", "N", "N", "A"));
        System.out.println("Is " + palindrome + " a palindrome: " + isPalindrome(palindrome));

        ArrayList<Integer> consecutiveNumbers = new ArrayList<>(Arrays.asList(10, 4, 20, 5, 1, 3, 2, 6));
        System.out.println(consecutiveList(consecutiveNumbers));

    }

    public static int findSecondLargest(ArrayList<Integer> list) {
        int biggestInt = list.getFirst();
        int secondBiggestInt = list.getFirst();

        for(Integer element : list) {
            if(element > biggestInt) biggestInt = element;
        }

        for(Integer element : list) {
            if(element > secondBiggestInt && element < biggestInt) secondBiggestInt = element;
        }

        return secondBiggestInt;
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> outputList = new ArrayList<>();

        for(Integer element : list) {
            if(!outputList.contains(element)) outputList.add(element);
        }
        return outputList;
    }

    public static int sumInRange(ArrayList<Integer> list, int startIndex, int endIndex) {

//        check if the indices are out of bounds
        if(startIndex < 0 || endIndex > list.size()) return 0;

        int sum = 0;
        for(int i = startIndex; i <= endIndex; i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static boolean isPalindrome(ArrayList<String> list) {
        return list.equals(list.reversed());
    }

    public static Integer consecutiveList(ArrayList<Integer> list) {
        int count = 1;
        int result = 1;
        Collections.sort(list);

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).equals(list.get(i-1))) continue;

            if(list.get(i).equals(list.get(i-1) + 1)) {
                count++;
            } else {
                count = 1;
            }

            result = Math.max(result, count);
        }


        return result;
    }

}