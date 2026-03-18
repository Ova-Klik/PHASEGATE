public class DayThreeStringTask{

    
    
    public String getOccurence(String word){
    int count=0;
//    String word="AaaBBc";
    String newWord= ""; 
    
    for(int index=0; index<word.length();index++){
        char letter =word.charAt(index);
        count++;
        for(int check=index+1; check<word.length();check++){
            
            if(letter!= word.charAt(check)){
               
               break;
            }else{
             count++;
             index++;
            
            }
        }
        newWord+=letter + String.valueOf(count);
        count=0;
        
    }
    return newWord;
    }
    
    
    
    
    
    
    
    
    
    
    
    
//        for(int index=0; index<word.length(); index++){
//            char letter = word.charAt(index);
//            
//           while(letter == word.charAt(index)){
//           
//             count++;
//             index++;
//           }
//           newWord+=letter + String.valueOf(count);
//           count=0;           
//          
//    } 
//        return newWord;
//}
}
