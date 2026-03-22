
function countEvenOdd(numbers) {
    let countEven = 0;
    let countOdd = 0;

    for (let index= 0; index< numbers.length; index++) {
        if (numbers[index] % 2 === 0) countEven++;
        else countOdd++;
    }

    return [countOdd, countEven]; 
}


function splitArrayIntoEvenAndOdd(numbers) {
    const counts = countEvenOdd(numbers);
    const oddArray = new Array(counts[0]);
    const evenArray = new Array(counts[1]);

    let oddIndex = 0;
    let evenIndex = 0;

    for (let index= 0; index< numbers.length; index++) {
        if (numbers[index] % 2 === 0) {
            evenArray[evenIndex++] = numbers[index];
        } else {
            oddArray[oddIndex++] = numbers[index];
        }
    }

    return [oddArray, evenArray];
}


function checkArrayPalindrome(numbers) {
    const numberLength = numbers.length;
    for (let index= 0; index< Math.floor(numberLength / 2); index++) {
        if (numbers[index] !== numbers[numberLength - 1 - index]) return false;
    }
    return true;
}


function checkPerfectSquare(number) {
    if (number < 0) return false;
    const squareRoot = number**0.5;
    return (squareRoot*squareRoot) === number;
}


function getPerfectSquares(numbers) {
    let count = 0;
   
    for (let index= 0; index< numbers.length; index++) {
        if (checkPerfectSquare(numbers[index])) count++;
    }

    const perfectSquares = new Array(count);
    let perfectIndex = 0;
    for (let index= 0; index< numbers.length; index++) {
        if (checkPerfectSquare(numbers[index])) {
            perfectSquares[perfectIndex++] = numbers[index];
        }
    }

    return perfectSquares;
}


function replaceNonPerfectSquaresWithMinusOne(numbers) {
    const result = new Array(numbers.length);
    for (let index= 0; index< numbers.length; index++) {
        if (checkPerfectSquare(numbers[index])) {
            result[index] = numbers[index];
        } else {
            result[index] = -1;
        }
    }
    return result;
}

module.exports = {
    checkPerfectSquare,
    getPerfectSquares,
    checkArrayPalindrome,
    splitArrayIntoEvenAndOdd,
    countEvenOdd,
    replaceNonPerfectSquaresWithMinusOne
    
};

