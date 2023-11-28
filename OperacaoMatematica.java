public class OperacaoMatematica {
    
    public double soma (double num1, double num2){
        return num1 + num2;
    }

    public double subracao (double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacao (double num1, double num2) {
        return num1 * num2;
    }

    public double divisao (double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Divisão por 0 não é permitida");
        }
    }
}
