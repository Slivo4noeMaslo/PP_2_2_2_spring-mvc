package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "X5"));
        carList.add(new Car("Audi", "A6"));
        carList.add(new Car("Lada", "Proira"));
        carList.add(new Car("Volkswagen", "Polo"));
        carList.add(new Car("Porshe", "911"));
    }

    @Override
    public List<Car> getCarList(int count) {
        if(count > 5 || count < 1) {
            return carList;
        }
        return new ArrayList<>(carList.subList(0, count));
    }
}
