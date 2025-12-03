public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private Integer idade;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        String idadeStr = (idade == null) ? "n/a" : idade.toString();
        return (nome == null ? "" : nome) + " " + (sobrenome == null ? "" : sobrenome) + ", idade: " + idadeStr;
    }
}