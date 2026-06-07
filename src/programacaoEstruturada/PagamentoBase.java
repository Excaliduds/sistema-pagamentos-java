package programacaoEstruturada;

// ===== Clase abstrata para pagamento base =====

abstract class PagamentoBase implements Pagamento {
	
	protected String nomePagador;
	protected double valor;
	


	// ===== criando o construtor =====

	public PagamentoBase(String nomePagador, double valor) {
	
	this.nomePagador = nomePagador;
	this.valor = valor;
	
	}

	// ===== Método reutilizado por todas as classes =====

	public void exibirComprovante() {
	
	double taxa = calcularTaxa();
	double valorFinal = valor + taxa;
	
	System.out.println(" \n ===== COMPROVANTE ===== ");
	System.out.println(" \n Pagador: " + nomePagador);
	System.out.println(" \n Valor inicial: R$ " + valor);
	System.out.println(" \n Taxa: R$ " + taxa);
	System.out.println(" \n Valor final: R$ " + valorFinal);
	
	}
	
}

