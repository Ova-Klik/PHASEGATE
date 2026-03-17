print ("Kindly enter 5 numbers")
sum_of_numbers=0

for index in range (1,6,1):

    number=int(input(f"Kindly enter number {index}: "))
    sum_of_numbers +=number
    
print(f"The sum of the five numbers = {sum_of_numbers}") 
