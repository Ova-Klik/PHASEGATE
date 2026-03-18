

def day_three_string_task(word):


    count=0;
    newWord= "" 
        
    for(int index=0; index<word.length();index++){
        letter =word.textat(index)
        count++
        for(int check=index+1; check<word.length();check++){

            if(letter!= word.charAt(check)){
               
               break;
            }else{
             count++;
             index++;

            }

        newWord+=letter + String.valueOf(count);
        count=0;


        return newWord;

