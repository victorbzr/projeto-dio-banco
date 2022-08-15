import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Banco santander = new Banco();
		
		Cliente victor = new Cliente();
		victor.setNome("Victor");
		victor.setCpf(99999999999l);
		Cliente isabela = new Cliente();
		isabela.setNome("Isabela");
		isabela.setCpf(98765432100l);
		
		List<Conta> contas = new ArrayList<>();
		
		contas.add(new ContaCorrente(victor));
		contas.add(new ContaPoupanca(victor));
		contas.add(new ContaCorrente(isabela));
		contas.add(new ContaPoupanca(isabela));
		
		santander.setContas(contas);
		
		
		System.out.println("Imprime lista de clientes:");
		santander.imprimeClientes();
		
		System.out.println("Imprime lista de contas:");
		santander.imprimeContas();
		
		System.out.println("Imprime lista de contas vinculadas a um nome:");
		santander.imprimeContas("Victor");
		
		System.out.println("Imprime lista de contas vinculadas a um CPF:");
		santander.imprimeContas(99999999999l);
		
		System.out.println("Imprime o extrato de uma conta:");
		santander.imprimeExtratoContas(1, 2);
		santander.imprimeExtratoContas(1, 4);
		
	
	
	}
}
