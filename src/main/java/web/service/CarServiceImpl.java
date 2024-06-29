package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    public List<Car> getCars() {
//        List<Car> carArray = new ArrayList<>();
//        Car car = new Car(1L, "BMW", "red");
//        Car car2 = new Car(2L, "BMW", "red");
//        Car car3 = new Car(3L, "BMW", "red");
//        Car car4 = new Car(4L, "BMW", "red");
//        Car car5 = new Car(5L, "BMW", "red");
        return List.of(
                new Car(1L, "BMW", "red"),
                new Car(2L, "BMW", "red"),
                new Car(3L, "BMW", "red"),
                new Car(4L, "BMW", "red"),
                new Car(5L, "BMW", "red")
        );
    }
}
