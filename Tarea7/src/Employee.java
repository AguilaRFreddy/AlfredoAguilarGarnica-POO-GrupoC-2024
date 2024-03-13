import java.util.*;

// Clase que representa a un empleado
public class Employee {
    // Atributos de un empleado
    private String name;
    private int age;
    private double salary;
    private List<BankAccount> accounts; // Lista de cuentas bancarias asociadas al empleado

    // Constructor que inicializa un empleado con nombre, edad, salario y lista de cuentas
    public Employee(String name, int age, double salary, List<BankAccount> accounts) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.accounts = accounts;
    }

    // Constructor que inicializa un empleado con nombre, edad, salario y una cuenta
    public Employee(String name, int age, double salary, long accountNumber) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.accounts = accounts; //Se vincula a la lista accounts
    }

    // Constructor que inicializa un empleado con solo nombre
    public Employee(String name) {
        this.name = name;
    }
    
    // Getter y setter para el nombre del empleado
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter y setter para la edad del empleado con validación
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }

    // Getter y setter para el salario del empleado con validación
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salario no válido");
        }
    }

    // Getter para obtener las cuentas asociadas al empleado
    public List<BankAccount> getAccounts() {
        return accounts;
    }
    
    // Setter para establecer las cuentas asociadas al empleado
    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }
    
    // Método que devuelve información sobre el empleado
    public String getData() {
        return String.format("Nombre: ", this.getName());
    }
}
