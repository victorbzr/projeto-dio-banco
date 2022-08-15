import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void imprimeClientes() {
		for( Conta conta : contas)
			System.out.println(conta.cliente.getNome());
	}
	
	public void imprimeContas() {
		for( Conta conta : contas) {
			System.out.println("=== " + conta.tipo + " ===");
			conta.imprimirInfosComuns();
		}
	}
	
	public void imprimeContas(String nome) {
		for( Conta conta : contas) {
			if (conta.cliente.getNome() == nome){
				System.out.println("=== " + conta.tipo + " ===");
				conta.imprimirInfosComuns();
			}
		}
	}
	
	public void imprimeContas(long cpf) {
		for( Conta conta : contas) {
			if (conta.cliente.getCpf() == cpf) {
				System.out.println("=== " + conta.tipo + " ===");
				conta.imprimirInfosComuns();
			}
		}
	}
	
	public void imprimeExtratoContas(int agencia, int numero) {
		for( Conta conta : contas) {
			if (conta.agencia == agencia && conta.numero == numero){
				conta.imprimirExtrato();
			}
				
		}
	}
}
