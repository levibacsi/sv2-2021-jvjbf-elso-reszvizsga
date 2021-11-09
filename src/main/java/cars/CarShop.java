package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String shopName;
    private int maxCarPrice;
    List <Car> carsForSell = new ArrayList<>();

    public CarShop(String shopName, int maxCarPrice) {
        this.shopName = shopName;
        this.maxCarPrice = maxCarPrice;
    }

    public String getShopName() {
        return shopName;
    }

    public int getMaxCarPrice() {
        return maxCarPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    boolean addCar(Car car){
        if (car.getPrice() <= maxCarPrice){
            carsForSell.add(car);
            return true;
        } else {
            return false;
        }
    }

    int sumCarPrice(){
        int sumOfPrices = 0;
        for (Car cars: carsForSell){
            sumOfPrices += cars.getPrice();
        }
        return sumOfPrices;
    }

    int numberOfCarsCheaperThan(int price){
        int numberOfCarsCheaperThan = 0;
        for (Car cars: carsForSell) {
            if (cars.getPrice() <= price) {
                numberOfCarsCheaperThan++;
            }
        }
        return numberOfCarsCheaperThan;
    }

    List<Car> carsWithBrand(String brand){
        List<Car> carList = new ArrayList<>();
        for (Car cars: carsForSell) {
            if (cars.getBrand().equals(brand)){
                carList.add(cars);
            }
        }
        return carList;
    }
}
