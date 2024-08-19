import models.Address;
import models.Converter;
import models.Employee;
import models.User;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex("01000");
        address.setCountry("Ukraine");
        address.setCity("Kyiv");
        address.setStreet("Street");
        address.setHouse("43");
        address.setApartment("11");
        System.out.println(address + "\n");

        System.out.println("'Converter' class in use:");
        Converter converter = new Converter(41.22d, 43.42d, 0.47d);
        System.out.println("\t" + converter.convert(Converter.Currency.UAH, Converter.Currency.EUR, 100));
        System.out.println("\t" + converter.convert(Converter.Currency.UAH, Converter.Currency.USD, 100));
        System.out.println("\t" + converter.convert(Converter.Currency.UAH, Converter.Currency.RUB, 100));
        System.out.println("\t" + converter.convert(Converter.Currency.USD, Converter.Currency.UAH, 100));
        System.out.println("\t" + converter.convert(Converter.Currency.EUR, Converter.Currency.UAH, 100));
        System.out.println("\t" + converter.convert(Converter.Currency.RUB, Converter.Currency.UAH, 100));
        System.out.println();

        System.out.println("'Employee' class demonstration:");
        Employee employee = new Employee("Vitaliy", "Verzun", Employee.JobTitle.JUNIOR_JAVA_DEVELOPER, 1);
        System.out.println("\t" + employee + "\n");

        System.out.println("'User' class in use:");
        User user = new User("username", "Vitaliy", "Verzun", 18);
        System.out.println("\t" + user);
    }
}