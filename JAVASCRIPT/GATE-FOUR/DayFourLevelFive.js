function isPrime(number) {
    if (number <= 1) return false;

    for (let divisor = 2; divisor <= Math.sqrt(number); divisor++) {
        if (number % divisor === 0) return false;
    }

    return true;
}

function getSortedPrimeNumbers(numbers) {
    let primeNumbers = [];

    for (let number of numbers) {
        if (isPrime(number)) {
            primeNumbers.push(number);
        }
    }

    return getSortedArray(primeNumbers);
}

function getSortedArray(numbers) {
    for (let index = 0; index < numbers.length - 1; index++) {
        let largest = index;

        for (let count = index + 1; count < numbers.length; count++) {
            if (numbers[count] > numbers[largest]) {
                largest = count;
            }
        }

        let temp = numbers[index];
        numbers[index] = numbers[largest];
        numbers[largest] = temp;
    }

    return numbers;
}

function replaceNegativeElementsWithZero(numbers) {
    for (let index = 0; index < numbers.length; index++) {
        if (numbers[index] < 0) {
            numbers[index] = 0;
        }
    }
    return numbers;
}

function moveZeroElementsToEndOfArray(numbers) {
    let result = [];

    for (let number of numbers) {
        if (number !== 0) {
            result.push(number);
        }
    }

    let zeroCount = numbers.length - result.length;
    for (let i = 0; i < zeroCount; i++) {
        result.push(0);
    }

    return result;
}

function getCommonElements(numbers) {
    let duplicates = [];

    for (let index = 0; index < numbers.length; index++) {
        for (let compare = index + 1; compare < numbers.length; compare++) {
            if (
                numbers[index] === numbers[compare] &&
                !duplicates.includes(numbers[index])
            ) {
                duplicates.push(numbers[index]);
                break;
            }
        }
    }

    return duplicates;
}

module.exports = {
    getSortedPrimeNumbers,
    replaceNegativeElementsWithZero,
    moveZeroElementsToEndOfArray,
    getCommonElements
};
