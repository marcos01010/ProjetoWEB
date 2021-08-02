package dm.dadosdao;

import java.sql.*;

public class Conexao {
    public static Connection abrirConecxao(){
        Connection con = null;
        try{         
            Class.forName("com.mysql.jdbc.Driver");
            String url="";
            url += "jdbc:mysql://127.0.0.1/universidade?";
            url += "user=root&password=Golf@100";
            con = DriverManager.getConnection(url);            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
