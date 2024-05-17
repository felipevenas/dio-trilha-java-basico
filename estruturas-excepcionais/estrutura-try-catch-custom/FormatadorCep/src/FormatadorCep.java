public class FormatadorCep {
    public static void main(String[] args) throws Exception {

       try {
         
        String cepFormatado = formatarCep("41650476");
        System.out.println("CEP FORMATADO: " + cepFormatado);

       } catch (CepInvalidoException e) {
            System.out.println("CEP não corresponde com as regras.");
       }

    }

    static String formatarCep(String cep) throws CepInvalidoException { // Método para formatar o CEP.
        if (cep.length() != 8) {
            throw new CepInvalidoException(); // Lançando(throw) e criando(new) uma nova exceção customizada(CepInvalidoException).
        }
        return "41.605-476";
    }

}
