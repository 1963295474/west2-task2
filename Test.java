package Task3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();

        Animal dog1 = new dog("中华田园犬1", 1, "公", 100, 60, true);
        Animal dog2 = new dog("中华田园犬2", 1, "母", 100, 65, true);
        Animal cat1 = new cat("波斯猫1", 4, "母", 200, 100);
        Animal cat2 = new cat("蓝猫1", 0, "公", 200, 70);
        Animal bird1 = new bird("鹦鹉1", 4, "母", 150, 70);
        Animal bird2 = new bird("鹦鹉2", 2, "公", 150, 65);
        //添加动物店原有动物列表
        animals.add(dog1);
        animals.add(dog2);
        animals.add(cat1);
        animals.add(cat2);
        animals.add(bird1);
//我的宠物店
        MyAnimalShop myAnimalShop = new MyAnimalShop(100, animals, customers, true, LocalDate.parse("2022-11-21"), 0);
//顾客1
        Customer customer1 = new Customer("杨密", 0, LocalDate.parse("2022-11-21"));
        //顾客2
        Customer customer2 = new Customer("林卡罗", 1, LocalDate.parse("2022-11-21"));
//顾客1买入 dog2 中华田园犬2
        myAnimalShop.treatCustomers(customer1, dog2);
//顾客2也想买入 dog2 但已经卖完
        //myAnimalShop.treatCustomers(customer2, dog2);
        //顾客2重新购买 cat1 波斯猫1
        myAnimalShop.treatCustomers(customer2, cat1);
//宠物店买入鹦鹉2
        myAnimalShop.buyNewAnimal(bird2);
        //歇业
        myAnimalShop.closeShop();
    }
}
