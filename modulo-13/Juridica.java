public class Juridica extends Pessoa{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + ", CNPJ: " + (cnpj == null ? "n/a" : cnpj);
    }
}