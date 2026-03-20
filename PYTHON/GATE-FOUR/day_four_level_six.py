import math

def count_even_odd(numbers):
   
    count_even = sum(1 for n in numbers if n % 2 == 0)
    count_odd = len(numbers) - count_even
    return [count_odd, count_even]


def split_array_into_even_and_odd(numbers):
   
    odd_array = [n for n in numbers if n % 2 != 0]
    even_array = [n for n in numbers if n % 2 == 0]
    return [odd_array, even_array]


def check_array_palindrome(numbers):
   
    return numbers == numbers[::-1]


def check_perfect_square(number):
    
    if number < 0:
        return False
    sqrt = int(math.sqrt(number))
    return sqrt * sqrt == number


def get_perfect_squares(numbers):
    
    return [n for n in numbers if check_perfect_square(n)]


def replace_non_perfect_squares_with_minus_one(numbers):
   
    return [n if check_perfect_square(n) else -1 for n in numbers]


