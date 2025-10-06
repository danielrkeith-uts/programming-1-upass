lines = []

with open("input/medium.in", 'r') as f:
    for line in f:
        lines.append(line.strip())

lines = lines[::-1]

for line in lines:
    print(line)

