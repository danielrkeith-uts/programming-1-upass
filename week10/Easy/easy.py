class NoEException(Exception):
    def __str__(self):
        return "Word does not contain the letter e"


word = input()
if 'e' not in word:
    raise NoEException()
