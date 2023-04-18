package week7;

class Car {
    String color; int speed; int gear;
    @Override
    public String toString() {
        return "Car [color=" + color + ", speed= " + speed + ", gear= " + gear + "]";
    }
    void setColor(String c) { this.color = c; }
    void speedUp() { this.speed += 10; }
    void speedDown() { this.speed -= 10;  }
    void changeGear(int g) { this.gear = g;}
}


public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setColor("red");
        myCar.changeGear(1);
        myCar.speedUp();
        System.out.println(myCar);

        Car yourCar = new Car();
        yourCar.setColor("yellow");
        yourCar.changeGear(1);
        yourCar.speedDown();
        System.out.println(yourCar);
    }
}
