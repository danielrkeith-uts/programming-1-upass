def is_prime(num: int) -> bool:
    if num < 2:
        return False
    
    for i in range(2, num):
        if num % i == 0:
            return False
    
    return True


def largest_prime_under(num: int) -> int:
    for i in range(num, 1, -1):
        if is_prime(i):
            return i
    
    # No primes under this number?
    return -1

print(largest_prime_under(1_000_000))

