package estudos.java.metodos;

public class Emprestimo {

    public static double simulaValorAPagar(double valorDoEmprestimo, int numeroDeMeses){
        double valorFinal;
        valorFinal = valorDoEmprestimo  + (valorDoEmprestimo * getTaxaDeJurosPorMes(24));

        return valorFinal;
    }

    private static double getTaxaDeJurosPorMes(int numeroDeMeses){

        double taxa = 0.00;

        if (numeroDeMeses <= 12){
            taxa = 0.03;
        }else if(numeroDeMeses > 12 && numeroDeMeses < 24){
            taxa = 0.09;
        }else if(numeroDeMeses >= 24){
            taxa = 0.15;
        }else{
            taxa = 0.05;
        }

        return taxa;
    }

}
