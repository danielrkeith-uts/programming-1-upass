from abc import ABC, abstractmethod

class Ticket(ABC):
    @abstractmethod
    def get_price(self):
        pass


class MovieTicket(Ticket):
    def __init__(self, movie, price):
        self.movie = movie
        self.price = price
    
    def get_price(self):
        return self.price
    
    def __str__(self):
        return f"Movie: {self.movie} (${self.get_price()})"


class PlaneTicket(Ticket):
    PRICE_PER_KM = 0.4

    def __init__(self, flight_code, distance_in_km):
        self.flight_code = flight_code
        self.distance_in_km = distance_in_km
    
    def get_price(self):
        return self.distance_in_km * PlaneTicket.PRICE_PER_KM

    def __str__(self):
        return f"Flight {self.flight_code} (${self.get_price()})"


if __name__ == '__main__':
    movie_ticket = MovieTicket("The Darjeeling Limited", 50)
    plane_ticket = PlaneTicket("F014", 15000)

    print(movie_ticket)
    print(plane_ticket)

