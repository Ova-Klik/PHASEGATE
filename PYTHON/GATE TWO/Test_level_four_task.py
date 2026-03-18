from unittest import TestCase
from level_four_task import *


class TestFunction(TestCase):
    
    def test_that_sum_is_equal(self):
    
        expected = get_sum_of_numbers(4,6)
        actual = 10;
        
        self.assertEqual(actual,expected)
        
        
    def test_that_sum_of_a_negative_and_a_positive_number_is_equal(self):
    
        expected = get_sum_of_numbers(-4,6)
        actual = 2;
        
        self.assertEqual(actual,expected)
        
    def test_that_function_returns_true_when_number_is_even(self):

        expected = check_even(4)
        actual = True;
        
        self.assertEqual(actual,expected)
            
    def test_that_negative_number_is_even(self):
    
        expected = check_even(-4)
        actual = True;
        
        self.assertEqual(actual,expected)
        
        
    def test_that_square_of_a_number_is_equal(self):

        expected = get_square_of_number(4)
        actual = 16;
        
        self.assertEqual(actual,expected)
            
    def test_that_square_of_a_negative_number_is_equal(self):
    
        expected = get_square_of_number(-4)
        actual = 16;
        
        self.assertEqual(actual,expected)
        
    def test_that_function_returns_accurate_for_celcius_to_Fahrenheit_(self):
    
        expected = get_fahrenheit(0)
        actual = 32;
        
        self.assertEqual(actual,expected)
        
    def test_that_function_returns_accurate_for_negative_celcius_value_to_Fahrenheit_(self):
    
        expected = get_fahrenheit(-20)
        actual = -4;
        
        self.assertEqual(actual,expected)
        
    def test_that_number_is_prime_(self):
    
        expected = get_prime_number(13)
        actual = True;
        
        self.assertEqual(actual,expected)
        
    def test_that_number_one_is_not_prime_(self):
    
        expected = get_prime_number(1)
        actual = False;
        
        self.assertEqual(actual,expected)
        
    def test_that_number_one_not_prime_(self):
    
        expected = get_prime_number(10)
        actual = False;
        
        self.assertEqual(actual,expected)
        
        
    def test_that_function_returns_largest(self):
    
        expected = get_largest_number(10,4,5)
        actual = 10;
        
        self.assertEqual(actual,expected)
        
    def test_that_function_returns_largest_of_negative_number(self):
    
        expected = get_largest_number(-10,-0.4,-5)
        actual = -0.4;
        
        self.assertEqual(actual,expected)
        
        
    def test_that_simple_interest_is_accurate(self):
    
        expected = get_simple_interest(10000,0.5,2)
        actual =100;
        
        self.assertEqual(actual,expected)
        
        
    def test_that_function_returns_zero_with_negative_entry(self):
    
        expected = get_simple_interest(-10000,0.5,2)
        actual =0;
        
        self.assertEqual(actual,expected)
        
        
    def test_that_function_returns_reverse_of_number(self):
    
        expected = get_reverse_of_number(1234)
        actual =4321;
        
        self.assertEqual(actual,expected)
