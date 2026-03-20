const {
    getSortedPrimeNumbers,
    replaceNegativeElementsWithZero,
    moveZeroElementsToEndOfArray,
    getCommonElements
} = require('./DayFourLevelFive'); 


test('should return sorted array of prime numbers', () => {
    const numbers = [5, 9, 3, 6, 2];
    const expected = [5, 3, 2];

    const actual = getSortedPrimeNumbers(numbers);

    expect(actual).toEqual(expected);
});


test('should replace all negative numbers with zero', () => {
    const numbers = [5, -9, 3, -6, 2, -11];
    const expected = [5, 0, 3, 0, 2, 0];

    const actual = replaceNegativeElementsWithZero(numbers);

    expect(actual).toEqual(expected);
});


test('should move all zero elements to end of array', () => {
    const numbers = [5, 0, 3, 0, 2, 0];
    const expected = [5, 3, 2, 0, 0, 0];

    const actual = moveZeroElementsToEndOfArray(numbers);

    expect(actual).toEqual(expected);
});


test('should return common elements in an array', () => {
    const numbers = [45, 60, 3, 0, 67, 2, 45, 3, 22, 0];
    const expected = [45, 3, 0];

    const actual = getCommonElements(numbers);

    expect(actual).toEqual(expected);
});
