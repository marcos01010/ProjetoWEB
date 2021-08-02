package dm;

import dm.dadostelas.ManterUniversidade;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {    
        ManterUniversidade mu = new ManterUniversidade();
        switch(Integer.parseInt(JOptionPane.showInputDialog(null, "Menu:\n\t1 - Cadastrar\n\t2 - Alterar\n\t3 - Excluir\n\t4 - Listar\n\t5 - Sair.", "Menu", JOptionPane.PLAIN_MESSAGE))){
            case 1 -> mu.cadastrar();
            case 2 -> mu.alterar();
            case 3 -> mu.excluir();
            case 4 -> mu.listar();
        } 
        JOptionPane.showMessageDialog(null, "Fim do Programa","Fim",JOptionPane.PLAIN_MESSAGE);
    }
}
