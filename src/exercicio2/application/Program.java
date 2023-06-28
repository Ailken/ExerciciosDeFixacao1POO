package exercicio2.application;

import exercicio2.Entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    //Fazer um programa para ler os dados de um funcionario (nome, salario bruto e imposto).
    //em seguida, mostrar os dados do funcionario (nome e salario liquido)
    //em seguida aumentar o salario do funcionario com base em uma porcentaagem dada (somente o salario bruto é afetado pela porcentagem)
    //e mostrar novamente os dados do funcionario.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Name: ");
        emp.name = sc.nextLine();
        System.out.println("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);

        sc.close();
    }
}
