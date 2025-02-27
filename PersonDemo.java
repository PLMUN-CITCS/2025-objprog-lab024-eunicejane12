// Define the Person class
class Person {
    // Attributes with default access modifier (package-private by default)
    String name;
    int age;

    // Parameterized constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor to initialize name to "Unknown" and age to 0
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display person's details
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class to run the program
public class PersonDemo {
    public static void main(String[] args) {
        // Create a Person object using the parameterized constructor
        Person person1 = new Person("Bob", 30);

        // Create another Person object using the default constructor
        Person person2 = new Person();

        // Display the details of both Person objects
        person1.displayPerson();
        person2.displayPerson();
    }
}
