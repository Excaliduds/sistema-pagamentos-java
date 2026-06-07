package programacaoEstruturada;

class PagamentoBoleto extends PagamentoBase {

    public PagamentoBoleto(String nomePagador, double valor) {
        super(nomePagador, valor);
    }

    @Override
    public void processarPagamento() {

        System.out.println("Pagamento via boleto realizado.");
        System.out.println("Boleto bancário gerado.");
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.02;
    }
    
}
