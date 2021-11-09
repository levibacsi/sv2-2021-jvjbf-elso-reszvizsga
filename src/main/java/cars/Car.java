package cars;

public class Car {
    private String brand;
    private double engineSize;
    Color color;
    private int price;

    public Car(String brand, double engineSize, int price) {
        this.brand = brand;
        this.engineSize = engineSize;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public int getPrice() {
        return price;
    }

    public void decreasePrice(int percent){
        price = (int) (getPrice() * (percent / 100.0));
    }
}

