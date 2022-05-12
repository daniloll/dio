package estudos.java.metodos;

public class Emprestimo {

    public static double simulaValorTotal(double valorDoEmprestimo, double taxaDeJuros, int numeroDeMeses){
        double valorFinal;
        valorFinal = valorDoEmprestimo * (Math.pow(1 + taxaDeJuros,numeroDeMeses));

        return valorFinal;
    }

    public static double simulaValorDaPrestacao(double valorBruto, int numeroDeMeses){

        return valorBruto/numeroDeMeses;
    }
}
