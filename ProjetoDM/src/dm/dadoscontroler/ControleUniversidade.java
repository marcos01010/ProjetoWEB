package dm.dadoscontroler;

import dm.dadosbean.Universidade;
import dm.dadosdao.UniversidadeDAO;
import java.util.List;

public class ControleUniversidade {
    UniversidadeDAO ud = new UniversidadeDAO();    
    
    public String cadastrar(Universidade u){        
        return ud.cadastrar(u);        
    }
    public String alterar(Universidade u){        
        return ud.alterar(u);        
    }
    public String excluir(int id){        
        return ud.excluir(id);        
    }
    public List<Universidade> listar(){
        return ud.listarTodosCadastros();
    }
    public Universidade listarId(int id){
        return ud.listarId(id);
    }
    public List<String> listarRegiao(){
        return ud.listarRegiao();
    }
    public int getIdRegiao(String descricao){
        return ud.getIdRegiao(descricao);
    }
    public String getRegiaoById(int id){
        return ud.getRegiaoById(id);
    }
    public List<Universidade> buscar(String arg){
        return ud.buscar(arg);
    }
}
