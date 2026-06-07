package programacaoEstruturada;

public class Main {
	
	 public static void main(String[] args) {

	        String nome = "João Pedro";

	        double valor = 5000;

	        // Validação

	        if (!ValidadorPagamento.validar(nome, valor)) {

	            return;
	        }

	       
	        // Polimorfismo: variável do tipo da classe base recebendo objeto da classe filha.
	        
	        PagamentoBase pagamento = new PagamentoBoleto(nome, valor);

	        // Processa pagamento

	        pagamento.processarPagamento();

	        // Exibe comprovante

	        pagamento.exibirComprovante();

	    }
	
}
