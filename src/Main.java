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

        /* 6° QUESTÃO - Faça um código que imprima todos os números
        de 1 a 100, e quando chegar a 100, exibir todos os números
        de 100 a 1.

        short cont = 1;

        while (cont <= 99) {
            System.out.println(cont);
            ++cont;
        }

        while (cont > 0) {
            System.out.println(cont);
            --cont;
        }
        */


        /* 7° QUESTÃO - Faça um código que peça ao usuário digitar
        um número, e realizar a soma de todos os números de 1 até
        o número fornecido pelo usuário, e exiba o resultado.

        int userNumber;
        int somatoria = 0;
        System.out.print("Digite um número: ");
        userNumber = scan.nextInt();

        for (int i = 1; i <= userNumber; i++){
            somatoria += i;
        }
        System.out.println("A soma de todos os valores: " + somatoria);
        */

        /* 8° QUESTÃO - Faça um código que imprima 10 vezes
        começando do 1, e cada vez que imprimir, multiplique por
        2.

        int b = 1;
        for (int a = 1; a <= 10; a++){
            System.out.println(b);
            b *= 2;
        }
        */

        /* 9° QUESTÃO - Faça um código que leia números inteiros
        do usuário e continue somando esses números até que o
        usuário digite 0. Quando 0 for digitado, o programa deve
        exibir a soma total de todos os números inseridos.

        int c;
        int somatorio = 0;

        do {
            System.out.print("Insira um número: ");
            c = scan.nextInt();
            somatorio += c;

        } while (c != 0);

        System.out.println("A soma de todos os valores: " + somatorio);
         */

        /* 10° QUESTÃO - Faça um código que peça ao usuário para
        digitar um número inteiro positivo. Se o usuário digitar
        um número negativo ou 0, o programa deve continuar pedindo
        até que um número positivo seja digitado.

        int d;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            d = scan.nextInt();

        } while (d <= 0);
        */

        /* 11° QUESTÃO - Utilizando a estrutura for, faça um código
        que exiba a tabuada do 1 ao 9.

        int e;
        System.out.print("Insira um número: ");
        e = scan.nextInt();

        for (int cont = 0; cont <= 10; cont++) {
            System.out.println(e + " x " + cont + " = " + e * cont);
        }
        */

        /* 12° QUESTÃO - Faça um código que o usuário informe um
        número e exiba o seu antecessor e sucessor.

        int f, suc, ant;
        System.out.print("Insira um número: ");
        f = scan.nextInt();
        ant = f;
        suc = f;
        --ant;
        ++suc;
        System.out.println("Antecessor: " + ant + "\nSucessor: " + suc);
        */

        /* 13° QUESTÃO - Usando if/else. Faça um código que leia
        um número inteiro de 1 a 7 e imprima o dia da semana
        correspondente a este número, isto é, domingo = 1, segunda-feira = 2...

        int g;
        System.out.print("Insira um número: ");
        g = scan.nextInt();

        if (g == 1) {
            System.out.println("Domingo");
        } else if (g == 2) {
            System.out.println("Segunda-feira");
        }else if (g == 3) {
            System.out.println("Terça-feira");
        }else if (g == 4) {
            System.out.println("Quarta-feira");
        }else if (g == 5) {
            System.out.println("Quinta-feira");
        }else if (g == 6) {
            System.out.println("Sexta-feira");
        } else if (g == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Insira um número entre 1 e 7!");
        }
        */

        /* 14° QUESTÃO - Usando switch. Faça um código que leia
        um número inteiro de 1 a 7 e imprima o dia da semana
        correspondente a este número, isto é, domingo = 1, segunda-feira = 2...

        int h;
        System.out.print("Insira um número: ");
        h = scan.nextInt();
        switch (h) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Insira um número entre 1 e 7! ");
        }
        */

        /* 15° QUESTÃO - Faça um código que peça ao usuário digitar
        dois números e usando switch, escolher um dos 4 operadores
        matemáticos (+, -, *, /) para fazer o cálculo desejado e
        exiba o resultado.

        int i, j;
        float res;
        short choice;
        System.out.print("Digite o primeiro valor: ");
        i = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        j = scan.nextInt();

        System.out.println("(1) Adição");
        System.out.println("(2) Subtração");
        System.out.println("(3) Multiplicação");
        System.out.println("(4) Divisão");
        System.out.println("Digite ao número correspondente " +
                "à operação matemática");
        choice = scan.nextShort();
        switch (choice) {
            case 1:
                res = i + j;
                System.out.println(res);
                break;
            case 2:
                res = i - j;
                System.out.println(res);
                break;
            case 3:
                res = i * j;
                System.out.println(res);
                break;
            case 4:
                res = (float) i / j;
                System.out.println(res);
                break;
            default:
                System.out.println("Insira um valor entre 1 e 4! ");
        }
        */

        /* 16° QUESTÃO - Faça um código que peça dois números ao
        usuário e mostre qual o maior e qual o menor.

        int k, l, maior, menor;

        System.out.print("Digite o primeiro valor: ");
        k = scan.nextInt();
        maior = k;
        menor = k;
        System.out.print("Digite o segundo valor: ");
        l = scan.nextInt();

        if (l > maior) {
            maior = l;
        } else if (l < maior){
            menor = l;
        } else {
            System.out.println("Números iguais!");
            System.exit(0);
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        */

        /* 17° QUESTÃO - Faça um código que peça dois números ao
        usuário, e depois realize as 4 operações entre esses números
        e exibe cada resultado da respectiva operação.

        int n, m;
        float res;
        System.out.print("Digite o primeiro valor: ");
        n = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        m = scan.nextInt();
        scan.close();

        res = n + m;
        System.out.println("Adição: " + res);
        res = n - m;
        System.out.println("Subtração: " + res);
        res = n * m;
        System.out.println("Multiplicação: " + res);
        res = (float) n / m;
        System.out.println("Divisão: " + res);
        */

        /* 18° QUESTÃO - Faça um código que peça um número ao
        usuário e armazene ele na variável x. Depois peça outro
        número e armazene ele na variável y. Mostre esses números.
        Em seguida, faça com que x tenha o valor de y e vice-versa.
        Dica: você vai precisar usar outra variável.

        int x, y, troca;

        System.out.print("Digite o primeiro valor: ");
        x = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        y = scan.nextInt();
        scan.close();
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        troca = x;
        x = y;
        y = troca;
        System.out.println("Valor de x pós-troca: " + x);
        System.out.println("Valor de y pós-troca: " + y);
        */

        /* 19° QUESTÃO - Faça um código que calcule a área de um
        círculo. O raio deve ser fornecido pelo usuário.

        int raio;
        float pi = (float) Math.PI;
        System.out.print("Digite o valor do raio: ");
        raio = scan.nextInt();

        float calc = (float) ((float) pi * Math.pow(raio, 2));
        System.out.printf("Resultado: %.3f", calc);
        */

        /* 20° QUESTÃO - Faça um código que resolva uma equação
        quadrática da forma ax² + bx + c = 0 utilizando a fórmula
        de Bhaskara. O código deve solicitar ao usuário os valores
        de a, b e c, e calcular as raízes da equação (se existirem).

        int a, b, c;
        float delta;
        double x1, x2;
        System.out.print("Insira o valor de a: ");
        a = scan.nextInt();
        System.out.print("Insira o valor de b: ");
        b = scan.nextInt();
        System.out.print("Insira o valor de c: ");
        c = scan.nextInt();
        scan.close();

        delta = (float) (Math.pow(b, 2) - (4 * a * c));
        x1 = ((b * - 1) + Math.sqrt(delta)) / (2 * a);
        x2 = ((b * - 1) - Math.sqrt(delta)) / (2 * a);

        if (delta < 0){
            System.out.println("A equação não possui números reais!");
            System.exit(0);
        } else if (delta == 0) {
            System.out.println("A equação só possui um número real!");
            System.out.println(x1 + "\n" + x2);
        } else {
            System.out.println("A equação possui dois resultados distintos!");
            System.out.println("Resultado x1: " + x1 + "\n" + x2);
        }
        */
    }
}