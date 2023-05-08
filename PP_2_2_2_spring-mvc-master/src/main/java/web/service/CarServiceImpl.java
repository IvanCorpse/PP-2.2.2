package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Ford", "black", "f1213f"));
        cars.add(new Car("BMW", "White", "a6543d"));
        cars.add(new Car("Ferrari", "red", "f77713w"));
        cars.add(new Car("Honda", "silver", "jf54f"));
        cars.add(new Car("Lada", "blue", "lf254f"));
    }

    @Override
    public List<Car> getCarList() {
        return cars;
    }

    @Override
    public List<Car> getCarList(int count) {
        return getCarList().stream().limit(count).toList();
    }
}
