package programacaoEstruturada;

class PagamentoPix extends PagamentoBase {

	public PagamentoPix(String nomePagador, double valor) {
		super (nomePagador, valor);
		
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("Pagamento via PIX realizado.");
	}
	
	@Override
    public double calcularTaxa() {
        return valor * 0.01;
    }
	
}
