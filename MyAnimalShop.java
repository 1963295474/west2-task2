package Task3;

import java.time.LocalDate;
import java.util.ArrayList;

class MyAnimalShop implements AnimalShop {
    //余额
    private double balance;
    //动物列表
    private ArrayList<Animal> animals;
    //顾客列表
    private ArrayList<Customer> customers;
    //是否营业
    private boolean isOpen;
    //开店时间
    private LocalDate localDate;
    //当天利润
    private double profit = 0;

    public MyAnimalShop(double balance, ArrayList<Animal> animals, ArrayList<Customer> customers, boolean isOpen, LocalDate localDate, double profit) {
        this.balance = balance;
        this.animals = animals;
        this.customers = customers;
        this.isOpen = isOpen;
        this.localDate = localDate;
        this.profit = profit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    @Override
    //买入动物
    public void buyNewAnimal(Animal animal) {
        if (balance - animal.buyingPrice >= 0) {
            balance = balance - animal.getBuyingPrice();
            animals.add(animal);
            profit = profit - animal.getBuyingPrice();
        } else {
            throw new InsufficientBalanceException("余额不足，无法买入该动物  账户余额为：" + balance + "," + animal.getAnimalName() + "的进价为：" + animal.getBuyingPrice());
        }

    }

    @Override
    //招待顾客
    public void treatCustomers(Customer customer, Animal animal) {
        if (!isOpen) {
            System.out.println("此时间不营业");
        } else {
            if (customers.contains(customer)) {
                customer.setNumberOfArrivals(customer.getNumberOfArrivals() + 1);
                customer.setArrivalTime(localDate);
            } else {

                customers.add(customer);
                customer.setNumberOfArrivals(customer.getNumberOfArrivals() + 1);
                customer.setArrivalTime(localDate);
            }

            if ((animals.contains(animal))) {
                System.out.println(animal.toString());
                balance = balance + animal.getSellingPrice();
                animals.remove(animal);
                if (customer.getArrivalTime().equals(localDate)) {
                    profit = profit + animal.getSellingPrice();
                }

            } else {
                throw new AnimalNotFoundException("店里不存在动物：" + animal.getAnimalName());
            }
        }
    }

    //歇业
    @Override
    public void closeShop() {
        System.out.println(localDate + "光顾的顾客如下：");
        for (Customer customer : customers) {
            if (customer.getArrivalTime().equals(localDate)) {
                System.out.println(customer.toString());

            }

        }
        System.out.println("今日利润 ： " + profit);
    }
}
