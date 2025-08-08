package aula1;
public class TesteString {
    public static void auementarLetra() throws NullPointerException {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            throw new NullPointerException(e.getMessage());
        }
        System.out.println("A frase original é: " + frase);
        System.out.println("A nova frase é: " + novaFrase);
    }

    public static void main(String[] args) {
        try {
            auementarLetra();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}