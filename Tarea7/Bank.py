
from typing import List


class Employee:
    def __init__(self, name, age=None, salary=None, accounts=None):
        self.name = name
        self.age = age
        self.salary = salary
        self.accounts = accounts if accounts is not None else []

    def add_account(self, account):
        self.accounts.append(account)

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_age(self):
        return self.age

    def set_age(self, age):
        if 18 <= age <= 65:
            self.age = age
        else:
            print("Edad no válida")

    def get_salary(self):
        return self.salary

    def set_salary(self, salary):
        if salary > 0:
            self.salary = salary
        else:
            print("Salario no válido")

    def get_accounts(self):
        return self.accounts

    def set_accounts(self, accounts):
        self.accounts = accounts

    def get_data(self):
        return f"Nombre: {self.name}"


class BankAccount:
    def __init__(self, account_number):
        self.account_number = account_number
        self.amount = 0.0
        self.account_type = ""
        self.employee_total_money = 0.0
        self.employee_add_money = 0.0
        self.employee_withdraw_money = 0.0

    def add_money(self):
        while True:
            account_type = self.get_account_type()
            if account_type in ['A', 'a']:
                while True:
                    print("Cantidad que deseas ingresar (máximo $50,000): ")
                    self.employee_add_money = float(input())
                    if self.employee_add_money > 50000:
                        print(
                            "Tu tipo de cuenta A no te permite ingresar más de $50,000")
                    else:
                        self.employee_total_money += self.employee_add_money
                        print("Se ha agregado: $", self.employee_add_money)
                        self.set_amount(self.employee_total_money)
                        break
            elif account_type in ['B', 'b']:
                while True:
                    print("Cantidad que deseas ingresar (máximo $100,000): ")
                    self.employee_add_money = float(input())
                    if self.employee_add_money > 100000:
                        print(
                            "Tu tipo de cuenta B no te permite ingresar más de $100,000")
                    else:
                        self.employee_total_money += self.employee_add_money
                        print("Se ha agregado: $", self.employee_add_money)
                        self.set_amount(self.employee_total_money)
                        break
            elif account_type in ['C', 'c']:
                print("Cantidad que deseas ingresar (máximo $100,000): ")
                self.employee_add_money = float(input())
                self.employee_total_money += self.employee_add_money
                print("Se ha agregado: $", self.employee_add_money)
                self.set_amount(self.employee_total_money)
            else:
                print("Cuenta inválida. Ingresa un tipo de cuenta válido (A, B o C)")

            if account_type in ['A', 'B', 'C', 'a', 'b', 'c']:
                break

    def withdraw_money(self):
        while True:
            account_type = self.get_account_type()
            if account_type in ['A', 'a']:
                while True:
                    print("Cantidad que deseas retirar (mínimo en cuenta $1,000): ")
                    self.employee_withdraw_money = float(input())
                    if self.employee_total_money < 1000:
                        print("No tienes cantidad suficiente para retirar.")
                    else:
                        self.employee_total_money -= self.employee_withdraw_money
                        print("Se ha retirado: $", self.employee_withdraw_money)
                        self.set_amount(self.employee_total_money)
                        break
            elif account_type in ['B', 'b']:
                while True:
                    print("Cantidad que deseas retirar (mínimo en cuenta $5,000): ")
                    self.employee_withdraw_money = float(input())
                    if self.employee_total_money < 5000:
                        print("No tienes cantidad suficiente para retirar.")
                    else:
                        self.employee_total_money -= self.employee_withdraw_money
                        print("Se ha retirado: $", self.employee_withdraw_money)
                        self.set_amount(self.employee_total_money)
                        break
            elif account_type in ['C', 'c']:
                while True:
                    print("Cantidad que deseas retirar (mínimo en cuenta $10,000): ")
                    self.employee_withdraw_money = float(input())
                    if self.employee_total_money < 10000:
                        print("No tienes cantidad suficiente para retirar.")
                    else:
                        self.employee_total_money -= self.employee_withdraw_money
                        print("Se ha retirado: $", self.employee_withdraw_money)
                        self.set_amount(self.employee_total_money)
                        break
            else:
                print("Cuenta inválida. Ingresa un tipo de cuenta válido (A, B o C)")

            if account_type in ['A', 'B', 'C', 'a', 'b', 'c']:
                break

    def get_account_type(self):
        return input("Ingrese el tipo de cuenta (A, B o C): ").upper()

    def set_account_type(self, account_type):
        self.account_type = account_type

    def get_account_number(self):
        return self.account_number

    def set_account_number(self, account_number):
        self.account_number = account_number

    def get_amount(self):
        return self.amount

    def set_amount(self, amount):
        self.amount = amount


class Employee:
    def __init__(self, name: str, age: int, salary: float, accounts: List[BankAccount] = None):
        self.name = name
        self.age = age
        self.salary = salary
        self.accounts = accounts if accounts is not None else []

    def add_account(self, account: 'BankAccount'):
        self.accounts.append(account)

    def get_name(self) -> str:
        return self.name

    def set_name(self, name: str):
        self.name = name

    def get_age(self) -> int:
        return self.age

    def set_age(self, age: int):
        if 18 <= age <= 65:
            self.age = age
        else:
            print("Edad no válida")

    def get_salary(self) -> float:
        return self.salary

    def set_salary(self, salary: float):
        if salary > 0:
            self.salary = salary
        else:
            print("Salario no válido")

    def get_accounts(self) -> List['BankAccount']:
        return self.accounts

    def set_accounts(self, accounts: List['BankAccount']):
        self.accounts = accounts

    def get_data(self) -> str:
        return f"Nombre: {self.name}"


class BankAccount:
    def __init__(self, account_number: int):
        self.account_number = account_number
        self.amount = 0.0
        self.account_type = ""

    def add_money(self):
        pass  # Implementa la lógica de agregar dinero

    def withdraw_money(self):
        pass  # Implementa la lógica de retirar dinero

    def set_account_type(self, account_type: str):
        self.account_type = account_type

    def get_account_number(self) -> int:
        return self.account_number

    def set_account_number(self, account_number: int):
        self.account_number = account_number

    def get_amount(self) -> float:
        return self.amount

    def set_amount(self, amount: float):
        self.amount = amount


if __name__ == "__main__":
    employees = []

    print("___________________________________________________________")

    op = 0
    while op != 2:
        employee = Employee(None, 0, 0, [])

        employee_name = input("Ingresar Nombre de Empleado: ")
        employee.set_name(employee_name)

        num_accounts = int(
            input(f"¿Cuántas cuentas desea agregar para {employee_name}?"))
        for _ in range(num_accounts):
            account_number = int(input("Ingresar Número de Cuenta: "))
            account_type = input(
                "Ingresar Tipo de Cuenta (A, B o C): ").upper()
            account = BankAccount(account_number)
            account.set_account_type(account_type)
            employee.add_account(account)

        employees.append(employee)

        op = int(input("\n¿Deseas agregar otro empleado? \n1.- Si  \n2.- No"))

    continue_op = 0
   
