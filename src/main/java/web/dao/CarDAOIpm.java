package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOIpm implements CarDAO {
    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<Car>();

        cars.add(new Car(++CARS_COUNT, "BMW", "Red"));
        cars.add(new Car(++CARS_COUNT, "VAZ", "Black"));
        cars.add(new Car(++CARS_COUNT, "GAZ", "White"));
        cars.add(new Car(++CARS_COUNT, "UAZ", "Green"));
        cars.add(new Car(++CARS_COUNT, "ZIL", "Blue"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCars(int count) {
        if (count > 0 && count <= cars.size()) {
            List<Car> carsCount = cars.stream().limit(count).toList();
            return carsCount;
        } else {
            return cars;
        }
    }
}
