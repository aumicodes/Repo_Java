package src;

public class Homework5 {
    public static void main(String[] args) {
        /**
         * Q1:
         * Store a country name in a variable.
         * Print the name of country
         * Print the length of country name (NOTE: you CANNOT use length()-method from String class)
         *
         * Hint: you need to use split() method and length-variable (from Array)
         */

        String country = "Bangladesh";
        System.out.println("Country name is " + country);
        System.out.println("Length using Array --> " + country.split("").length);


        /**
         * Q2:
         * Print the number of words in the sentence2-value
         */

        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        String[] sentence2Split = sentence2.split(" ");
        System.out.println("The number of words in sentence 2 is = " + sentence2Split.length);

        /**
         * Q3:
         * Create the abbreviation for 4-word sentence
         *
         * make America great again -> MAGA
         * outfit of the day -> OOTD
         * happy birthday to you -> HBTY
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */
        String sentence3 = "great balls of fire";
        String[] sentence3_PostSplit = sentence3.toUpperCase().split(" ");
        String abbreviation = " ";
        String Letter1 = sentence3_PostSplit[0].substring(0, 1);
        String Letter2 = sentence3_PostSplit[1].substring(0, 1);
        String Letter3 = sentence3_PostSplit[2].substring(0, 1);
        String Letter4 = sentence3_PostSplit[3].substring(0, 1);
        abbreviation = Letter1 + Letter2 + Letter3 + Letter4;
        System.out.println("Abbreviation for four word sentence is " + abbreviation);

        /**
         * Q4:
         * Create an int-variable and store any value in it
         * if the value is divisible by 5, print "divisible by 5"
         * if the value is divisible by 3, print "divisible by 3"
         * if the value is divisible by 5 and 3, print "divisible by 5 and 3"
         * if the value is NOT divisible by 5 and 3, print "NOT divisible by 5 and 3"
         *
         * int num = 15
         */

        int number = 15;
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 5 and 3");
        } else if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3");
        } else if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        } else {
            System.out.println("NOT divisible by 5 and 3");
        }

        /**
         * Q5:
         * Create two variables to store student-score and max-score (max score a student can get)
         * based on student percentage, print the grade:
         *
         * 91-100%      -> Grade A
         * 81-90.99%    -> Grade B
         * 71-80.99%    -> Grade C
         * 61-70.99%    -> Grade D
         * below 60.99% -> Grade E
         *
         * double studentScore = -5 (studentScore <= maxScore)
         * int maxScore = -1 (maxScore > 0)
         * (studentScore/maxScore)*100 = 92.2
         * Your grade = A, percentage = 92.2
         * if student-score is invalid, print "Invalid student score entered"
         * if max-score is invalid,  print "Invalid max score entered"
         */

        double studentScore = 75;
        int maxScore = 100;
        double percentage = (studentScore / maxScore) * 100;

        if (studentScore > 100 || studentScore < 0) {
            System.out.println("Invalid student score entered");
        } else if (maxScore != 100) {
            System.out.println("Invalid max score entered");
        } else if (percentage >= 90.99 && percentage <= 100) {
            System.out.println("Grade A");
        } else if (percentage >= 81 && percentage <= 90.99) {
            System.out.println("Grade B");
        } else if (percentage >= 71 && percentage <= 80.99) {
            System.out.println("Grade C");
        } else if (percentage >= 61 && percentage <= 70.99) {
            System.out.println("Grade D");
        } else if (percentage <= 60.99) {
            System.out.println("Grade D");
        }

        /**
         * Q6:
         * String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"}
         * print the values which has length greater than 5 and starts with l
         * expected ans:
         * learning
         * living standard
         */

        String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live", "give", "living standard", "life"};

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 6 && words[i].toLowerCase().startsWith("l")) {
                System.out.println(words[i]);
            }
        }
    }
}

