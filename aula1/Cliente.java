package aula1;
import java.util.ArrayList;
import java.util.List;

public class Cliente implements Comparable<Cliente> {
    private String nome;
    private List<ContaCorrente> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ContaCorrente> getContas() {
        return contas;
    }

    public void adicionarConta(ContaCorrente conta) {
        contas.add(conta);
    }

    public double getSaldoTotal() {
        double total = 0;
        for (ContaCorrente c : contas) {
            total += c.getSaldo();
        }
        return total;
    }

    @Override
    public int compareTo(Cliente outro) {
        return Double.compare(outro.getSaldoTotal(), this.getSaldoTotal());
    }

    public void imprimirContas() {
        System.out.println("\nContas do cliente: " + nome);
        for (ContaCorrente conta : contas) {
            System.out.println(conta);
        }
        System.out.println("Saldo total: R$ " + String.format("%.2f", getSaldoTotal()));
    }

    public void ordenarContasPorSaldoDecrescente() {
        contas.sort((c1, c2) -> Double.compare(c2.getSaldo(), c1.getSaldo()));
    }
}
