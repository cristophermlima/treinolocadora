public class FilmesVo {
    private Integer id;
    private String nome;
    private String genero;
    private Integer classificacao;
    private Integer anoLancamento;
    private String nomeDiretor;
    private String origem;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public Integer getClassificacao() { return classificacao; }
    public void setClassificacao(Integer classificacao) { this.classificacao = classificacao; }

    public Integer getAnoLancamento() { return anoLancamento; }
    public void setAnoLancamento(Integer anoLancamento) { this.anoLancamento = anoLancamento; }

    public String getNomeDiretor() { return nomeDiretor; }
    public void setNomeDiretor(String nomeDiretor) { this.nomeDiretor = nomeDiretor; }

    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }
}
