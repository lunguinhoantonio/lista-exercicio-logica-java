import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* 1° QUESTÃO
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

        /* 2° QUESTÃO
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

        /* 3° QUESTÃO
        byte num;

        System.out.print("Insira um número: ");
        num = scan.nextByte();

        for (int cont = 0; cont <= 10; cont++) {
            System.out.println(num + " x " + cont + " = " + num * cont);
        }
        */

        /* 4° QUESTÃO
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

        /* 5° QUESTÃO
        float C, F;
        System.out.print("Insira a temperatura em Graus Celsius: ");
        C = scan.nextInt();
        F = C * 9 / 5 + 32;
        System.out.println("Temperatura em Fahrenheit: " + F + "°F");
        */
    }
}