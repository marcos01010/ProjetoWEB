<%-- 
    Document   : inserirUnidade
    Created on : 24 de abr. de 2021, 13:56:46
    Author     : User

                    <div class="form-grup"><label>Região:</label><input type="text" list="regi_datalist" name="regiao" value=""><br></div>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dm.dadosbean.Universidade"%>
<%@page import="dm.dadoscontroler.ControleUniversidade"%>
<%@page import="java.util.List" %>

<%
    ControleUniversidade cu = new ControleUniversidade();
    List<String> lr = cu.listarRegiao();
%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="..\css\style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="principal">
            <div class="seletor">
                <h1>MENU</h1>        
                <div><a href="../unidade/inserirUnidade.jsp">Inserir</a></div>       
                <div><a href="../unidade/alterarUnidade.jsp">Aletarar</a></div>
                <div><a href="../unidade/excluirUnidade.jsp">Excluir</a></div>
                <div><a href="../unidade/listarUnidades.jsp">Listar</a></div>
                <div><a href="../unidade/validaBuscar.jsp">Buscar</a></div>
                <div style="padding-top: 5px;padding-bottom: 5px; display: block;">
                    <form name = "procurarUnidade" action="../unidade/procurarUnidade.jsp" method="post">
                        <input type="text" name="buscaMenu" style="width: 105px;">
                        <input type="submit" name="busca" value="Buscar">
                    </form>
                </div>
            </div>
            <div class="content">
                <h1>Inserir</h1>
                <form name="validaInserirUnidade" action="validaInserirUnidade.jsp" method="post">
                    <div class="form-grup"><label>Nome:</label> <input type="text" name="nome" value=""><br></div>
                    <div  class="form-grup"><label>Bairro:</label><input type="text" name="bairro" value=""><br></div>
                    <div class="form-grup"><label>Região:</label>
                        <select name="regiao2">
                            <% for(String s : lr){%>
                                <option><%=s%></option>
                            <%}%>
                        </select>
                        <br></div>
                    <div class="form-grup"><label>Tamanho:</label><input type="number"  name="tamanho" value=""><br></div>
                    <input type="submit" name="inserir" value="Inserir"> <br>
                </form>
	</div>
</div>
               
    </body>
</html>
