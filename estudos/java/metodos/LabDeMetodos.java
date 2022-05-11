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


public class LabDeMetodos {

    public static void main(String[] args){

        System.out.println("Chamada do Método Soma");
        System.out.println(soma(2,2));

        System.out.println("Chamada do Método Substrai");
        System.out.println(subtrai(1024,512));

        System.out.println("Chamada do Método Divide");
        System.out.println(divide(100,2.5));

        System.out.println("Chamada do Método Multiplica");
        System.out.println(multiplica(2.5,4));

    }

}