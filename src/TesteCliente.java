public class TesteCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();

        c1.nome();
        c1.cpf();
        c1.endereco();
        c1.email();
        c1.telefone();

        System.out.println(c1.nome);
        System.out.println(c1.cpfReturno());
        System.out.println(c1.enderecoReturno());
        System.out.println(c1.emailReturno());
        System.out.println(c1.telefoneReturno());
    }
}
