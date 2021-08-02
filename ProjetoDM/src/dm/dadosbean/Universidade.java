package dm.dadosbean;

public class Universidade {
    int id,tamanho,regiao;
    String nome,bairro;

    public Universidade(int id) {
        this.id = id;
    }

    public Universidade() {
    }

    public Universidade(int id, int tamanho, String nome, String bairro, int regiao) {
        this.id = id;
        this.tamanho = tamanho;
        this.nome = nome;
        this.bairro = bairro;
        this.regiao = regiao;
    }

    public int getRegiao() {
        return regiao;
    }

    public void setRegiao(int regiao) {
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return "Universidade{" + "id=" + id + ", tamanho=" + tamanho + ", nome=" + nome + ", bairro=" + bairro + ", regiao=" + regiao + '}';
    }
    
    public String confirmaCadastro(){
        return "\nNome: "+nome+"\nBairro: "+bairro+"\nRegião: "+regiao+"\nTamanho: "+tamanho+" Alunos";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }    
}
