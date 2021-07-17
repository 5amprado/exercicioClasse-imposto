package exercicioClasse.imposto;

public class Teste {
    public static void main(String[] args) {
    Gerente gerente = new Gerente();
    gerente.setImposto(0.1);
    gerente.setSalario(2000);
    double gerenteimposto = gerente.calculaImposto();
    
    Supervisor supervisor = new Supervisor();
    supervisor.setImposto(0.05);
    supervisor.setSalario(1800);
    double supervisorimposto = supervisor.calculaImposto();

    Atendente atendente = new Atendente();
    atendente.setImposto(0.01);
    atendente.setSalario(1200);
    double atendenteimposto = atendente.calculaImposto();

    System.out.println("O gerente paga R$"+ gerenteimposto + " de impostos.");
    System.out.println("O supervisor paga R$"+ supervisorimposto + " de impostos.");
    System.out.println("O atendente paga R$"+ atendenteimposto + " de impostos.");


    }
}
