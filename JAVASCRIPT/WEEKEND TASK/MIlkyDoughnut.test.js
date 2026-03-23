const{
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

}= require('./MilkyDoughnut');

test('should return count of even elements', () =>{

    const numbers = [1,2,3,4,5,6];
    
    const actual = countEvenElements(numbers);
    const expected = 3;
    
    expect(actual).toEqual(expected);

});


test('should return 0 when Array Is Empty', () =>{

    const numbers = [];
    
    const actual = countEvenElements(numbers);
    const expected = 0;
    
    expect(actual).toEqual(expected);

    
});

test('should count negative even numbers', () =>{
    
    const numbers = [1,-2,3,-4,5,6,8,-12];
    
    const actual = countEvenElements(numbers);
    const expected = 5;
    
    expect(actual).toEqual(expected);

});

const milky = require('./MilkyDoughnut');

test('should return index of a searched element', () => {
    const numbers = [1, -2, 3, -4, 5, 6, 8, -12];
    const elementToSearch = 5;
    const expected = milky.getElementIndex(numbers, elementToSearch);
    const actual = 4;

    expect(actual).toBe(expected);
});

test('should return -1 when element is not found', () => {
    const numbers = [1, -2, 3, -4, 5, 6, 8, -12];
    const elementToSearch = 18;
    const expected = milky.getElementIndex(numbers, elementToSearch);
    const actual = -1;

    expect(actual).toBe(expected);
});

test('should return -1 when array is empty', () => {
    const numbers = [];
    const elementToSearch = 18;
    const expected = milky.getElementIndex(numbers, elementToSearch);
    const actual = -1;

    expect(actual).toBe(expected);
});

test('should return true if number is perfect square', () => {
    const number = 4;
    const expected = milky.checkPerfectSquare(number);

    expect(expected).toBe(true);
});

test('should return false if number is not perfect square', () => {
    const number = 5;
    const expected = milky.checkPerfectSquare(number);

    expect(expected).toBe(false);
});

test('should return array of first N perfect squares', () => {
    const numbers = [1,2,3,4,5,9,8,-12,12,-9];
    const firstNnumberOfPerfectSquare = 3;
    const expected = milky.getFirstNPerfectSquares(numbers, firstNnumberOfPerfectSquare);
    const actual = [1,4,9];

    expect(expected).toEqual(actual);
});

test('should return array of max available perfect squares if not up to requested number', () => {
    const numbers = [1,2,3,4,5,9,8,-12,12,-9];
    const firstNnumberOfPerfectSquare = 5;
    const expected = milky.getFirstNPerfectSquares(numbers, firstNnumberOfPerfectSquare);
    const actual = [1,4,9];

    expect(expected).toEqual(actual);
});

test('should return true when arrays are equal in length and value', () => {
    const numbers = [1,2,3,4,5,9,8,-12,12,-9];
    const numbers2 = [1,2,3,4,5,9,8,-12,12,-9];

    const expected = milky.checkArrayEquals(numbers, numbers2);

    expect(expected).toBe(true);
});

test('should return false when arrays are equal in length only', () => {
    const numbers = [1,2,3,4,5,9,8,-12,12,-9];
    const numbers2 = [1,2,3,4,5,9,1,10,12,-9];

    const expected = milky.checkArrayEquals(numbers, numbers2);

    expect(expected).toBe(false);
});

test('should count duplicate elements', () => {
    const numbers = [1,2,3,4,3,7,2];

    const expected = milky.countDuplicateElement(numbers);
    const actual = 2;

    expect(actual).toBe(expected);
});

test('should remove duplicate elements', () => {
    const numbers = [7,1,2,3,4,3,7,2,9];

    const expected = milky.removeDuplicateElement(numbers);
    const actual = [7,1,2,3,4,9];

    expect(expected).toEqual(actual);
});

test('should count elements in 2D array', () => {
    const numbers = [[1,2,3],[4,5,6],[7,8,9]];

    const expected = milky.getCountForElementsIn2DArray(numbers);
    const actual = 9;

    expect(actual).toBe(expected);
});

test('should return 2D array elements in a linear array', () => {
    const numbers = [[1,2,3],[4,5,6],[7,8,9]];

    const expected = milky.copy2DArrayElementsIntoLinearArray(numbers);
    const actual = [1,2,3,4,5,6,7,8,9];

    expect(expected).toEqual(actual);
});

test('should count intersect elements', () => {
    const numbers = [7,1,2,3,4,3,7,2,9];
    const numbers2 = [1,2,13,4,3,7,21,91];

    const expected = milky.countIntersect(numbers, numbers2);
    const actual = 5;

    expect(actual).toBe(expected);
});

test('should return array of intersect elements', () => {
    const numbers = [7,1,2,3,4,3,7,2,9];
    const numbers2 = [1,2,13,4,3,7,21,91];

    const expected = milky.getIntersect(numbers, numbers2);
    const actual = [7,1,2,3,4];

    expect(expected).toEqual(actual);
});
