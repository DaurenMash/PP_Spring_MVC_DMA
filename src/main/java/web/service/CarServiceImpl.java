package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> CarServiceList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Skoda", "Rapid", 2022));
        cars.add(new Car("Toyota", "Avensis", 2024));
        cars.add(new Car("Toyota", "Corolla", 2023));
        cars.add(new Car("Nissan", "Skyline", 1986));
        cars.add(new Car("Subaru", "Impreza", 1988));
        return cars;
    }


    @Override
    public List<Car> getCarsByCount(Integer count) {
        if ((count == null) || (count > CarServiceList().size())) {
            return CarServiceList();
        }
        else
            return CarServiceList().subList(0, count);

    }


}
