import java.util.Scanner;

public class calculadora {

public static void main(String[] args) {
    /*int a = 5;
    int b = 7;
    int c = a + b;
    System.out.println("O valor da soma de " + a + " e " + b + " é igual a " + c);*/
    Scanner primeiro = new Scanner(System.in);
    System.out.println("Digite um número");
    int a = primeiro.nextInt();
    Scanner segundo = new Scanner(System.in);
    System.out.println("Digite outro número");
    int b = segundo.nextInt();
    Scanner terceiro = new Scanner(System.in);
    System.out.println("Escolha a operação");
    String c = terceiro.nextLine();

    int d;

    if (c.equals ("soma")) {
        d = a + b;
        System.out.println("A soma entre " + a + " e " + b + " é igual a " + d);
    } else if (c.equals ("sub")) {
        d = a - b;
        System.out.println("A subtração entre " + a + " e " + b + " é igual a " + d);
    } else if (c.equals ("multi")) {
        d = a * b;
        System.out.println("A multiplicação entre " + a + " e " + b + " é igual a " + d);
    } else if (c.equals ("divi")) {
        d = a / b;
        System.out.println("A divisão entre " + a + " e " + b + " é igual a " + d);
    }
}
}
