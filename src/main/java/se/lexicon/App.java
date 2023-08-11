package se.lexicon;

/**
 * Employee Managment
 *
 */
public class App {
    public static void main(String[] args) {
        // Create a System Developer
        SystemDeveloper systemDev = new SystemDeveloper("Alice");
        systemDev.addCertificate();
        systemDev.addCertificate();
        systemDev.addLanguage();

        // Create a Sales Person
        SalesPerson salesPerson = new SalesPerson("Bob");
        salesPerson.addClient();
        salesPerson.addNewClient();

        // Print employee information
        System.out.println(systemDev); // Calls the overridden toString() in SystemDeveloper
        System.out.println(salesPerson); // Calls the overridden toString() in SalesPerson

        // Calculate and print salaries
        double systemDevSalary = systemDev.calculateSalary();
        double salesPersonSalary = salesPerson.calculateSalary();
        System.out.println("System Developer Salary: " + systemDevSalary);
        System.out.println("Sales Person Salary: " + salesPersonSalary);
    }
}


