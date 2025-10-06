def atbash_letter(letter: str) -> str:
    return chr(ord('a') + ord('z') - ord(letter))


def atbash_word(word: str) -> str:
    result = ""

    for letter in word:
        result += atbash_letter(letter)
    
    return result


def main():
    with open("input/hard.in", 'r') as reader, open("output/hard.out", 'w') as writer:
        is_next_line_encoded = False

        for line in reader:
            raw_word = line.strip()
            processed_word = atbash_word(raw_word) if is_next_line_encoded else raw_word
            writer.write(processed_word + '\n')

            is_next_line_encoded = not is_next_line_encoded



if __name__ == '__main__':
    main()


