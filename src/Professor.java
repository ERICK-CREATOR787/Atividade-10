public class Professor {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String genero;
    private double salario;

    private boolean ativo;

    private String dataCadastro;
    private String dataAtualizacao;
    private String dataRemocao;

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    public String getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(String dataCadastro) { this.dataCadastro = dataCadastro; }

    public String getDataAtualizacao() { return dataAtualizacao; }
    public void setDataAtualizacao(String dataAtualizacao) { this.dataAtualizacao = dataAtualizacao; }

    public String getDataRemocao() { return dataRemocao; }
    public void setDataRemocao(String dataRemocao) { this.dataRemocao = dataRemocao; }
}
