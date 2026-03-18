public class DayThreeFunction{


    public int [] modifyLengthOfAgivenArrayToSpecifiedLength(int [] numbers, int length){
    
   
        if(length<=0) return numbers;
        int [] newArray=new int [length];
        
        
            
            for(int index=0; index<newArray.length;index++){
            
                if(index<=numbers.length-1){
                  newArray[index] = numbers[index];
                  
            }else newArray[index] = -1;
            
            }
        return newArray;
    }
}
