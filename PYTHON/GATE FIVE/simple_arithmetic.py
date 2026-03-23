#//generate random numbers for first operand
#//generate random number less than the range of first number for second operand
#//display  first number minus second to the user
#//collect user input as answer
#//if the user is correct, add 1  to correct answer counter
#// but if the user is wrong, try again one more time
#// if the user is right at the second try, add 1 to correct count counter
#// but if the user is wrong this time, add 1 to wrong count counter
#// generate another question
#// do the previous actions again until ten questions is generated
#// add the correct answer counter together
#//add the wrong counter counter together
#//display the result to the user
#//display how long it took the user to answer 10 questions 


import random;

correct=0;
wrong=0;

print("\tWELCOME TO SIMPLE SUBTRACTION ARITHMETIC APP\n");

for question in range(1,11):

    operand1 = 10 + random.randint(1,10);
    operand2 = random.randint(1, 10);
    
    for trial in range(2):
        
        answer=int(input(f"Question number {question}:\n {operand1} - {operand2} = "));
        
        if answer == (operand1 - operand2):
            correct+=1;
            break
        elif answer != (operand1 - operand2) and trial<2:
            continue;
            
        else:
            wrong+=1;  
            
print(f"You got {correct} Questions out of {question}: Congratulations");
