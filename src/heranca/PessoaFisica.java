package heranca;

/**
 *
 * @author Micael
 */
public class PessoaFisica extends Pessoa {

    private long cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(long cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica(String nome, long cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

}
