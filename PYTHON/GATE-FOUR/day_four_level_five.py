import math


def is_prime(number):

    if number <= 1:
        return False

    for divisor in range(2, int(math.sqrt(number)) + 1):
        if number % divisor == 0:
            return False

    return True


def get_prime_numbers(numbers):
 
    prime_numbers = []

    for number in numbers:
        if is_prime(number):
            prime_numbers.append(number)

    return prime_numbers


def sort_array_descending(numbers):
   
    for index in range(len(numbers) - 1):
        largest = index

        for count in range(index + 1, len(numbers)):
            if numbers[count] > numbers[largest]:
                largest = count

        numbers[index], numbers[largest] = numbers[largest], numbers[index]

    return numbers


def get_sorted_prime_numbers(numbers):
    
    prime_numbers = get_prime_numbers(numbers)
    return sort_array_descending(prime_numbers)


def replace_negative_elements_with_zero(numbers):
 
    for index in range(len(numbers)):
        if numbers[index] < 0:
            numbers[index] = 0

    return numbers


def move_zero_elements_to_end_of_array(numbers):
    
    result = []

    
    for number in numbers:
        if number != 0:
            result.append(number)

    
    zero_count = len(numbers) - len(result)
    result.extend([0] * zero_count)

    return result


def get_common_elements(numbers):
   
    duplicates = []

    for index in range(len(numbers)):
        for compare in range(index + 1, len(numbers)):
            if numbers[index] == numbers[compare] and numbers[index] not in duplicates:
                duplicates.append(numbers[index])
                break

    return duplicates
