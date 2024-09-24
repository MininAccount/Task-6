package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> getAllCars(){
        return carDAO.getAllCars();
    }

    @Override
    public List<Car> getCar(int count) {
        return carDAO.getCars(count);
    }
}
