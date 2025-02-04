package org.dci;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

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

        String[] frequencyList = {"Kai", "Kai", "Thomas", "Yolo", "Whatever", "Yolo"};
        System.out.println(countFrequency(List.of(frequencyList)));

        HashMap<String, Integer> list1 = new HashMap<String, Integer>(
                Map.of("Kai", 1, "Peter", 1, "Heiner", 5, "Omar" , 5));
        HashMap<String, Integer> list2 = new HashMap<String, Integer>(
                Map.of("Kai", 1,  "Omar" , 2));

        System.out.println(mergeMaps(list1, list2));


        HashMap<String, Integer> list3 = new HashMap<String, Integer>(
                Map.of("Kai", 1, "Peter", 2, "Heiner", 5, "Omar" , 5));
        maxValueKey(list3);

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

    public static HashMap<String, Integer> countFrequency(List<String> list) {
        HashMap<String, Integer> outputMap = new HashMap<>();

            for(int j = 0; j < list.size(); j++) {
                if(!outputMap.containsKey(list.get(j))) {
                    outputMap.put(list.get(j), 1);
                } else{
                    outputMap.put(list.get(j), outputMap.get(list.get(j)) + 1);
                }
            }

        return  outputMap;
    }

    public static HashMap<String, Integer> mergeMaps(HashMap<String, Integer> input1, HashMap<String, Integer> input2) {

        for(Map.Entry<String, Integer> entry : input2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if(!input1.containsKey(key)) {
                input1.put(key, value);
            } else {
                input1.put(key, input1.get(key) + value);
            }

        }

        return input1;
    }

    public static void maxValueKey(HashMap<String, Integer> list) {
        Map<String, Integer> input = new HashMap<>(list);
        System.out.println("Input List: ");
        System.out.println(list);
        Map<String, Integer> output =
                list.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Sorted map: ");
        System.out.println(output);

        Map.Entry<String, Integer> lastElement =
                output.entrySet().stream().skip(output.size()-1).findFirst().orElseThrow();
        System.out.println("Last Element");
        System.out.println(lastElement);

        for(Map.Entry<String, Integer> entry : input.entrySet()) {
            if(entry.getValue() == lastElement.getValue()) {
                System.out.println("Highest Value Entry: ");
                System.out.println(entry);
                return;
            }
        }
    }



}