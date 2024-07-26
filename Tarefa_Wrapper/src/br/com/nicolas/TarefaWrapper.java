package br.com.nicolas;

import java.util.Scanner;

public class TarefaWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor número, por gentileza: ");
        int valorNumero = scanner.nextInt();
        System.out.println("Valor numérico: " + valorNumero);

        System.out.println("Convertendo...");
        Integer valorWrapper = valorNumero;
        System.out.println("Valor convertido em Wrapper: " + valorWrapper);

        scanner.close();

    }
}
