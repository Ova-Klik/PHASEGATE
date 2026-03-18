from unittest import TestCase
from day_three_function import *

class TestFile(TestCase):

    def test_that_list_length_is_modified_with_minus_1_in_extra_positions(self):
    
        the_list = [10,11,12]
        length = 5
        
        expected = modify_length_of_a_given_array(the_list, length)
        actual = [10,11,12,-1,-1]
        
        self.assertEqual(expected, actual) 
        
    def test_that_list_of_given_length_shrinks_to_given_length_with_element_in_postion(self):
    
        the_list = [10,11,12,13,14]
        length = 2
        
        expected = modify_length_of_a_given_array(the_list, length)
        actual = [10,11]
        
        self.assertEqual(expected, actual) 
        
        
    def test_that_function_returns_specified_length_with_default_value_in_postion_when_empty_list_is_given(self):
    
        the_list = []
        length = 4
        
        expected = modify_length_of_a_given_array(the_list, length)
        actual = [-1,-1,-1,-1]
        
        self.assertEqual(expected, actual) 
        
    def test_that_function_returns_given_list_when_length_is_negative(self):
    
        the_list = [10,11,12,13,14]
        length = -4
        
        expected = modify_length_of_a_given_array(the_list, length)
        actual = [10,11,12,13,14]
        
        self.assertEqual(expected, actual)
        
    
    def test_that_function_returns_given_list_when_length_is_zero(self):
    
        the_list = [10,11,12,13,14]
        length = 0
        
        expected = modify_length_of_a_given_array(the_list, length)
        actual = [10,11,12,13,14]
        
        self.assertEqual(expected, actual)
