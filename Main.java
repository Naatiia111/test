import net.datafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();

        // ამოცანა 1
        Car car = new Car();
        car.printInfo();

        // ამოცანა 2
        User user1 = new User(faker);
        User user2 = new User(faker, true);
        user1.printUser();
        user2.printUser();

        // ამოცანა 3
        Student student = new Student();
        student.setName(faker.name().firstName());
        student.setGrade("N");
        student.setAge(faker.number().numberBetween(17, 57));
        System.out.println(
                "Student: " + student.getName() + ", Age: " + student.getAge()
                        + ", Grade: " + student.getGrade());


        // ამოცანა 4
        Calculator calc = new Calculator();
        int y = faker.number().numberBetween(0, 100);
        int z = faker.number().numberBetween(0, 250);
        int x = faker.number().numberBetween(0, 467);
        System.out.println("Multiply 2: " + calc.multiply(y, z));
        System.out.println("Multiply 3: " + calc.multiply(y, z, x));

        // ამოცანა 5
        Book book = new Book(faker);
        System.out.println(book);

        // ამოცანა 6
        BankAccount account = new BankAccount(faker);
        account.checkBalance();

        // ამოცანა 7
        Product product = new Product(faker);
        System.out.println(" acount: " + product.finalPrice());

        // ამოცანა 8
        UserWithAddress userWithAddress = new UserWithAddress(faker);
        userWithAddress.printInfo();

        // ამოცანა 9
        StudentWithId s1 = new StudentWithId(faker);
        StudentWithId s2 = new StudentWithId(faker);
        System.out.println("Students  " + s1.equals(s2));
    }
}
