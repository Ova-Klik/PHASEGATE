

number = int(input("Kindly enter number: "));
count=0;

while(number>0):

    newNumber=number%10;
    number=number//10;
    count+=1;

print(f"There are {count} digits in the given number");

