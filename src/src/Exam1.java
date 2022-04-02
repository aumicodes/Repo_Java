package src;

public class Exam1 {

//Question 1
    public static void main(String[] args) {
        int[] numbers = new int[]{32, 54, 12, 67, 2, 5};
        System.out.println(java.util.Arrays.toString(sortArray(numbers)));

//Question 2
        int num = (543);
        System.out.println(sumOfDigits(543));

//Question 3
        int[] a = new int[] {23, 54, 67, 12, 34, 23, 56};
        int b = 23;
        System.out.println(java.util.Arrays.toString(Exam1.removeNumberFromArray(a,b)));
//Question 4
        //4
        String[] ab = {"i Am", "king", "great", "living standard", "programmer"};
        String[] cd = {"programmer", "king kong", "GREAT", "PEACE", "I AM"};
        findCommonString(ab,cd);
    }

    //Q1 method
    public static int[] sortArray (int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        return array;
    }

    //Q2 method
    public static int sumOfDigits (int numb){
        String number = String.valueOf(numb);
        String[] digitArray = number.split("");
        int sum = 0;
        for (int i = 0; i < digitArray.length; i++) {
            sum += Integer.valueOf(digitArray[i]);
        }
        return sum;
    }

    //Q3 method
    public static int[] removeNumberFromArray (int[] numberArray, int input){
        int number=0;
        for (int i = 0; i < numberArray.length; i++) {
            if (input != numberArray[i]) {
                number++;
            }
        }
        int[] outputArray = new int[number];
        int temp = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (input != numberArray[i]){
                outputArray[temp] = numberArray[i];
                temp++;
            }
        }
        return outputArray;
    }
    //Q4 method
    public static void findCommonString (String[] word, String[] anotherWord){
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < anotherWord.length; j++) {
                if (word[i].equalsIgnoreCase(anotherWord[j])){
                    System.out.println(word[i].toLowerCase());
                }
            }
        }
    }

}




