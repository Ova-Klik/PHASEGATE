from unittest import TestCase
from day_three_string_task import *

class TestFile(TestCase):

    def test_that_function_returns_occurence(self):
    
        word= "AaaBBc"
        
        expected = string.getOccurence(word)
        actual = "A1a2B2c1"
        
        self.assertEqual(expected, actual)
