package aula1;
public class aumentaFrase {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        }
        catch (NullPointerException e) {
        System.out.println("A frase inicial esta nula, para solucionar tal problema foi atribuido um valor default.");
        frase = "Frase padrão";     
        }
        finally {
            novaFrase = frase.toUpperCase();
        }
        System.out.println("A frase original é: " + frase);
        System.out.println("A nova frase é: " + novaFrase);
    }
}