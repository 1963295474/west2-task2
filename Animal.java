package Task3;

import java.time.LocalDate;

//动物抽象类
abstract class Animal {
    protected String animalName;
    protected int age;
    protected String gender;
    protected double sellingPrice;
    protected double buyingPrice;

    //子类继承父类时，若父类有无参构造方法（父类若有实参构造方法则默认不存在无参钩构造方法），则子类构造方法默认隐式调用父类无参构造方法，
    //当父类没有 无参构造方法,子类的构造方法必须显式调用父类的有参构造方法。
    public Animal(String animalName, int age, String gender, double sellingPrice, double buyingPrice) {
        this.animalName = animalName;
        this.age = age;
        this.gender = gender;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract String toString();

}

