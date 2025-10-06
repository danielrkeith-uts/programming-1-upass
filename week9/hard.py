lines = []

with open("input/hard.in", 'r') as f:
    for line in f:
        lines.append(line.strip())

lines = lines[::-1]

for i in range(len(lines)):
    lines[i] = lines[i][::-1]

for line in lines:
    print(line)

