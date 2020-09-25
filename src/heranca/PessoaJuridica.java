package heranca;

/**
 *
 * @author Micael
 */
public class PessoaJuridica extends Pessoa {

    private long cnpj;

    public PessoaJuridica(long cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome) {
        super(nome);
    }

    public PessoaJuridica(String nome, long cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

}
