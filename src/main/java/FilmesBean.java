import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;

@Named("filmesBacking")
@ViewScoped
public class FilmesBean implements Serializable {

    private Integer id;
    private String nome;
    private String genero;
    private Integer classificacao;
    private Integer anoLancamento;
    private String nomeDiretor;
    private String origem;
    private ArrayList<FilmesVo> filmesList = new ArrayList<>();

    public void actionAdd() {
        FilmesVo vo = new FilmesVo();
        vo.setId(this.id);
        vo.setNome(this.nome);
        vo.setGenero(this.genero);
        vo.setClassificacao(this.classificacao);
        vo.setAnoLancamento(this.anoLancamento);
        vo.setNomeDiretor(this.nomeDiretor);
        vo.setOrigem(this.origem);
        this.filmesList.add(vo);

        // Limpa os campos
        this.id = null;
        this.nome = null;
        this.genero = null;
        this.classificacao = null;
        this.anoLancamento = null;
        this.nomeDiretor = null;
        this.origem = null;
    }

    public void actionImprimir() {
        for (FilmesVo filme : filmesList) {
            System.out.println(filme.getId() + " - " + filme.getNome());
        }
    }

    public void actionExcluir() {
        this.filmesList.clear();
    }

    public void actionExcluirLinha(FilmesVo filme) {
        this.filmesList.remove(filme);
    }

    // Getters e Setters
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

    public ArrayList<FilmesVo> getFilmesList() { return filmesList; }
    public void setFilmesList(ArrayList<FilmesVo> filmesList) { this.filmesList = filmesList; }

    public boolean isMostrarBtn() {
        return true; 
    }
}
