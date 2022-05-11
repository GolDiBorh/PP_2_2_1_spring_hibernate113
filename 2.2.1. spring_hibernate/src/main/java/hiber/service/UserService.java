package hiber.service;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    void add(User user);


    List<Car> listCar();

    List<User> listUsers();


    User getUser1(String model, int  series);
}
