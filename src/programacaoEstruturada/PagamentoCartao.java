package programacaoEstruturada;

class PagamentoCartao extends PagamentoBase {

    public PagamentoCartao(String nomePagador, double valor) {
        super(nomePagador, valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via cartão aprovado.");
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.05;
    }
    
}

