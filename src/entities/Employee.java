package entities;

public class Employee {
//nome. salario e taxa.
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){//void para retorno vazio
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString(){//toString para mudar o String padrao e String.format para mascarar e formata os numeros
        return name + ", $ " + String.format("%.2f", netSalary());
    }

}
