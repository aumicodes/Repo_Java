package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework9 {

    // Due date: Sunday (Apr 10)

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Happy");         //  ["Happy"]
        names.add("GroW");          //  ["Happy", "GroW"]
        names.add("LeaRN");         //  ["Happy", "GroW", "LeaRN"]
        names.add("PeaCEfUL");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL"]
        names.add("Learning");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL", "Learning"]
        names.add("HAPPy");
        names.add("Growing");
        names.add("ListeN");
        names.add("PEACE");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");
        names.add("QUeeN");
        names.add("YouNG");
        names.add("OLD");
        names.add("HAPPy");
        names.add("Growing");
        names.add("ListeN");
        names.add("PEACE");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");


        System.out.println("Number of words on the array list->" +names.size());

        System.out.println("\nQ1) Number of matching words");
        int sum = getCount("HAppY", names);
        System.out.println("HAppY is present --> " + sum + " times");

        System.out.println("\nQ2) Number of words containing");
        String toCheck = "HAp";
        int total = getContains(toCheck, names);
        System.out.println(toCheck+" is present --> " + total + " Times");

        System.out.println("\nQ3) Remove int value from given intArray ");
        int[] numArr = {2, 42, 13, 73, 22, 64};
        System.out.println(Arrays.toString(numArr));
        int toRemove = 42;
        System.out.println("Remove value - " + toRemove);
        int[] arr2 = removeNum(numArr,toRemove);
        System.out.println(Arrays.toString(arr2));
        
        // getCount("HAppY", names); should return 3
        // getCount("JAVA", names); should return 0

        // getContainsCount("HAp", names);  should returns 6
        // getContainsCount("A", names);  should returns 17
    }

    /**
     * Q1:
     *  Create method that will count (and return) the number of times a given String (ignoring the case) is present in given ArrayList
     *  name : getCount
     *  inputs : 2 (String, ArrayList<String>)
     *  return type : int
     */

    //* public static int getCount(String valToCheck, ArrayList<String> arrayList) {
    //     // code
    // }

    public static int getCount(String toCheck, ArrayList<String> list) {
        int count = 0;
        for (String val : list) {
            if (toCheck.equalsIgnoreCase(val)){
                count++;
            }
        }
        return count;
    }

    /**
     * Q2:
     *  Create method that will return the number of ArrayList-values contains the given String (ignoring the case)
     *  name : getCount
     *  inputs : 2 (String, ArrayList<String>)
     *  return type : int
     */

    // public static int getContainsCount(String valToCheck, ArrayList<String> arrayList) {
    // // code
    // }

    public static int getContains(String toCheck, ArrayList<String> list) {
        int count = 0;
        for (String val : list) {
            if (val.toLowerCase().contains(toCheck.toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    /**
     * Q3:
     * Create a method to return an int-array after removing input-int-value from an input-int-array
    *
    * -> How to create List using Array and vice-versa
    *
    * create a List using values of input-int-array
    * remove the input-int-value from List
    * create an int-array using List-values
    * return int-array
    */

    public static int[] removeNum (int[] inputArr, int toRemove){

        ArrayList<Integer> list = new ArrayList<>(); //turn inputArr into list
        for (int i : inputArr) {
            list.add(i);
        }
        list.remove(new Integer(toRemove)); //remove inputValue
        int[] newArray = new int[list.size()]; //turn list back into Array
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
        return newArray;
}
}
