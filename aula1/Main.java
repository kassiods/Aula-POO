package aula1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Kassio Sousa");
        cliente1.adicionarConta(new ContaCorrente(cliente1, "1234", 45000));
        cliente1.adicionarConta(new ContaCorrente(cliente1, "5678", 30075));

        Cliente cliente2 = new Cliente("Maria Silva");
        cliente2.adicionarConta(new ContaCorrente(cliente2, "9101", 2500.00));
        cliente2.adicionarConta(new ContaCorrente(cliente2, "1121", 1200.00));

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        Collections.sort(clientes);

        for (Cliente c : clientes) {
            c.imprimirContas();
        }
    }
}
