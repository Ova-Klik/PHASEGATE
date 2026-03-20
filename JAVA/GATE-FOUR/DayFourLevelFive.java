public class DayFourLevelFive{

    public int[] getSortedPrimeNumbers(int[] numbers){

    int count = 0;

    for(int index = 0; index < numbers.length; index++){

        boolean prime = true;

            for(int divisor = 2; divisor <= Math.sqrt(numbers[index]); divisor++){

                if(numbers[index] % divisor == 0 || numbers[index] <= 1){ 
                    prime = false;
                    break;
                }   
            }

        if(prime) count++;
    }

    int[] primeNumbers = new int[count];
    int primeIndex = 0;

    for(int index = 0; index < numbers.length; index++){

        boolean prime = true;

            for(int divisor = 2; divisor <= Math.sqrt(numbers[index]); divisor++){

                if(numbers[index] % divisor == 0 || numbers[index] <= 1){ 
                    prime = false;
                    break;
                }
            }

        if(prime){
            primeNumbers[primeIndex] = numbers[index];
           primeIndex++;
        }
    }
    getSortedArray(primeNumbers);
    return primeNumbers;
}
        
      public int[] getSortedArray(int[]numbers){
      
      
        for(int index=0; index<numbers.length-1;index++){
              int smallest = index;
              
              for(int count = index+1; count<numbers.length; count++){
                
                    if(numbers[count]>numbers[smallest])smallest=count;
              }  
              int temp = numbers[index];
              numbers[index] = numbers [smallest];
              numbers [smallest] = temp;
            
        }
        
        return numbers;
    }
    
     public int[] replaceNegativeElementsWithZero(int[]numbers){
      
      
        for(int index=0; index<numbers.length;index++){
             
             
                    if(numbers[index]<0){
                    
                    numbers[index]=0;
            }
        }
        
        return numbers;
    }
    
    public int[] moveZeroElementsToEndOfArray(int[]numbers){
      
        getSortedArray(numbers);
        
        return numbers;
    }
    
    public int[] getCommonElements(int[] numbers){

    int count = 0;

    for(int index = 0; index < numbers.length; index++){
        
        for(int compare = index + 1; compare < numbers.length; compare++){
            
            if(numbers[compare] == numbers[index]){
                count++;
                break;
            }
        }
    }

    int[] duplicateElement = new int[count];
    int newIndex = 0;

    for(int index = 0; index < numbers.length; index++){
        
        for(int compare = index + 1; compare < numbers.length; compare++){
            
            if(numbers[compare] == numbers[index]){
                duplicateElement[newIndex] = numbers[index];
                newIndex++;
                break;
            }
        }
    }

    return duplicateElement;
}
}

