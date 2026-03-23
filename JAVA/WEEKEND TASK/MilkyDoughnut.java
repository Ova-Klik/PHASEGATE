public class MilkyDoughnut{

    public int countEvenElements(int []numbers){
        int countEven=0;
        for(int index=0; index<numbers.length;index++){
        
            if(numbers[index]%2==0)countEven++;
        }
        return countEven;
    }
    
    
    public int getElementIndex(int []numbers, int element){
    
        for(int index=0; index<numbers.length; index++){
            if(numbers[index]==element)return index;
        }
        return -1;
    }
    
     public boolean checkPerfectSquare(int number){
    
            double squareRoot = Math.sqrt(number);
            if((int)squareRoot == squareRoot)return true;
        
            return false;
    }
    
    public int [] getFirstNPerfectSquares(int []numbers, int length){
    
        int count=0;
        
        for(int index=0; index<numbers.length;index++){
            if(count>=length)break;
            if(checkPerfectSquare(numbers[index])) count++;
            
        }
        
        int [] firstNperfectSquares = new int [count];
        int newIndex=0;
        for(int index=0; index<numbers.length;index++){
            
            if(newIndex>=count)break;
            if(checkPerfectSquare(numbers[index])){
                
              firstNperfectSquares[newIndex++] = numbers[index];
                    
            }
            
        }
        return firstNperfectSquares;
    }
    
    public boolean checkArrayEquals(int[]numbers, int[]numbers2){
        
        if(numbers.length==numbers2.length){
            
            for(int index=0;index<numbers.length;index++){
            
                if(!(numbers[index]==numbers2[index])) return false;
            }
            return true;
        }
        return false;
    }
    
    public int countDuplicateElement(int[]numbers){
        int count=0;
        for(int index =0; index<numbers.length-1; index++){
            int element = numbers[index];
            for(int check=index+1; check<numbers.length;check++){
            if(element== numbers[check]) count++;
        }
        }
        return count;
    }
    
    public int[] removeDuplicateElement(int[] numbers) {
        int count = countDuplicateElement(numbers);
        int[] noDuplicateElement = new int[numbers.length - count];

        int newIndex = 0;

        for (int index = 0; index < numbers.length; index++) {

            boolean isDuplicate = false;

            for (int check = 0; check < newIndex; check++){
                if (numbers[index] == noDuplicateElement[check]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                noDuplicateElement[newIndex++] = numbers[index];
            }
        }
        return noDuplicateElement;
    }

    public int getCountForElementsIn2DArray(int[][]numbers){
        int count=0;
        for(int row =0; row<numbers.length; row++){
            for(int column=0; column<numbers[row].length;column++){
            
                count++;
        }
    }
    return count;
}

    public int []copy2DArrayElementsIntoLinearArray(int[][]numbers){
        int count=getCountForElementsIn2DArray(numbers);
        int []flatArray=new int [count];
        int index=0;
        
        for(int row =0; row<numbers.length; row++){
            for(int column=0; column<numbers[row].length;column++){
            
               flatArray[index++]= numbers[row][column];
        }
    }   
    return flatArray;
    
    }

    public boolean isValidIntersectElement(int[] numbers, int[] numbers2, int index) {
        for (int counted = 0; counted < index; counted++) {
            if (numbers[index] == numbers[counted]) {
                return false;
            }
        }
        for (int check = 0; check < numbers2.length; check++) {
            if (numbers[index] == numbers2[check]) {
                return true;
            }
        }
        return false;
    }
    
    public int countIntersect(int[] numbers, int[] numbers2) {
        int count = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (isValidIntersectElement(numbers, numbers2, index)) {
                count++;
            }
        }

        return count;
}

    public int[] getIntersect(int[] numbers, int[] numbers2) {

        int count = countIntersect(numbers, numbers2);
        int[] intersect = new int[count];

        int newIndex = 0;

            for (int index = 0; index < numbers.length; index++) {
                if (isValidIntersectElement(numbers, numbers2, index)) {
                    intersect[newIndex++] = numbers[index];
                }
            }
            return intersect;
}
}
