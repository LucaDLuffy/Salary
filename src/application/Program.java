package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.printf("Name: ");
        emp.name = sc.nextLine();//usando o nextLine para pegar o nome e guarda no emp.name
        System.out.printf("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();//nextDouble para pegar o salario e guarda no emp.grossSalary
        System.out.printf("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.printf("");//aqui só pra pular uma linha mesmo
        System.out.printf("Employer" + emp);
        System.out.printf("");
        System.out.printf("Which percentage to increse Salary? ");
        double percentege = sc.nextDouble();//aqui criando a variavel para pegar a porcentagem
        emp.increaseSalary(percentege);//pegando o metodo de increaseSalary e aplicando em conjunto com a var de cima

        System.out.printf("");
        System.out.printf("Updated data: " + emp);
        sc.close();

    }
}
