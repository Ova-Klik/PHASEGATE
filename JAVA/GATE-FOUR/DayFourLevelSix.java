public class DayFourLevelSix{

    public int[] countEvenOdd(int[] numbers){
        int countEven = 0;
        int countOdd = 0;

        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] % 2 == 0) countEven++;
            else countOdd++;
        }
            int[]evenOddLength ={countOdd, countEven};
        
        return evenOddLength;
    }


    public int[][] splitArrayIntoEvenAndOddArrays(int[] numbers){

        int[] counts = countEvenOdd(numbers);

        int[] oddArray = new int[counts[0]];
        int[] evenArray = new int[counts[1]];

        int oddIndex = 0;
        int evenIndex = 0;

        for(int index = 0; index < numbers.length; index++){

            if(numbers[index] % 2 == 0){
                evenArray[evenIndex++] = numbers[index];
            } else {
                oddArray[oddIndex++] = numbers[index];
            }
        }
            int [][]splittedArray = {oddArray,evenArray};
            
        return splittedArray;
    }
    
    public boolean checkArrayPalindrome(int[] numbers){
    
        int [] reverse = numbers;
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
            return reverse==numbers;
        
    }
    

    public boolean checkPerfectSquare(int number) {
        if (number < 0) return false;
        double squareRoot = Math.floor(number);
        return squareRoot== (int) squareRoot; 
    }

    public int[] getPerfectSquares(int[] numbers) {
        int count = 0;

        
        for (int number : numbers) {
            if (checkPerfectSquare(number)) count++;
        }

        int[] perfectSquares = new int[count];
        int index = 0;

        for (int number : numbers) {
            if (checkPerfectSquare(number)) {
                perfectSquares[index++] = number;
            }
        }

        return perfectSquares;
    }

    public int [] replaceNonPerfectSquaresElementWithMinus0ne(int []numbers) {
        
         for (int index = 0; index < numbers.length; index++) {
            if (!checkPerfectSquare(numbers[index])) {
                numbers[index] = -1;
            }
    }
        return numbers;
}

}



    
    


