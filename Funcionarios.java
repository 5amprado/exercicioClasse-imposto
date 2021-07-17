package exercicioClasse.imposto;

public class Funcionarios {
    private double salario;
    private double imposto;

    public void setImposto(Double imposto){

        this.imposto = imposto;
    }

    public double calculaImposto(){

        return this.salario * this.imposto;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }
    public double getSalario(){

        return salario;
    }
}
