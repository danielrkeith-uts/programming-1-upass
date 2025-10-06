class IntWrapper:
    def __init__(self, value):
        self.value = value
    
    def get_value(self):
        return self.value
    
    def set_value(self, value):
        self.value = value
    
    def double_value(self):
        self.value *= 2


if __name__ == '__main__':
    iw = IntWrapper(3)
    print(iw.get_value())

    iw.set_value(5)
    print(iw.get_value())

    iw.double_value()
    print(iw.get_value())

