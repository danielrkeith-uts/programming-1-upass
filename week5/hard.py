def collatz_steps(n: int) -> int:
    if n == 1:
        return 0
    
    if n % 2 == 0:
        return 1 + collatz_steps(n / 2)
    else:
        return 1 + collatz_steps(3 * n + 1)

print(collatz_steps(97))

