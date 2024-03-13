import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in); // Objeto Scanner para entrada del usuario
        ArrayList<Employee> employees = new ArrayList<>(); // Lista para almacenar empleados

       System.out.println("//////////////////////////////////////////////////////////////////");

        int op;
        do {
            Employee employee = new Employee(null, 0, 0, new ArrayList<>()); // Crear nuevo empleado

            // Obtener nombre del empleado
            System.out.println("Ingresar Nombre de Empleado: ");
            String employeeName = scanner.nextLine();
            employee.setName(employeeName);

            // Obtener cantidad de cuentas para el empleado
            System.out.println("¿Cuántas cuentas desea agregar para " + employeeName + "?");
            int numAccounts = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
            for (int i = 0; i < numAccounts; i++) {
                // Obtener detalles de la cuenta
                System.out.println("Ingresar Número de Cuenta: ");
                long accountNumber = scanner.nextLong();
                System.out.println("Ingresar Tipo de Cuenta (A, B o C): ");
                char accountType = scanner.next().charAt(0);
                scanner.nextLine(); // Limpiar el buffer de entrada
                // Crear y agregar la cuenta al empleado
                BankAccount account = new BankAccount(accountNumber);
                account.setAccountType(accountType);
                employee.getAccounts().add(account);
            }

            employees.add(employee); // Agregar empleado a la lista

            // Preguntar al usuario si desea agregar otro empleado
            System.out.println("\n¿Deseas agregar otro empleado? \n1.- Si  \n2.- No");
            op = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
        } while (op == 1);

        int continueOp;
        // Iterar mientras el usuario desee realizar operaciones
        do {
            // Mostrar lista de empleados disponibles
            System.out.println("Seleccione un empleado:");
            for (int i = 0; i < employees.size(); i++) {
                System.out.println((i+1) + ". " + employees.get(i).getName());
            }
            int selected = scanner.nextInt() - 1;
            scanner.nextLine(); // Limpiar el buffer de entrada
            Employee selectedEmployee = employees.get(selected); // Obtener el empleado seleccionado

            // Mostrar lista de cuentas del empleado seleccionado
            System.out.println("Seleccione una cuenta:");
            for (int i = 0; i < selectedEmployee.getAccounts().size(); i++) {
                BankAccount account = selectedEmployee.getAccounts().get(i);
                System.out.println((i+1) + ". Número de Cuenta: " + account.getAccountNumber() + ", Tipo de Cuenta: " + account.getAccountType() + ", Saldo: $" + account.getAmount());
            }
            int accountSelected = scanner.nextInt() - 1;
            scanner.nextLine(); // Limpiar el buffer de entrada
            BankAccount selectedAccount = selectedEmployee.getAccounts().get(accountSelected); // Obtener la cuenta seleccionada

            // Preguntar al usuario qué operación desea realizar
            System.out.println("¿Qué deseas hacer con la cuenta?");
            System.out.println("1.- Agregar Dinero");
            System.out.println("2.- Retirar Dinero");
            System.out.println("3.- Salir");
            op = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
            switch (op) {
                case 1:
                    selectedAccount.addMoney(); // Agregar dinero a la cuenta
                    System.out.println("Nuevo Saldo: $" + selectedAccount.getAmount());
                    break;
                case 2:
                    selectedAccount.withdrawMoney(); // Retirar dinero de la cuenta
                    System.out.println("Nuevo Saldo: $" + selectedAccount.getAmount());
                    break;
                case 3:
                    System.out.println("¡Adiós!"); // Salir del programa
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            // Preguntar al usuario si desea realizar otra operación
            System.out.println("¿Deseas realizar otra operación? \n1.- Sí  \n2.- No");
            continueOp = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            if (continueOp == 2) {
                System.out.println("¡Adiós!");
            }
        } while (continueOp == 1);
 }
}
/* En base al ejercicio del empleado y la cuenta bancaria,
 modificarlo para que ahora un empleado pueda tener múltiples cuentas bancarias,
  no solamente 1, además, incluir las siguientes opciones.

Opción para mostrar a todos los usuarios con su información
Opción mostrar la información de algún usuario en específico
Además, crear una clase llamad Banco, y que pueda almacenar
 todas las cuentas bancarias existentes en el sistema,
  y añadirle la opción para poder listar todas las cuentas existentes y
   alguna en específico.

Realizar el ejercicio utilizando un menú (en consola) 
para que el usuario pueda seguir usando el programa hasta que desee 
salir de el. */