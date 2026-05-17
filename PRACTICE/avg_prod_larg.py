num_one = int(input("Enter first number "))
num_two= int(input("Enter second number "))
num_three= int(input("Enter third number"))

average = (num_one + num_two + num_three)/3

product = num_one * num_two * num_three


largest = num_one
if(num_two > num_one and num_two > num_three):
    largest = num_two    
    
elif(num_three > num_one and num_three > num_two):
    largest = num_three
    
else:
    print("Error")
    

print("Avergae of numbers is: ", average)
print("Product of numbers is: ", product)
print("Largest of numbers is: ", largest)
