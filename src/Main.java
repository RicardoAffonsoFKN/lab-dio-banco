public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNome("Camila");

        Banco banco1 = new Banco("Banco1");

        ContaCorrente cc = new ContaCorrente(cliente);
        cc.setSaldo(100);

        try {
            banco1.incluirConta(cc);
        } catch (NullPointerException e) {
            System.err.println("Erro ao inserir conta no banco!");
        }

        banco1.getContaByIndex(0).imprimirExtrato();

    }
}
