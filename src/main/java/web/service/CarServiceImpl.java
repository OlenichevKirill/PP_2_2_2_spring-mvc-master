package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1L, "model1", 1));
        cars.add(new Car(2L, "model2", 2));
        cars.add(new Car(3L, "model3", 3));
        cars.add(new Car(4L, "model4", 4));
        cars.add(new Car(5L, "model5", 5));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 1 || count > 4) {
            return cars;
        } else {
            return cars.stream().limit(count).toList();
        }
    }
}
