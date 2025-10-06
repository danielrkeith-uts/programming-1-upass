import math

class Coordinate:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def magnitude(self) -> float:
        return math.sqrt(self.x ** 2 + self.y ** 2)

    def distance_to(self, other) -> float:
        x_diff = self.x - other.x
        y_diff = self.y - other.y

        return math.sqrt(x_diff ** 2 + y_diff ** 2)
    
    def dot_product(self, other) -> float:
        return self.x * other.x + self.y * other.y

    def normalised(self):
        magnitude = self.magnitude()

        normalised_x = self.x / magnitude
        normalised_y = self.y / magnitude

        return Coordinate(normalised_x, normalised_y)

    def __str__(self):
        return f"({self.x}, {self.y})"        


if __name__ == '__main__':
    c1 = Coordinate(4, 3)
    c2 = Coordinate(3, 4)

    print(f"Magnitude of {c1}: {c1.magnitude()}")
    print(f"Distance from {c1} to {c2}: {c1.distance_to(c2)}")

    normalised_c1 = c1.normalised()
    print(f"{c1} normalised: {normalised_c1}")

