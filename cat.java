package Task3;

class cat extends Animal {
    final int price = 200;

    public cat(String animalName, int age, String gender, double sellingPrice, double buyingPrice) {
        super(animalName, age, gender, sellingPrice, buyingPrice);
    }

    @Override
    public String toString() {
        return "cat{" +
                "price=" + price +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
