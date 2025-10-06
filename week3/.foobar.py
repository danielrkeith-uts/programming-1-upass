n = int(input())

if n % 2 == 0 and n % 3 == 0:
    print("foobar")
elif n % 2 == 0:
    print("foo")
elif n % 3 == 0:
    print("bar")

match n:
    case 0:
        print("zero")
    case 2 | 3 | 5 | 7 | 11:
        print("prime")

