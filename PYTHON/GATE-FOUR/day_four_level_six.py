import math

def count_even_odd(numbers):
   
    count_even = sum(1 for number in numbers if number % 2 == 0)
    count_odd = len(numbers) - count_even
    return [count_odd, count_even]


def split_list_into_even_and_odd(numbers):
   
    odd_list = [number for number in numbers if number % 2 != 0]
    even_list = [number for number in numbers if number % 2 == 0]
    return [odd_list, even_list]


def check_list_palindrome(numbers):
   
    return numbers == numbers[::-1]


def check_perfect_square(number):
    
    if number <=0:
        return False
    square_root = int(number ** 0.5)
    return square_root * square_root == number


def get_perfect_squares(numbers):
    
    return [number for number in numbers if check_perfect_square(number)]


def replace_non_perfect_squares_with_minus_one(numbers):
   
    return [number if check_perfect_square(number) else -1 for number in numbers]


