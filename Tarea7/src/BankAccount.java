import java.util.*;

// Clase que representa una cuenta bancaria
public class BankAccount {
    Scanner scanner = new Scanner (System.in); // Objeto Scanner para entrada del usuario
    // Atributos de una cuenta bancaria
    private long accountNumber;
    private double amount;
    private char accountType;
    private double employeeTotalMoney;
    private double employeeAddMoney;
    private double employeeWithdrawMoney;

    // Constructor que inicializa una cuenta bancaria con un número de cuenta
    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Método para agregar dinero a la cuenta
    public void addMoney() {
        do {
            switch (getAccountType()) {
                case 'A':
                case 'a':
                    do {
                        System.out.println("Cantidad que deseas ingresar (máximo $50,000): ");
                        employeeAddMoney = scanner.nextDouble();
                        if (employeeAddMoney > 50000) {
                            System.out.println("Tu tipo de cuenta A no te permite ingresar más de $50,000");
                        } else {
                            employeeTotalMoney = employeeTotalMoney + employeeAddMoney;
                            System.out.println("Se ha agregado: $" + employeeAddMoney);
                            setAmount(employeeTotalMoney);
                            break;
                        }
                    } while (true);
                    break;
                case 'B':
                case 'b':
                    do {
                        System.out.println("Cantidad que deseas ingresar (máximo $100,000): ");
                        employeeAddMoney = scanner.nextDouble();
                        if (employeeAddMoney > 100000) {
                            System.out.println("Tu tipo de cuenta B no te permite ingresar más de $100,000");
                        } else {
                            employeeTotalMoney = employeeTotalMoney + employeeAddMoney;
                            System.out.println("Se ha agregado: $" + employeeAddMoney);
                            setAmount(employeeTotalMoney);
                            break;
                        }
                    } while (true);
                    break;
                case 'C':
                case 'c':
                    System.out.println("Cantidad que deseas ingresar (máximo $100,000): ");
                    employeeAddMoney = scanner.nextDouble();
                    employeeTotalMoney = employeeTotalMoney + employeeAddMoney;
                    System.out.println("Se ha agregado: $" + employeeAddMoney);
                    setAmount(employeeTotalMoney);
                    break;
                default:
                    System.out.println("Cuenta inválida. Ingresa un tipo de cuenta válido (A, B o C)");
            }
        } while (getAccountType() != 'A' && getAccountType() != 'B' && getAccountType() != 'C' && getAccountType() != 'a' && getAccountType() != 'b' && getAccountType() != 'c');
    }

    // Método para retirar dinero de la cuenta
    public void withdrawMoney() {
        do {
            switch (getAccountType()) {
                case 'A':
                case 'a':
                    do {
                        System.out.println("Cantidad que deseas retirar (mínimo en cuenta $1,000): ");
                        employeeWithdrawMoney = scanner.nextDouble();
                        if (employeeTotalMoney < 1000) {
                            System.out.println("No tienes cantidad suficiente para retirar.");
                        } else {
                            employeeTotalMoney = employeeTotalMoney - employeeWithdrawMoney;
                            System.out.println("Se ha retirado: $" + employeeWithdrawMoney);
                            setAmount(employeeTotalMoney);
                            break;
                        }
                    } while (true);
                    break;
                case 'B':
                case 'b':
                    do {
                        System.out.println("Cantidad que deseas retirar (mínimo en cuenta $5,000): ");
                        employeeWithdrawMoney = scanner.nextDouble();
                        if (employeeTotalMoney < 1000) {
                            System.out.println("No tienes cantidad suficiente para retirar.");
                        } else {
                            employeeTotalMoney = employeeTotalMoney - employeeWithdrawMoney;
                            System.out.println("Se ha retirado: $" + employeeWithdrawMoney);
                            setAmount(employeeTotalMoney);
                            break;
                        }
                    } while (true);
                    break;
                case 'C':
                case 'c':
                    do {
                        System.out.println("Cantidad que deseas retirar (mínimo en cuenta $10,000): ");
                        employeeWithdrawMoney = scanner.nextDouble();
                        if (employeeTotalMoney < 1000) {
                            System.out.println("No tienes cantidad suficiente para retirar.");
                        } else {
                            employeeTotalMoney = employeeTotalMoney - employeeWithdrawMoney;
                            System.out.println("Se ha retirado: $" + employeeWithdrawMoney);
                            setAmount(employeeTotalMoney);
                            break;
                        }
                    } while (true);
                    break;
            }
        } while (getAccountType() != 'A' && getAccountType() != 'B' && getAccountType() != 'C' && getAccountType() != 'a' && getAccountType() != 'b' && getAccountType() != 'c');
    }

    // Getter y setter para el tipo de cuenta
    public char getAccountType() {
        return accountType;
    }

    public void setAccountType(char accountType) {
        this.accountType = accountType;
    }

    // Getter y setter para el número de cuenta
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter y setter para el saldo de la cuenta
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
