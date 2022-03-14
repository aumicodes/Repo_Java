package src;

import java.sql.SQLOutput;

public class Homework4 {
    public static void main(String[] args) {
        /**
         * Task -1
         * using Ternary operator assign value to int-variable
         *
         * Variable -> result1
         * if the length of sentence1-String is greater or equals to 5
         *      value in result1 should be 10
         * else
         *      value in result should be 15
         *
         * print:
         *      value of sentence1
         *      length of sentence1
         *      value of result1
         */
        String sentence1 = " i am fine";
        System.out.println("Value of sentence->" + sentence1); //(value)
        int lengthOfSentence1 = sentence1.length(); //length
        int result1 = sentence1.length() > 5 ? 10 : 15;
        System.out.println("Value of result1-> " + result1);

        /**
         * Task - 2
         *
         * Create a String Variable and store your full name in it.
         * Print the following values:
         *  1. length of your full name
         *  2. check if your name ends with "a" (ignore the case)
         *  3. check if your name contains with "a" (ignore the case)
         *
         */
        String myName = "Aumi Alam";
        int myNameLength = myName.length();
        System.out.println("The length of my full name is " + myNameLength + " characters");

        String checkFor = "a".toLowerCase();
        String myNameEndsWith = myName.toLowerCase();
        System.out.println("Does my name end with the letter 'a'? " + myNameEndsWith.endsWith(checkFor));
        System.out.println("Does my name contain the letter 'a'? " + myNameEndsWith.contains(checkFor));

        /**
         * Task - 3
         * "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR"
        /**
         * Print the results for:
         *  1. task3-value contains "king" (ignore cases)
         *  2. index of first occurrence of "EW" (ignore cases)
         */
        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        String task3Length = task3.toLowerCase();
        String seqCheck = "king".toLowerCase();
        boolean isSeqPresent = task3Length.contains(seqCheck);
        System.out.println("Does Task 3 contain 'king'? -> "+isSeqPresent);

        String firstOccurrenceOfEW = "EW".toUpperCase();
        int indexOf_EW = task3.indexOf("EW");
        System.out.println("The index of the first occurence of EW is " + indexOf_EW);

        String task4 = "kINg";
        /**
         * Convert the value in task4 variable into Titlecase
         *      (FirstCharacterUppercase and rest all in lowercase)
         *
         * "kINg" -> "King"
         * "QUEEN" -> "Queen"
         */

        String task4Queen = "QUEEN";
        String task4_toLowercase = task4.toLowerCase();
        String task4QueentoLowercase = task4Queen.toLowerCase();
        String task4_ToTitlecase = task4_toLowercase.substring(0,1).toUpperCase() + task4_toLowercase.substring(1,4);
        System.out.println("Convert the value in Task4 to Titlecase -> "+task4_ToTitlecase);
    }
}
