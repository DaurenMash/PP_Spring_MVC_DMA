package web.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }



}
