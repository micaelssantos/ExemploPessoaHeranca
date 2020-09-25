package heranca;

public class TestaHeranca {

    public static void main(String[] args) {

        //Cria Cliente (PessoaFisica)
        PessoaFisica cliente = new PessoaFisica("Micel", 1234);
        System.out.println("\n*********** PESSOA FISICA *************"
                + "\nNome: " + cliente.getNome() + " \nCPF: " + cliente.getCpf());

        //Cria Fornecedor (PessoaJuridica)
        PessoaJuridica fornecedor = new PessoaJuridica("DELL", 1234546548);
        System.out.println("\n******** PESSOA JURIDICA *********"
                + "\nNome: " + fornecedor.getNome() + " \nCnpj: " + fornecedor.getCnpj());

        //Cria Funcionario
        Funcionario func = new Funcionario("Micael", 1232, 54871);
        System.out.println("\n******* FUNCIONARIO *******"
                + "\nNome: " + func.getNome() + " \nCPF: " + func.getCpf() + "\nMatricula: " + func.getMatricula());
    }

}
