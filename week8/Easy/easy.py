class Vehicle():
    def __init__(self, number_of_wheels):
        self.number_of_wheels = number_of_wheels
    
    def drive(self):
        print("Vroom...")

    def get_number_of_wheels(self):
        return self.number_of_wheels


class Motorbike(Vehicle):
    def __init__(self):
        super().__init__(2)


class Car(Vehicle):
    def __init__(self):
        super().__init__(4)


class Truck(Vehicle):
    def __init__(self):
        super().__init__(6)


if __name__ == '__main__':
    vehicles = [Motorbike(), Car(), Truck()]

    for vehicle in vehicles:
        print(f"This vehicle has {vehicle.get_number_of_wheels()} wheels")
        vehicle.drive()

