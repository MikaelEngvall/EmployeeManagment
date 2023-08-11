package se.lexicon;

class Employee {
    protected String name;
    protected double baseSalary;
    protected int certificates;
    protected int languages;
    protected int clientsMaintained;
    protected int newClientsAcquired;

    public Employee(String name) {
        this.name = name;
        this.baseSalary = 25000;
        this.certificates = 0;
        this.languages = 0;
        this.clientsMaintained = 0;
        this.newClientsAcquired = 0;
    }

    public void addCertificate() {
        certificates++;
    }

    public void addLanguage() {
        languages++;
    }

    public void addClient() {
        clientsMaintained++;
    }

    public void addNewClient() {
        newClientsAcquired++;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", Salary: " + calculateSalary();
    }
}

class SystemDeveloper extends Employee {
    public SystemDeveloper(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + certificates * 1000 + languages * 1500;
    }

    @Override
    public String toString() {
        return "System Developer: " + name + ", Salary: " + calculateSalary() +
                ", Certificates: " + certificates + ", Languages: " + languages;
    }
}

class SalesPerson extends Employee {
    public SalesPerson(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + clientsMaintained * 500 + newClientsAcquired * 1000;
    }

    @Override
    public String toString() {
        return "Sales Person: " + name + ", Salary: " + calculateSalary() +
                ", Clients Maintained: " + clientsMaintained + ", New Clients Acquired: " + newClientsAcquired;
    }
}
