import net.datafaker.Faker;


class Car {
    public static void main(String[] args) {

    }

    Faker faker = new Faker();
    String brand = faker.company().name();
    String model = faker.bothify("Model-#");
    int year = faker.number().numberBetween(1993, 2025);

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class User {
    String name;
    String email;

    User(Faker faker) {
        this.name = faker.name().fullName();
        this.email = " ";
    }

    User(Faker faker, boolean withEmail) {
        this.name = faker.name().fullName();
        this.email = faker.internet().emailAddress();
    }

    public void printUser() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class Student {
    private String name;
    private String grade;
    private int age;

    public String getName() {
        return name; }

    public void setName(String name) {
        this.name = name; }

    public int getAge() {
        return age; }
    public void setAge(int age) {
        this.age = age; }

    public String getGrade() {
        return grade; }
    public void setGrade(String grade) {
        this.grade = grade; }
}

class Calculator {
    public int multiply(int y, int x) {
        return y * x;
    }

    public int multiply(int y, int z, int x) {
        return y * z * x;
    }
}

class Book {
    String title;
    String author;
    int pages;

    Book(Faker faker) {
        this.title = faker.book().title();
        this.author = faker.book().author();
        this.pages = faker.number().numberBetween(3, 847);
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }
}

class BankAccount {
    double balance;

    BankAccount(Faker faker) {
        this.balance = faker.number().randomDouble(1, 0, 650);
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
        if (balance < 100) {
            System.out.println(" dabali");
        }
    }
}

class Product {
    double price;
    double discount;

    Product(Faker faker) {
        this.price = faker.number().randomDouble(1, 45, 4000);
        this.discount = faker.number().randomDouble(1, 85, 150);
    }

    public double finalPrice() {
        return price - discount;
    }
}

class Address {
    String street;
    String city;
    String country;

    Address(Faker faker) {
        this.street = faker.address().streetAddress();
        this.city = faker.address().city();
        this.country = faker.address().country();
    }
}

class UserWithAddress {
    String name;
    Address address;

    UserWithAddress(Faker faker) {
        this.name = faker.name().fullName();
        this.address = new Address(faker);
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.street + ", " + address.city + ", " + address.country);
    }
}

class StudentWithId {
    String name;
    String studentId;

    StudentWithId(Faker faker) {
        this.name = faker.name().fullName();
        this.studentId = faker.idNumber().valid();
    }

    @Override
    public boolean equals(Object obiect) {
        if (this == obiect) return true;
        if (obiect == null || getClass() != obiect.getClass()) return false;
        StudentWithId other = (StudentWithId) obiect;
        return this.studentId.equals(other.studentId);
    }
}

