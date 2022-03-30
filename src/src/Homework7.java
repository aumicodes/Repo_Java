package src;

public class Homework7 {

    public static void main(String[] args) {
        String Q1 = "great balls of fire";
        System.out.println("Abbreviation -> " + makeAbbreviation(Q1));
        String Q2 = "great balls of fire";
        System.out.println("Titlecase -> " + makeTitlecase(Q2));
        int[] Q3 = {7, 18, 12, 99, 53, -41, -17, -1, -98, -22};
        System.out.println("Max value in array -> " + maxArrayValue(Q3));
        String Q4 = "cellphone";
        System.out.println("is this a palindrome? -> " + checkPalindrome(Q4));
        String[] Q5 = {"happy", "Happy new year", "peaceful" , "king kong"};
        System.out.println("Longest string -> " + longestString(Q5));
    }

    /**
     * Q1:
     * Create a method to make abbreviation for a given sentence
     * Method should return
     * Questions to answer before creating a method:
     * 1. what is the purpose of the method?   -   makeAbbreviation
     * 2. do I need any input from user?   -   1 (String)
     * 3. should we return any value in the end of method? - Yes
     * If yes, then what is the datatype of returned value? - String
     * <p>
     * public static String makeAbbreviation(String inputStr) {
     * // code
     * }
     */

    public static String makeAbbreviation(String inputStr) {
        String makeAbbreviation = " ";
        String[] Array = inputStr.split(" ");
        String quoteAbbreviation = "";
        int x = 0;
        while (x < Array.length) {
            makeAbbreviation += Array[x].substring(0, 1).toUpperCase();
            x++;
        }
        return makeAbbreviation;
    }

    /**
     * Q2:
     * Create a method that will change the given sentence in Titlecase
     * Method should return
     * <p>
     * HappY nEW YEAR to YoU dEAr -> Happy New Year To You Dear
     * gooD morNING -> Good Morning
     * make AMERICA GreAT AgAIn -> Make America Great Again
     */

    public static String makeTitlecase(String inputStr2) {
        String makeTitlecase = "";
        String[] splitSentence2 = inputStr2.split(" ");
        for (int i = 0; i <= splitSentence2.length - 1; i++) {
            makeTitlecase += splitSentence2[i].substring(0, 1).toUpperCase() + splitSentence2[i].substring(1).toLowerCase() + " ";
        }
        return makeTitlecase;
    }

    /**
     * Q3:
     * Create method to find the maximum value from given int-array
     * Method should return
     * <p>
     * int[] = {23, 54, 76, 12, 67, 90, 23}     ->  90
     * <p>
     * int[] = {23, 54, 76, 12}     ->  76
     * <p>
     * int[] = {-2, -9, -4, -7, -9, -55}     ->  -2
     * <p>
     * Questions to answer before creating a method:
     * 1. what is the purpose of the method? - findMaxInArray
     * 2. do I need any input from user? - 1 (int[])
     * 3. should we return any value in the end of method? - yes
     * If yes, then what is the datatype of returned value? - int
     * <p>
     * int maxNum = inputArray[0]
     * <p>
     * if (inputArray[1] > maxNum)
     * maxNum = inputArray[1]
     * if (inputArray[2] > maxNum)
     * maxNum = inputArray[2]
     */

    public static int maxArrayValue(int[] input) {
        int maxValue = input[0];
        int i = 0;
        while (i < input.length) {
            if (input[i] > maxValue) {
                maxValue = input[i];
            }
            i++;
        }
        return maxValue;
    }


    /**
     * Q4:
     * Create a method to find if the given string is palindrome (DO NOT ignore case)
     * Method should return (boolean)
     *
     * "hello" -> "olleh"   (not palindrome)
     * "eye" -> "eye"       (palindrome)
     *
     *
     * "level" -> true
     * "eye" -> true
     * "fall" -> false
     * "Level" -> false
     * "eYe" -> true
     * Eye -> false
     */

public static boolean checkPalindrome (String Q4word){
    String reverseQ4word = "";
    String[] split = Q4word.split("");
    for (int i = 1; i <=split.length; i++){
        reverseQ4word += split[split.length - i];
    }
    return Q4word.equals(reverseQ4word);
}
    /**
     * Q5:
     * Create a method to find the longest String in the given String-array
     * Method should return (String)
     *
     * ["happy", "Happy new year", "peaceful" , "king kong"]    ->    "Happy new year"
     *
     * Questions to answer before creating a method:
     *  1. what is the purpose of the method? - findMaxString
     *  2. do I need any input from user? - 1 (String[])
     *  3. should we return any value in the end of method? - yes
     *      If yes, then what is the datatype of returned value? - String
     */

    public static String longestString(String[] given) {
        String longestString = given[0];
        int i = 0;
        do {
            if (given[i].length() > longestString.length()) {
                longestString = given[i];
            }
            i++;
        } while (i < given.length);
        return longestString;
    }
}

