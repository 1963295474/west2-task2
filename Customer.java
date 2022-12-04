package Task3;

import java.time.LocalDate;

class Customer {
    private String name;
    private int numberOfArrivals;
    private LocalDate arrivalTime;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", numberOfArrivals=" + numberOfArrivals +
                ", arrivalTime=" + arrivalTime +
                '}';
    }

    public Customer(String name, int numberOfArrivals, LocalDate arrivalTime) {
        this.name = name;
        if (numberOfArrivals < 0) {
            System.out.println("不合理的输入,请重新输入正确的实参");
        } else {
            this.numberOfArrivals = numberOfArrivals;
        }

        if ((getNumberOfArrivals() == 0)) {
            //并未到过宠物店，没有到店时间
            this.arrivalTime = null;
        } else {
            this.arrivalTime = arrivalTime;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfArrivals() {
        return numberOfArrivals;
    }

    public void setNumberOfArrivals(int numberOfArrivals) {
        if (numberOfArrivals < 0) {
            System.out.println("请输入顾客正确的到店次数");
        } else {
            this.numberOfArrivals = numberOfArrivals;
        }
    }

    public LocalDate getArrivalTime() {

        return arrivalTime;
    }

    public void setArrivalTime(LocalDate arrivalTime) {
        if (getNumberOfArrivals() == 0) {
            this.arrivalTime = null;
        } else {
            this.arrivalTime = arrivalTime;
        }
    }
}


