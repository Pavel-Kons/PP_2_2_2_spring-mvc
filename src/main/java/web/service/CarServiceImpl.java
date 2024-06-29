package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    public List<Car> getCars(int count) {
        List<Car> result = List.of(
                new Car(1L, "BMW", "Black"),
                new Car(2L, "Audi", "White"),
                new Car(3L, "Mercedes", "White"),
                new Car(4L, "Rolls Royce", "Red"),
                new Car(5L, "Lada", "White")
        );
        return result.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
