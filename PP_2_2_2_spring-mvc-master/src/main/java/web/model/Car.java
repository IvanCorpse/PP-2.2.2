package web.model;

import org.springframework.stereotype.Component;

public class Car {
    private String model;
    private String colour;
    private String regNumber;

    public Car() {
    }

    public Car(String model, String colour, String regNumber) {
        this.model = model;
        this.colour = colour;
        this.regNumber = regNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "web.model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", regNumber=" + regNumber +
                '}';
    }
}
