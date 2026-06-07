package programacaoEstruturada;

class PagamentoCripto extends PagamentoBase {

    public PagamentoCripto(String nomePagador, double valor) {
        super(nomePagador, valor);
    }

    @Override
    public void processarPagamento() {

        System.out.println("Pagamento em criptomoeda confirmado.");
        System.out.println("Hash da transação registrada.");
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.03;
    }
}
