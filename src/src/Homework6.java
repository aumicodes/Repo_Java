package src;

public class Homework6 {
    public static void main(String[] args) {

        // Due date: Mar 22, 2022
        /**
         * Q1:
         * Create the abbreviation
         *
         * make America great again -> MAGA
         * Good Morning -> GM
         * happy birthday to you dear friend -> HBTYDF
         * hEllo -> H
         * Air ballon -> AB
         *
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */
        String sentence1 = "outFit OF the DAY";
        // While Loop
        String[] Array = sentence1.split(" ");
        String quoteAbbreviation = "";
        int x=0;
        while (x< Array.length){
            quoteAbbreviation += Array[x].substring(0,1).toUpperCase();
            x++;
        }
        System.out.println(sentence1+" -- Abbreviation --> "+quoteAbbreviation);


        /**
         * Q2:
         * Reverse the given String
         *
         * make america great again -> again great america make
         * good Morning -> Morning good
         * learn -> learn
         * happy birthday to you -> you to birthday happy
         *
         */

        String sentence2 = "make america great again" ;
        String[] magaArray = sentence2.split(" ");
        String magaAbbreviation = "";
        int y= magaArray.length-1;
        do {
            magaAbbreviation += magaArray[y]+" ";
            y--;
        } while(y >= 0);
        magaAbbreviation = magaAbbreviation.trim();
        System.out.println(sentence2+" -- Reversed is ---> "+magaAbbreviation);


        /**
         * Q3:
         * Convert the String value in to Titlecase
         *
         * make america great again -> Make America Great Again
         * gOOd morNING -> Good Morning
         * learn -> Learn
         * happy birTHday TO yOu -> Happy Birthday To You
         *
         */

        String sentence3 = "hOw AbOuT nO" ;
        String[] sentence3WordArray = sentence3.split(" ");
        String Titlecase = "";
        for (int i=0; i<sentence3WordArray.length; i++){
            Titlecase += sentence3WordArray[i].substring(0,1).toUpperCase()+sentence3WordArray[i].substring(1).toLowerCase()+" ";
        }
        Titlecase=Titlecase.trim();
        System.out.println(sentence3+" -- In Titlecase --> "+Titlecase);

        /**
         * Q4:
         * Find the minimum value from the given array
         *
         * int[] numbers = {-1, 1};     ->  -1
         * int[] numbers = {1, 21, 87, 23};     -> 1
         * int[] numbers = {87, 23, 89, 0, 54, 23}; -> 0
         */

        int[] numbers = {23, 17, -10, -4, 66, 43, 55, -72, -11};
        int count = 0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[count] < numbers[0]){
                numbers[0] = numbers[count];
            }
            count++;
        }
        System.out.println("Minimum number from array --> " + numbers[0]);
    }
}
