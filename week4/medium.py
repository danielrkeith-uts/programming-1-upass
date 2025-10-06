numbers = [1, 2, 3, 100, 200, 300, 42, -28]

for i in range(len(numbers)):
    print("The number in position " + str(i + 1) + " is " + str(numbers[i]))

average = sum(numbers) / len(numbers)
print("Average: " + str(average))
