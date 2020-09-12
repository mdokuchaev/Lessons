package Lesson3;

public class Phone {

    int number;
    String model;
    int weight;

    Phone() {

    }

    Phone(int number, String model) {

        this.number = number;
        this.model = model;
    }

    Phone(int number, String model, int weight) {

        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {

        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int phoneNumber) {

        System.out.println("Звонит " + name + ". Номер телефона: " + phoneNumber);
    }

    public int getNumber() {

        return number;
    }
}