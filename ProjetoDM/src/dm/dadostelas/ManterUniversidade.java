package dm.dadostelas;

import javax.swing.JOptionPane;
import dm.dadosbean.Universidade;
import dm.dadoscontroler.ControleUniversidade;
import java.util.ArrayList;
import java.util.List;

public class ManterUniversidade {
    public void cadastrar(){      
        Universidade u = new Universidade();
        ControleUniversidade cu = new ControleUniversidade();
        
        u.setNome(JOptionPane.showInputDialog(null, "Nome:", "Cadastrar Unidade", JOptionPane.PLAIN_MESSAGE));
        u.setBairro(JOptionPane.showInputDialog(null, "Bairro:", "Cadastrar Unidade", JOptionPane.PLAIN_MESSAGE));
        u.setTamanho(Integer.parseInt(JOptionPane.showInputDialog(null, "Tamanho:", "Cadastrar Unidade", JOptionPane.PLAIN_MESSAGE)));
        switch(Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a Região:\n\t1 - Norte\n\t2 - Sul\n\t3 - Leste\n\t4 - Oeste\n\t5 - Centro", "Cadastrar Unidade", JOptionPane.PLAIN_MESSAGE))){
            case 1 -> u.setRegiao(2);
            case 2 -> u.setRegiao(1);
            case 3 -> u.setRegiao(3);
            case 4 -> u.setRegiao(4);
            case 5 -> u.setRegiao(5);
        }        
        if(JOptionPane.showConfirmDialog(null,"Tem Certeza Que Deseja Cadastrar a Seguinte Unidade?"+u.confirmaCadastro(), "Cadastrar Unidade", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0){
            JOptionPane.showMessageDialog(null, cu.cadastrar(u), "Cadastrar Unidade", JOptionPane.PLAIN_MESSAGE);
        }
    }
    public void alterar(){
        Universidade u = new Universidade();
        ControleUniversidade cu = new ControleUniversidade();
        u.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "ID:", "Alterar Cadastro", JOptionPane.PLAIN_MESSAGE)));        
        u.setNome((String) JOptionPane.showInputDialog(null, "Nome:", "Alterar Cadastro", JOptionPane.PLAIN_MESSAGE,null, null,cu.listarId(u.getId()).getNome()));
        u.setBairro((String) JOptionPane.showInputDialog(null, "Bairro:", "Alterar Cadastro", JOptionPane.PLAIN_MESSAGE, null, null,cu.listarId(u.getId()).getBairro()));
        u.setTamanho(Integer.parseInt((String) JOptionPane.showInputDialog(null, "Tamanho:", "Alterar Cadastro", JOptionPane.PLAIN_MESSAGE, null, null,cu.listarId(u.getId()).getTamanho()
        )));
        switch(Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a Região:\n\t1 - Norte\n\t2 - Sul\n\t3 - Leste\n\t4 - Oeste\n\t5 - Centro", "Alterar Cadastro", JOptionPane.PLAIN_MESSAGE))){
            case 1 -> u.setRegiao(2);
            case 2 -> u.setRegiao(1);
            case 3 -> u.setRegiao(3);
            case 4 -> u.setRegiao(4);
            case 5 -> u.setRegiao(5);
        }        
        if(JOptionPane.showConfirmDialog(null,"Tem Certeza Que Deseja Alterar a Seguinte Unidade?"+u.confirmaCadastro(), "Alterar Cadastro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0){
            JOptionPane.showMessageDialog(null, cu.alterar(u), "Alterar Cadastro", JOptionPane.PLAIN_MESSAGE);
        }   
    }
    public void excluir(){
        ControleUniversidade cu = new ControleUniversidade();
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "ID:", "Excluir Cadastro", JOptionPane.PLAIN_MESSAGE));
        if(JOptionPane.showConfirmDialog(null,"Tem Certeza Que Deseja Excluir Essa Unidade?", "Excluir Cadastro", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0){
            JOptionPane.showMessageDialog(null, cu.excluir(id), "Excluir Cadastro", JOptionPane.PLAIN_MESSAGE);
        }
    }
    public void listar(){
        ControleUniversidade cu = new ControleUniversidade();
        List<Universidade> uList = new ArrayList<Universidade>();
        uList = cu.listar();
        for(Universidade u : uList){
            if(JOptionPane.showConfirmDialog(null, u.confirmaCadastro()+"\n"+cu.getRegiaoById(u.getRegiao())+"\n\tExibir Proximo?", "Cadastros", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE) == 1){
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Fim da Lista", "Cadastros", JOptionPane.PLAIN_MESSAGE);
    }
}
