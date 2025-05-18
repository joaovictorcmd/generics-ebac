package entities;

public abstract class Car {
    private String name;
    private String brand;
    private String color;
    private Integer year;
    private Integer speed;

    public Car() {
    }

    public Car(String name, String color, Integer year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public void accelerate(int amount) {
        System.out.println("Speed = " + (speed + amount));
    }

    public void brake(int amount) {
        System.out.println("Speed = " + (speed - amount));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return getName() + " - " + getColor() + " - " + getYear();
    }
}
