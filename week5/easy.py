def sum_list(numbers):
    sum_of_numbers = 0

    for number in numbers:
        sum_of_numbers += number
    
    return sum_of_numbers

test_numbers = [1, 2, 3, 4, 100]

print(sum_list(test_numbers))
