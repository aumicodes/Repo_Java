package src;

import java.util.*;

public class Homework10 {
    // Due Date -> Apr 12
    /**
     * Question-1:
     *
     * Create a method that can return if a given-String-Array has duplicate values or not.
     *
     * Input: String-Array
     * Return type: boolean
     *
     *
     *
     * create String-List using given-String-Array
     * create a String-Set using String-List
     * compare size of Set and List
     */

    public static boolean isDuplicate (String[] strArr) {
        List<String> strList = new ArrayList<>(Arrays.asList(strArr));
        Set<String> strSet = new HashSet<>(strList);
        boolean isDuplicate = false;
        if (strList.size() != strSet.size()){
            isDuplicate = true;
        }
        return isDuplicate;
    }

    /**
     * Question-2:
     * Create a method that would return the duplicate values of given-String-array (ignore the case)
     *
     * Input: String-Array
     * Return type:     (one of these -> Array, List, Set)
     *
     *
     * String[] names = {"abc" , "abc" , "DEF", "ABC", XYZ", "def"}
     *
     * "abc", "def"
     */

    public static Set<String> countDuplicate (String[] strArr) {
        Set<String> duplicateList = new HashSet<>();
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equalsIgnoreCase(strArr[j])){
                    duplicateList.add(strArr[i].toLowerCase());
                }
            }
        }
        return duplicateList;
    }

    public static void main(String[] args) {

    //Q1

    String[] strArr = {"milk","eggs","cheese","carrots","milk","berries","milk"};
    boolean isDuplicate = isDuplicate(strArr);
    System.out.println(Arrays.toString(strArr));
    System.out.println("Does the above array have duplicate values ? --> "+isDuplicate);

    //Q2

    String[] names = {"abc" , "aBc" , "deF", "ABC", "XYZ", "DEF"};
    Set duplicates = countDuplicate(names);
    System.out.println(Arrays.toString(names));
    System.out.println("Duplicate values from above array --> " + duplicates);
}}
