public class ArrayDuplicate{

    public int countDuplicate(int [] numbers){
        
        int count=1;
        
        for(int index=0; index<numbers.length-1;index++){
            
            for(int check=index+1; check<numbers.length; check++){
            
                if(numbers[index]==numbers[check]) count++;
            }
        }
        return count;
            
    }
    
    public int []reomveDuplicate(int [] numbers){
        
        int []noDuplicate=new [number.length - (countDuplicate(numbers)];
        
        int newIndex=0;
        
        for(int index=0; index<numbers.length;index++){
            
            boolean isDu){
                
                    
                }
            }
        }
        return count;
            
    }
}
