public class Calculadora {

    private OperacaoMatematica operacaoMatematica;

    public Calculadora() {
        this.operacaoMatematica = new OperacaoMatematica();
    }

    public double soma(double num1, double num2) {
        return operacaoMatematica.soma(num1, num2);
    }

    public double subracao(double num1, double num2) {
        return operacaoMatematica.subracao(num1, num2);
    }

    public double multiplicacao(double num1, double num2) {
        return operacaoMatematica.multiplicacao(num1, num2);
    }

    public double divisao(double num1, double num2) {
        return operacaoMatematica.divisao(num1, num2);
    }
}