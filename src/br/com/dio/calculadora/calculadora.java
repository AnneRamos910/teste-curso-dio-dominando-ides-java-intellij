package br.com.dio.calculadora;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sacan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = sacan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = sacan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a,b);

        System.out.println("somar: " + somar);
        System.out.println("sub: " + subtrair);
        System.out.println("mult: " + multiplicar);
        System.out.println("div: " + dividir);

    }

    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtrair(int a, int b) {
        return a - b;
    }
public static int multiplicar(int a, int b) {
        return a * b;
    }
public static int dividir(int a, int b) {
        return a / b;
    }

}
