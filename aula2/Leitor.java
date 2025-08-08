package aula2;

import java.util.Scanner;

public class Leitor {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            int idade = -1;
            while (idade < 0) {
                System.out.print("Digite sua idade: ");
                if (scanner.hasNextInt()) {
                    idade = scanner.nextInt();
                    if (idade < 0) {
                        System.out.println("Idade não pode ser negativa. Tente novamente.");
                    }
                } else {
                    System.out.println("Por favor, digite um número válido.");
                    scanner.next(); // descarta entrada inválida
                }
            }

            System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        } catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}