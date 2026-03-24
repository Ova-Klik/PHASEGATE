from unittest import TestCase
from mini_parking_lot import *


class TestFile(TestCase):

    def test_that_parking_lot_has_20_slots(self):
    
        lot = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        
        expected = 20
        actual = count_parking_lot(lot)
        
        self.assertEqual(actual,expected)
        
        
    def test_that_parking_lot_is_empty(self):
    
        lot = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        
        expected = True;
        actual = check_all_lot_is_empty(lot)
        
        self.assertTrue(actual,expected)
        
    def test_that__lot_is_full(self):
    
        lot = [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
        
        expected = True;
        actual = check_that__lot_is_full(lot)
        
        self.assertTrue(actual,expected)
        
    def test_that_a_car_is_parked_by_sequence_when_lot_number_is_not_specified(self):
    
        lot = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        command = "assign";
        expected = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
        actual = car_is_parked_by_sequence_when_lot_number_is_not_specified(lot, command)
        
        self.assertEqual(actual,expected)

