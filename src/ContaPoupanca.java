
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente, "Conta Poupanca");
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca: ====");
		super.imprimirInfosComuns();
	}

	
	
}
