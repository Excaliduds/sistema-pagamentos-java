package programacaoEstruturada;

class ValidadorPagamento {

    public static boolean validar(String nome, double valor) {

        if (nome == null || nome.trim().isEmpty()) {

            System.out.println("Pagamento inválido.");
            return false;
        }

        if (valor <= 0) {

            System.out.println("Pagamento inválido.");
            return false;
        }

        return true;
    }
    
}