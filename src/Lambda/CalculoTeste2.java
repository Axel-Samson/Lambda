package Lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {
    public static void main(String[] args) {
        //interface BinaryOperator substitui a classe
        //definindo o Calculo Lembrar-se de definir
        //o tipo de parametro
        //ex: double com 2.2 INTeger com 1

        BinaryOperator<Double> calculo = (x, y) -> {
            return x + y;
        };
        System.out.println(calculo.apply(2.0, 3.0));



        BinaryOperator<Integer> calculo2 = (x, y) -> {
            return x + y;
        };
        System.out.println(calculo2.apply(2, 3));

        calculo = (x, y) -> x * y;
        System.out.println(calculo2.apply((int) 3, (int) 3));
    }
}

