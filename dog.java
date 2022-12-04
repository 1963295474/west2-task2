package Task3;

class dog extends Animal {
    private boolean isVaccineInjected;
    final int price = 100;

    public dog(String animalName, int age, String gender, double sellingPrice, double buyingPrice, boolean isVaccineInjected) {
        super(animalName, age, gender, sellingPrice, buyingPrice);
        this.isVaccineInjected = isVaccineInjected;
    }

    public boolean isVaccineInjected() {
        return isVaccineInjected;
    }

    public void setVaccineInjected(boolean vaccineInjected) {
        isVaccineInjected = vaccineInjected;
    }


    @Override
    public String toString() {
        return "dog{" +
                "isVaccineInjected=" + isVaccineInjected +
                ", price=" + price +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}