package entities;

public class Sedan extends Car {

    private final String model;

    public Sedan(String name, String color, Integer year) {
        super(name, color, year);
        this.model = "Sedan";
    }

    public String getModel() {
        return model;
    }

    public void enableEconomicMode() {
        System.out.println("Modo econômico ativado");
    }

    @Override
    public String toString() {
        return getModel() + " -> " + super.toString();
    }
}
