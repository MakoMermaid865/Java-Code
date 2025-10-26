import java.util.Scanner;
import java.lang.Math;

public class CarValue {
    //Make the classes
    private int modelYear;
    private int purchasePrice;
    private int currentValue;

    public void setPurchasePrice(int price){
        purchasePrice = price;
    }

    public int getPurchasePrice(){
        return purchasePrice;
    }


    public void setModelYear(int year){
        modelYear = year;
    }
    public int getModelYear(){
        return modelYear;
    }
    public int getCurrentValue(){
        return currentValue;
    }

    public void calcCurrentValue(int currentYear){
        double depreciateRate = 0.15;
        int age = currentYear - modelYear;
        double value = purchasePrice * Math.pow(1.0 - depreciateRate, age);
        currentValue = (int) Math.round(value);
    }

    public void printInfo(){
        System.out.println("Car info:");
        System.out.println("Model year: " + modelYear);
        System.out.println("Purchase price: " + purchasePrice );
        System.out.println("Current valur: " + currentValue);

    }

public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    
    Car myCar = new Car();
    
    int userYear = scnr.nextInt();
    int userPrice = scnr.nextInt();
    int userCurrentYear = scnr.nextInt();

    myCar.setModelYear(userYear);
    myCar.setPurchasePrice(userPrice);
    myCar.calcCurrentValue(userCurrentYear);
    
    myCar.printInfo();
}
}
