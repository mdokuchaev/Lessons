package Lesson3;

public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(780, "Samsung");
        Phone phone3 = new Phone(645, "Nokia", 180);

        System.out.println(phone1.model);
        System.out.println(phone2.model);
        System.out.println(phone3.model);

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Vova");
        phone1.receiveCall("Vova", 789654);

    }
}
