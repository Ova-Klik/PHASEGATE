const prompt = require('prompt-sync')();


let name = prompt("Kindly enter your name: ");


let number1=Number(prompt("Kindly enter a number: "));
let number2=Number(prompt("Kindly enter another number: "));

sum= number1 + number2;

console.log(sum);
console.log(`${number1 + number2}`);
console.log(`Hello ${name}`);
