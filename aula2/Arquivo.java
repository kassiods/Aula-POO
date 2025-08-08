package aula2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args) {
        Scanner scanner = null;
        try{
            File arquivo = new File("aula2/Arquivo.txt");
            scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}