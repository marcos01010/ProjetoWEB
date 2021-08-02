package dm.dadosdao;

import java.sql.*;
import java.util.List;

import dm.dadosbean.Universidade;
import java.util.ArrayList;

public class UniversidadeDAO {
    
    public Connection getCon() {
        return Conexao.abrirConecxao();
    }
    
    public String cadastrar(Universidade u){ 
        String sql = "insert into unidade(nome,bairro,id_regiao,tamanho) values(?,?,?,?)";
        int retorno_execUp;
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, u.getNome());
            ps.setString(2, u.getBairro());
            ps.setInt(3, u.getRegiao());
            ps.setInt(4, u.getTamanho());
            
            retorno_execUp = ps.executeUpdate();
            getCon().close();
            System.out.println("Fechou");
            if(retorno_execUp > 0)
                return "Cadastro Realizado";
            else
                return "Erro ao Cadastrar";
             
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    public String alterar(Universidade u){
        String sql = "update unidade set nome = ?,bairro = ?,id_regiao = ?,tamanho = ? where id = ?";
        int retorno_execUp;
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, u.getNome());
            ps.setString(2, u.getBairro());
            ps.setInt(3, u.getRegiao());
            ps.setInt(4, u.getTamanho());
            ps.setInt(5, u.getId());
            
            retorno_execUp = ps.executeUpdate();
            getCon().close();
            
            if(retorno_execUp > 0 )
                return "Cadastro Alterado.";
            else
                return "Erro ao Alterar";
            
            
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    public String excluir(int id){
        String sql=" delete from unidade where id = ? ";
        int retorno_execUp;
        try{
            PreparedStatement ps =  getCon().prepareStatement(sql);			
            ps.setInt(1, id);

            retorno_execUp = ps.executeUpdate();
            getCon().close();
            
            if(retorno_execUp > 0)
                return "Excluido Com Sucesso";				
            else
                return "Erro ao Excluir";
            			
        }catch(SQLException e){
            return e.getMessage();
        }		
    }
    public List<Universidade> listarTodosCadastros(){
        String sql="select * from unidade";		
	List<Universidade> lista = new ArrayList<Universidade>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();            
            if(rs != null){
                while(rs.next()){
                    Universidade u = new Universidade();
                    u.setId(rs.getInt(1));
                    u.setNome(rs.getString(2));
                    u.setBairro(rs.getString(3));
                    u.setRegiao(rs.getInt(4));
                    u.setTamanho(rs.getInt(5));
                    lista.add(u);
                }
                return lista;
            }else{
                return null;
            }
        }catch(SQLException e){
            return null;
        }
    }
    
    public List<String> listarRegiao(){
        String sql="select * from regiao";		
	List<String> lista = new ArrayList();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();            
            if(rs != null){
                while(rs.next()){
                    lista.add(rs.getString(2));
                }
                return lista;
            }else{
                return null;
            }
        }catch(SQLException e){
            return null;
        }
    }
    public int getIdRegiao(String descricao){
        String sql="select * from regiao where descricao = ?";		
	List<String> lista = new ArrayList();
        int res = 0;
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, descricao);
            
            ResultSet rs = ps.executeQuery();            
            if(rs != null){
                while(rs.next()){
                    res = rs.getInt(1);
                }
                return res;
            }else{
                return res;
            }
        }catch(SQLException e){
            return 0;
        }
    }
    public String getRegiaoById(int id){
        String sql="select * from regiao where id_regiao = ?";		
	List<String> lista = new ArrayList();
        String res = "";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();            
            if(rs != null){
                while(rs.next()){
                    res = rs.getString(2);
                }
                return res;
            }else{
                return res;
            }
        }catch(SQLException e){
            return "";
        }
    }
    public Universidade listarId(int id){
        String sql="select * from unidade where id = " + id + ";";
        Universidade u = new Universidade();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();            
            if(rs != null){
                while(rs.next()){                    
                    u.setId(rs.getInt(1));
                    u.setNome(rs.getString(2));
                    u.setBairro(rs.getString(3));
                    u.setRegiao(rs.getInt(4));
                    u.setTamanho(rs.getInt(5));
                }
                return u;
            }else{
                return u;
            }
        }catch(SQLException e){
            return null;
        }
    }
    public List<Universidade> buscar(String arg){
        String sql="select * from unidade where nome like '%"+arg+"%';";		
	List<Universidade> lista = new ArrayList<Universidade>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();            
            if(rs != null){
                while(rs.next()){
                    Universidade u = new Universidade();
                    u.setId(rs.getInt(1));
                    u.setNome(rs.getString(2));
                    u.setBairro(rs.getString(3));
                    u.setRegiao(rs.getInt(4));
                    u.setTamanho(rs.getInt(5));
                    lista.add(u);
                }
                return lista;
            }else{
                return null;
            }
        }catch(SQLException e){
            return null;
        }
    }
}
