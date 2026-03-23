//generate random numbers for first operand
//generate random number less than the range of first number for second operand
//display  first number minus second to the user
//collect user input as answer
//if the user is correct, add 1  to correct answer counter
// but if the user is wrong, try again one more time
// if the user is right at the second try, add 1 to correct count counter
// but if the user is wrong this time, add 1 to wrong count counter
// generate another question
// do the previous actions again until ten questions is generated
// add the correct answer counter together
//add the wrong counter counter together
//display the result to the user
//display how long it took the user to answer 10 questions 

const prompt = require('prompt-sync')();

let correctCount = 0;
let wrongCount = 0;
let operand1=0;
let operand2=0;


console.log("\n\tWELCOME TO SIMPLE SUBTRACTION ARITHMETIC APP\n");



for(let question=1; question<=10;question++){

operand1 = Math.floor(Math.random()*(10-20+1))+20;
operand2 = Math.floor(Math.random()*(5-10+1))+10;

    for(let trial=0; trial<2; trial++){
        
    console.log("Question number %d:", question);
    let answer=Number(prompt(`${operand1} - ${operand2} = `));
        if(answer==(operand1-operand2)){
            correctCount++;
            break;

        }else if(answer!=(operand1-operand2) && trial<2) continue;
        wrongCount++;
}
}

console.log("You got %d Questions out of 10: Congratulations",correctCount);





