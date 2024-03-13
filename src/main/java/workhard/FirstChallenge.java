package workhard;

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



    public static void main(String[] args) {

        String[] food = {"mango", "broccoli", "juice", "berrie", "pasta alfredo", "pie"};
        int[] nums = {20, 5, 8, 12, 15, 67, 24, 17};

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







    }

}
