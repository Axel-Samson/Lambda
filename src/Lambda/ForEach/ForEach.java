package Lambda.ForEach;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma Tradicional");
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        //processo flexivel para customizações, ex: add exclamações
        System.out.println("\nLambda #01...");
        aprovados.forEach(nome -> {System.out.println(nome + "!");});

        //processo automatizado, inflexivel para customizações
        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);

        //utilizando o método STATIC meuImprimir com lambda
        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome + " !"));

        System.out.println("\nMethod Reference02...");
        aprovados.forEach(ForEach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }

}
