

let number = 456;
let count=0;

while(number>0){

    newNumber=number%10;
    number=number/10;
    count++;
}
console.log("There are %d digits in the given number", count);

