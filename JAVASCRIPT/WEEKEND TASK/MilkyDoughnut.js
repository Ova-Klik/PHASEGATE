function countEvenElements(numbers){

let countEven=0;
    for(let index=0; index<numbers.length;index++){
    if(numbers[index]%2==0)countEven++;
}
    return countEven;

}

function getElementIndex(numbers, element) {
    for (let index = 0; index < numbers.length; index++) {
        if (numbers[index] === element) return index;
    }
    return -1;
}

function checkPerfectSquare(number) {
    if (number < 0) return false;
    const squareRoot = Math.sqrt(number);
    return squareRoot === Math.floor(squareRoot);
}

function getFirstNPerfectSquares(numbers, length) {
    let count = 0;
    for (let index = 0; index < numbers.length; index++) {
        if (count >= length) break;
        if (checkPerfectSquare(numbers[index])) count++;
    }

    const firstNperfectSquares = new Array(count);
    let newIndex = 0;
    for (let index = 0; index < numbers.length; index++) {
        if (newIndex >= count) break;
        if (checkPerfectSquare(numbers[index])) {
            firstNperfectSquares[newIndex++] = numbers[index];
        }
    }
    return firstNperfectSquares;
}

function checkArrayEquals(numbers, numbers2) {
    if (numbers.length !== numbers2.length) return false;
    for (let index = 0; index < numbers.length; index++) {
        if (numbers[index] !== numbers2[index]) return false;
    }
    return true;
}

function countDuplicateElement(numbers) {
    let count = 0;
    for (let index = 0; index < numbers.length - 1; index++) {
        const element = numbers[index];
        for (let check = index + 1; check < numbers.length; check++) {
            if (element === numbers[check]) count++;
        }
    }
    return count;
}

function removeDuplicateElement(numbers) {
    const count = countDuplicateElement(numbers);
    const noDuplicateElement = new Array(numbers.length - count);
    let newIndex = 0;

    for (let index = 0; index < numbers.length; index++) {
        let isDuplicate = false;
        for (let check = 0; check < newIndex; check++) {
            if (numbers[index] === noDuplicateElement[check]) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            noDuplicateElement[newIndex++] = numbers[index];
        }
    }
    return noDuplicateElement;
}

function getCountForElementsIn2DArray(numbers) {
    let count = 0;
    for (let row = 0; row < numbers.length; row++) {
        for (let column = 0; column < numbers[row].length; column++) {
            count++;
        }
    }
    return count;
}

function copy2DArrayElementsIntoLinearArray(numbers) {
    const count = getCountForElementsIn2DArray(numbers);
    const flatArray = new Array(count);
    let index = 0;

    for (let row = 0; row < numbers.length; row++) {
        for (let column = 0; column < numbers[row].length; column++) {
            flatArray[index++] = numbers[row][column];
        }
    }
    return flatArray;
}

function isValidIntersectElement(numbers, numbers2, index) {
    for (let counted = 0; counted < index; counted++) {
        if (numbers[index] === numbers[counted]) return false;
    }
    for (let check = 0; check < numbers2.length; check++) {
        if (numbers[index] === numbers2[check]) return true;
    }
    return false;
}

function countIntersect(numbers, numbers2) {
    let count = 0;
    for (let index = 0; index < numbers.length; index++) {
        if (isValidIntersectElement(numbers, numbers2, index)) count++;
    }
    return count;
}

function getIntersect(numbers, numbers2) {
    const count = countIntersect(numbers, numbers2);
    const intersect = new Array(count);
    let newIndex = 0;

    for (let index = 0; index < numbers.length; index++) {
        if (isValidIntersectElement(numbers, numbers2, index)) {
            intersect[newIndex++] = numbers[index];
        }
    }
    return intersect;
}


module.exports = {
    countEvenElements,
    getElementIndex,
    checkPerfectSquare,
    getFirstNPerfectSquares,
    checkArrayEquals,
    countDuplicateElement,
    removeDuplicateElement,
    getCountForElementsIn2DArray,
    copy2DArrayElementsIntoLinearArray,
    isValidIntersectElement,
    countIntersect,
    getIntersect
};


