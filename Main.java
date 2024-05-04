import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Zbigniew Kar", 45);
            people[2] = new Person("Bartek Po", 46);
            people[3] = new Person("Klara Baran", 25);
            people[4] = new Person("Filip Kuma", 26);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age provided: " + e.getMessage());
        }

        EmailMessenger emailMessenger = new EmailMessenger();

        for (Person person : people) {
            if (person != null) {
                int value = MathUtils.add(person.getAge(), b);
                emailMessenger.sendMessage("Hello " + person.getName() + ", the value is: " + value);
            }
        }
    }
}