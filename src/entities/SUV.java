package entities;

public class SUV extends Car {

    private final String model;

    public SUV(String name, String color, Integer year) {
        super(name, color, year);
        this.model = "SUV";
    }

    public String getModel() {
        return model;
    }

    public void activateOffRoadMode() {
        System.out.println("Modo Off Road ativado");
    }

    @Override
    public String toString() {
        return getModel() + " -> " + super.toString();
    }
}
