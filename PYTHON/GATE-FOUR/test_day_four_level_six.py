from unittest import TestCase
from day_four_level_six import *


class TestFile(TestCase):

    def test_that_function_count_even_and_odd_element(self):
        numbers = [45, 60, 3, 10, 9, 22]
        expected = [3, 3]  
        result = count_even_odd(numbers)
        self.assertEqual(result, expected)

    def test_that_function_splits_list_into_even_and_odd(self):
        numbers = [45, 60, 3, 10, 9, 22]
        expected = [[45, 3, 9], [60, 10, 22]]  
        result = split_list_into_even_and_odd(numbers)
        self.assertEqual(result, expected)

    def test_that_function_checks_list_for_palindrome(self):
        numbers = [45, 0, 8, 0, 45]
        expected = True
        result = check_list_palindrome(numbers)
        self.assertEqual(result, expected)

    def test_that_function_returns_perfect_square_element(self):
        numbers = [4, 7, 9, 10, 16, 18]
        expected = [4, 9, 16]
        result = get_perfect_squares(numbers)
        self.assertEqual(result, expected)

    def test_that_function_replace_non_perfect_squares_with_minus_one(self):
        numbers = [4, 7, 9, 10, 49, 18]
        expected = [4, -1, 9, -1, 49, -1]
        result = replace_non_perfect_squares_with_minus_one(numbers)
        self.assertEqual(result, expected)

