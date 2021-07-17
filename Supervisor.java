package exercicioClasse.imposto;

public class Supervisor extends Funcionarios{
    private double salario;
    private double imposto;

    public void setImposto(double imposto){
        this.imposto = imposto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calculaImposto() {
        return this.salario * this.imposto;
    }
}

