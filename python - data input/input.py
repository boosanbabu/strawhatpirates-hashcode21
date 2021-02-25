file = open('a.txt')
file = file.readlines()
first_line = file[0].split()


duration_simulation = first_line[0]
num_intersections = first_line[1]
num_streets = first_line[2]
num_cars = first_line[3]
bonus_points = first_line[4]


cars = []
streets = []
street_intersections = {}
street_time = {}
car_route = {}


for street_info in range(1, int(num_streets)+1):
    streets.append(file[street_info])

for car_info in range(int(num_streets)+1, len(file)):
    cars.append(file[car_info])

for street in streets:
    street = street.split()
    street_intersections[street[2]] = [int(street[0]), int(street[1])]
    street_time[street[2]] = int(street[-1])

for l in range(len(cars)):
    car = cars[l]
    car = car.split()
    num_route = int(car[0])
    list_routes = []
    for route in range(1, num_route):
        list_routes.append(car[route])
    car_route['car'+str(l+1)] = list_routes
