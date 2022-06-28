import java.util.Scanner;
public class Cliente {
        String nome;
        String cpf;
        String endereco;
        String email;
        String telefone;

    Scanner leitor = new Scanner(System.in);

        public void nome(){
            System.out.println("Dig. Seu Nome");
            this.nome = leitor.nextLine();
        }

        public String nomeReturno(){
            return this.nome;
        }
    public void cpf(){
        System.out.println("Dig. Seu cpf");
        this.cpf = leitor.nextLine();
    }

    public String cpfReturno(){
        return this.cpf;
    }
    public void endereco(){
        System.out.println("Dig. Seu endereco");
        this.endereco = leitor.nextLine();
    }

    public String enderecoReturno(){
        return this.endereco;
    }
    public void email(){
        System.out.println("Dig. Seu email");
        this.email = leitor.nextLine();
    }

    public String emailReturno(){
        return this.email;
    }
    public void telefone(){
        System.out.println("Dig. Seu telefone");
        this.telefone = leitor.nextLine();
    }

    public String telefoneReturno(){
        return this.telefone;
    }
}
