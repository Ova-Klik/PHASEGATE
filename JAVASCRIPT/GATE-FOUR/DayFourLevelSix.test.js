const {
    getPerfectSquares,
    checkArrayPalindrome,
    splitArrayIntoEvenAndOdd,
    replaceNonPerfectSquaresWithMinusOne
} = require('./DayFourLevelSix');


test('should return numbers of odd and even elements contained', () => {
    const numbers = [45, 60, 3, 10, 9, 22];
    const expected = [3, 3];

    const actual = countEvenOdd(numbers);

    expect(actual).toEqual(expected);
});


test('should split array into even and odd arrays', () => {
    const numbers = [45, 60, 3, 10, 9, 22];
    const expected = [[45, 3, 9], [60, 10, 22]];

    const actual = splitArrayIntoEvenAndOdd(numbers);

    expect(actual).toEqual(expected);
});


test('should check if array is a palindrome', () => {
    const numbers = [45, 0, 8, 0, 45];
    const expected = true;

    const actual = checkArrayPalindrome(numbers);

    expect(actual).toBe(expected);
});


test('should return all perfect squares from array', () => {
    const numbers = [4, 7, 9, 10, 16, 18];
    const expected = [4, 9, 16];

    const actual = getPerfectSquares(numbers);

    expect(actual).toEqual(expected);
});


test('should replace non-perfect squares with -1', () => {
    const numbers = [4, 7, 9, 10, 49, 18];
    const expected = [4, -1, 9, -1, 49, -1];

    const actual = replaceNonPerfectSquaresWithMinusOne(numbers);

    expect(actual).toEqual(expected);
});
