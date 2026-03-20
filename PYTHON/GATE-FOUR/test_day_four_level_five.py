from unittest import TestCase
from day_four_level_five import *

class TestFile(TestCase):

    def test_that_array_function_returns_sorted_array_of_prime_numbers(self):
        numbers = [5, 9, 3, 6, 2]
        expected = [5, 3, 2]

        actual = get_sorted_prime_numbers(numbers)

        self.assertEqual(expected, actual)

    def test_that_array_function_replaces_all_negative_numbers_with_zero(self):
        numbers = [5, -9, 3, -6, 2, -11]
        expected = [5, 0, 3, 0, 2, 0]

        actual = replace_negative_elements_with_zero(numbers)

        self.assertEqual(expected, actual)

    def test_that_array_function_moves_all_zero_elements_to_end(self):
        numbers = [5, 0, 3, 0, 2, 0]
        expected = [5, 3, 2, 0, 0, 0]

        actual = move_zero_elements_to_end_of_array(numbers)

        self.assertEqual(expected, actual)

    def test_that_array_function_returns_common_elements(self):
        numbers = [45, 60, 3, 0, 67, 2, 45, 3, 22, 0]
        expected = [45, 3, 0]

        actual = get_common_elements(numbers)

        self.assertEqual(expected, actual)

