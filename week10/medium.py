def product(numbers: list[int]) -> int:
    product = 1

    for number in numbers:
        product *= number
    
    return product


def main():
    numbers = []

    with open("input/medium.in", 'r') as f:
        for line in f:
            numbers.append(int(line))
    
    with open("output/medium.out", 'w') as f:
        f.write(f"Numbers: {numbers}\n")
        f.write(f"Product: {product(numbers)}\n")


if __name__ == '__main__':
    main()

