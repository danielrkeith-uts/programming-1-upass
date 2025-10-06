letters = ['a', 'b', 'c', 'd', 'e']
vowels = ['a', 'e', 'i', 'o', 'u']
result = ""

for letter in letters:
    if letter not in vowels:
        result += letter

print(result)


