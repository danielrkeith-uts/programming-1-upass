n = int(input("Enter a number: "))

words = []
for _ in range(n):
    word = input("Enter a " + str(n) + "-letter word: ")
    words.append(word)

for i in range(n):
    line = ""
    for j in range(n):
        line += words[j][i] + " "
    
    print(line)

