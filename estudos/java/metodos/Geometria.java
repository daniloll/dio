package estudos.java.metodos;

public class Geometria {

    public static double calculaAreaQuadrilatero(double lado){
        return lado*lado;
    }

    public static double calculaAreaQuadrilatero(double ladoMaior, double ladoMenor){
        return ladoMaior * ladoMenor;
    }

    public static double calculaAreaQuadrilatero(double ladoMaior, double ladoMenor,double altura){
        return ((ladoMaior + ladoMenor)*altura) / 2;
    }
}
