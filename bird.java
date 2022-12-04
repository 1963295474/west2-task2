package Task3;

import java.time.LocalDate;

public class bird extends Animal{final int price = 150;

    public bird(String animalName, int age, String gender, double sellingPrice, double buyingPrice) {
        super(animalName, age, gender, sellingPrice, buyingPrice);
    }

    @Override
    public String toString() {
        return "bird{" +
                "price=" + price +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

//顾客类
