num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

if num1 > num2:
    print(num1, "is the largest number")
elif num2 > num1:
    print(num2, "is the largest number")
else:
    print("Both numbers are equal")
