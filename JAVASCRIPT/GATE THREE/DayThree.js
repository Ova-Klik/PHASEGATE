
let length=5;
let numbers=[10,11,12]
let newArray= [5]

function(numbers, length){

    if(length<=0) return numbers;
            
            for(let index=0; index<newArray.length;index++){
            
                if(index<=numbers.length-1){
                  newArray[index] = numbers[index];
                  
            }else newArray[index] = -1;
            
            }
        return newArray;

}        
        
        
        
