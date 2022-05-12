/************************************************************************************************
Exercicio sobre Metodos
Esta classe foi criada com o intuito de auxiliar na resolucao de exercicio de criacao de metodos

Autor: DaniloLL
Data: 11/05/2022
 *************************************************************************************************/
package estudos.java.metodos;

import static estudos.java.metodos.Operacoes.soma;
import static estudos.java.metodos.Operacoes.subtrai;
import static estudos.java.metodos.Operacoes.divide;
import static estudos.java.metodos.Operacoes.multiplica;

import static estudos.java.metodos.Emprestimo.simulaValorAPagar;


public class LabDeMetodos {

    public static void main(String[] args){

        double valorBrutoTotal;

        System.out.println("=======================================================================================");
        System.out.println("                              Exercicio Calculadora                                    ");
        System.out.println("=======================================================================================");

        System.out.println(soma(2,2));
        System.out.println(subtrai(1024,512));
        System.out.println(divide(100,2.5));
        System.out.println(multiplica(2.5,4));




        System.out.println("=======================================================================================");
        System.out.println("                                  Exercicio Mensagem                                   ");
        System.out.println("=======================================================================================");

        Mensagem.cumprimentar(3);
        Mensagem.cumprimentar(9);
        Mensagem.cumprimentar(15);
        Mensagem.cumprimentar(19);




        System.out.println("=======================================================================================");
        System.out.println("                           Exercicio calculo de Emprestimo                             ");
        System.out.println("=======================================================================================");

        System.out.print("Valor a pagar: R$");
        System.out.printf("%.2f", simulaValorAPagar(10000, 24));


        System.out.println("=======================================================================================");
        System.out.println("                              Exercicio Sobrecarga                                     ");
        System.out.println("=======================================================================================");

        System.out.println("Area do quadrado: " + Geometria.calculaAreaQuadrilatero(2));
        System.out.println("Area do quadrado: " + Geometria.calculaAreaQuadrilatero(2,3));
        System.out.println("Area do quadrado: " + Geometria.calculaAreaQuadrilatero(2,3,5));


    }

}
