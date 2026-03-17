

def get_sum_of_numbers(first_number, second_number):
   
    return first_number + second_number
    
    
def get_square_of_number(number):
    
    return number**2
    
def check_even(number):
    
    if number%2==0: return True
    return False
    
def get_fahrenheit(celcius):
    
    fahrenheit= celcius * (9/5) +32
    
    return fahrenheit
    
def get_prime_number(number):
    
    if(number==1): return False
    
    for divisor in range (2,number,1):
        
        if number%divisor==0:
            return False
        return True
        
def get_largest_number(number1, number2, number3):
    
    largest=number1
    if number2>largest: largest=number2
    if number3>largest: largest=number3
    
    return largest
    
    
def get_simple_interest(principal, rate, time):
    
    if(principal<=0 or rate<=0 or time<=0): return 0
    simple_interest= (principal * rate * time)/100
    
    return simple_interest
    
    
    

