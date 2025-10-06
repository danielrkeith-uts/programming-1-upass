class Pair:
    def __init__(self, x, y=None):
        if y == None:
            y = x
        
        self.x = x
        self.y = y
    
    def get_x(self):
        return self.x

    def get_y(self):
        return self.y

    def get_sum(self):
        return self.x + self.y
    
    def difference(self):
        return abs(self.x - self.y)

    def product(self):
        return self.x * self.y

    def average(self):
        return (self.x + self.y) / 2

    def __str__(self):
        return f"Values: {self.x}, {self.y}"


if __name__ == '__main__':
    p = Pair(1.1, 3.3)

    print("x:", p.get_x())
    print("y:", p.get_y())

    print("Sum:", p.get_sum())
    print("Difference:", p.difference())
    print("Product:", p.product())
    print("Average:", p.average())

    print(p.__str__())

