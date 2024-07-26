import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* 1° QUESTÃO - Escreva um algoritmo que leia um
        número inteiro positivo (x) e imprima todos os
        números de 1 até ele (x).

        byte x;
        System.out.println("Insira um número positivo para iniciar a contagem: ");
        x = scan.nextByte();

        if (x < 1) {
            System.out.println("O número que você digitou é um número negativo");
        }
        else if (x == 0) {
            System.out.println("O número 0 não é um número positivo");
        }
        else {
            for (byte contador = 1; contador <= x; contador++) {
                System.out.println(contador);
            }
        }*/

        /* 2° QUESTÃO - Crie um algoritmo que leia 5 notas
        de um aluno e calcule a média dessas notas.
        Em seguida, informe se o aluno está aprovado (média 6).

        float nota, media, somatorio = 0;
        byte x = 1; // usei essa variável para tudo

        while (x < 6) {
        System.out.print("Insira a " + x +"° nota: ");
        nota = scan.nextFloat();

        somatorio += nota;
        x++;
        }
        media = somatorio / (x - 1);

        System.out.println("A média da unidade é " + x);
        System.out.println("Sua nota final é " + media);
        if (media < x) {
            System.out.println("Você está reprovado!");
        }
        else {
            System.out.println("Você está aprovado!");
        }
        */

        /* 3° QUESTÃO - Desenvolva um algoritmo que leia um
        número inteiro e imprima a tabuada desse número de 1 a 10.

        byte num;

        System.out.print("Insira um número: ");
        num = scan.nextByte();

        for (int cont = 0; cont <= 10; cont++) {
            System.out.println(num + " x " + cont + " = " + num * cont);
        }
        */

        /* 4° QUESTÃO - Escreva um algoritmo que leia um
        número inteiro e calcule a soma de seus dígitos.
        Por exemplo, se a entrada for 123, a soma será 6 (1 + 2 + 3).

        int number, rest, sigma = 0;
        System.out.print("Insira um número: ");
        number = scan.nextInt();

        while (number > 0) {
            rest = number % 10;
            number = (number - rest) / 10;
            sigma += rest;
        }
        System.out.println("O somatório é " + sigma);
        */

        /* 5° QUESTÃO - Escreva um algoritmo que leia uma temperatura
        em graus Celsius e a converta para Fahrenheit.
        float C, F;

        System.out.print("Insira a temperatura em Graus Celsius: ");
        C = scan.nextInt();
        F = C * 9 / 5 + 32;
        System.out.println("Temperatura em Fahrenheit: " + F + "°F");
        */
    }
}