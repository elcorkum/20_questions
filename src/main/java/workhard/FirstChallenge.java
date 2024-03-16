package workhard;

import java.util.Arrays;

public class FirstChallenge {
    //Loops, Control Flow, Arrays and Methods

    //Question 1
    public static int getLastIndex(String [] names) {

        return names.length - 1;
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {

        return names.length -2;
    }

    //Question 3
    public static String getFirstElement(String[] names) {

        return  names[0];
    }

    //Question 4
    public static String getLastElement(String[] names) {

        return names[names.length - 1];
    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {

        return names[names.length - 2];
    }

    //Question 6
    public static int getSum(int[] ints) {
        int sumNums = 0;
        for (int i = 0; i < ints.length; i++) {
            sumNums += ints[i];
        }
        return sumNums;
    }

    //Question 7
    public static int getAverage(int[] ints) {
        int average = 0;
        int sumNums = 0;
        for (int i = 0; i < ints.length; i++) {
            sumNums += ints[i];
        }
        average = sumNums / ints.length;
        return  average;
    }

    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        String message = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0){
                message = "These are the odd numbers.";
                System.out.print(numbers[i] + "\t");

            }
        }
        return message;
    }

    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
       String message = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                message = "These are the even numbers.";
                System.out.print(numbers[i] + "\t");
            }
        }
        return message;
    }
    //Question 10
    public static boolean contains(String[] names, String element) {
        boolean isContained = false;
        for (int i =  0; i < names.length; i++) {
            if (names[i] == element) {
                isContained = true;
            }
        }
        return isContained;
    }

    //Question 11
    public static int getIndexByElement(String[] names, String element) {
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(element)) {
                index = i;
            }
        }
        return index;

    }
    //Question 12
    public static void printOddNumbersInRange(int start, int end){
        for (int i = start; i <= end; i++ ) {
            if(i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }

    }

    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String message = "";
        for (int i = n; i > 0; i--) {
            message += str;
        }
        return message;
    }

    //Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String repeatedWord = "";
        String newWord = str.substring(0, 3);
        for (int i = n; i > 0; i--) {
            repeatedWord += newWord;
        }

        return repeatedWord;
    }

    //Question 15
    public static int wordsInAStringCounter(String str){
        int wordCount = str.split("\\s").length;
        return wordCount;
    }


    //Question 16
    public static int countVowels(String str){
        int count = 0;
        String lowerCaseWord = str.toLowerCase();
       for (int i = 0; i < str.length(); i++) {
           if (lowerCaseWord.charAt(i) == 'a' || lowerCaseWord.charAt(i) == 'e' || lowerCaseWord.charAt(i) == 'i' || lowerCaseWord.charAt(i) == 'o' || lowerCaseWord.charAt(i) == 'u' || lowerCaseWord.charAt(i) == 'y') {
               count++;
           }
       }
       return count;
    }


    //Question 17
    public static String[] swapFirstLastElements(String[] stringArray) {
        String temporaryElement = stringArray[0];
        stringArray[0] = stringArray[stringArray.length -1];
        stringArray[stringArray.length -1] = temporaryElement;
        return stringArray;
    }


    //Question 18
    public static String replaceCharacters(String str) {
        String lowerCaseString = str.toLowerCase();
        String result = lowerCaseString.replaceAll("f", "7").replaceAll("s", "&").replaceAll("1", "!").replaceAll("a", "@");

        return result;
    }



    //Question 19
    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        String[] stringArray = stringInput.split(" ");

        for (int x = 0; x < stringArray.length; x++) {
            int elementPosition = x + 1;
            if (elementPosition % 2 == 0) {
                stringArray[x] = "Wu";
            } else if (elementPosition % 3 == 0) {
                stringArray[x] = "Tang";
            }
        }
        stringInput = Arrays.toString(stringArray);
        return stringInput;
    }


    //Question 20
    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        int[] numbers = new int[maxnumber];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < maxnumber; i++) {
            numbers[i] = numbers[i -1] + numbers[i-2];
        }

        return Arrays.toString(numbers);
    }




    public static void main(String[] args) {

        String[] food = {"mango", "broccoli", "juice", "berrie", "pasta alfredo", "pie"};
        int[] nums = {20, 5, 8, 12, 15, 67, 24, 17};
        String randomWord = "The quick brown fox jumps over the lazy dog";

        //Answer 1
        int lastIndex = getLastIndex(food);
        System.out.println(lastIndex);

        //Answer 2
        int secondToLastIndex = getSecondToLastIndex(food);
        System.out.println(secondToLastIndex);

        //Answer 3
        String firstElement = getFirstElement(food);
        System.out.println(firstElement);

        //Answer 4
        String lastElement = getLastElement(food);
        System.out.println(lastElement);

        //Answer 5
        String secondLastElement = getSecondToLastElement(food);
        System.out.println(secondLastElement);

        //Answer 6
        int sumOfNums = getSum(nums);
        System.out.println(sumOfNums);

        //Answer 7
        int numAverage = getAverage(nums);
        System.out.println(numAverage);

        //Answer 8
        String oddNumbers = extractAllOddNumbers(nums);
        System.out.println(oddNumbers);

        //Answer 9
        String evenNumbers = extractAllEvenNumbers(nums);
        System.out.println(evenNumbers);

        //Answer 10
        boolean wordCheck = contains(food, "mango");
        System.out.println(wordCheck);

        //Answer 11
        int indexOfElement = getIndexByElement(food, "pie");
        System.out.println(indexOfElement);

        //Answer 12
        printOddNumbersInRange(7, 18);

        //Answer 13
        System.out.println(printGivenStringTimesNumberGiven(randomWord, 3));

        //Answer 14
        System.out.println(repeatFirstThreeLetters(randomWord, 2));

        //Answer 15
        System.out.println(wordsInAStringCounter(randomWord));

        //Answer 16
        int numberOfVowels = countVowels("Eugene");
        System.out.println(numberOfVowels);

        //Answer 17
        String[] swappedArray = swapFirstLastElements(food);
        System.out.println(Arrays.toString(swappedArray));


        //Answers 18
        String newString = replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer");
        System.out.println(newString);

        //Answer 19
        String wordPlay = replaceWuTangTwoThreeDivisible(randomWord);
        System.out.println(wordPlay);

        //Answer 20
        String fibonacciNumbers = createStringOfFibonnaciUpToMax(10);
        System.out.println(fibonacciNumbers);







    }

}
