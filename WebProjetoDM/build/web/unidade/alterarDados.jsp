<%-- 
    Document   : alterarDados
    Created on : 26 de abr. de 2021, 18:41:15
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dm.dadoscontroler.ControleUniversidade"%>
<%@page import="dm.dadosbean.Universidade" %>
<%@page import="java.util.List" %>

<%
    ControleUniversidade cu = new ControleUniversidade();
    Universidade u = new Universidade();
    u = cu.listarId(Integer.parseInt(request.getParameter("id")));
    List<String> lr = cu.listarRegiao();
%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="..\css\style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <datalist id="regi_datalist">
            <option value="Norte"/>
            <option value="Sul"/>
            <option value="Leste"/>
            <option value="Oeste"/>
            <option value="Centro"/>
        </datalist>
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
                <form name="alterarDados" action="validaAlterarUnidade.jsp" method="post">
                    <div class="form-grup"><label>ID:</label> <input type="number" name="id" value="<%=u.getId()%>"><br></div>
                    <div class="form-grup"><label>Nome:</label> <input type="text" name="nome" value="<%=u.getNome()%>"><br></div>
                    <div class="form-grup"><label>Bairro:</label><input type="text" name="bairro" value="<%=u.getBairro()%>"><br></div>
                    <div class="form-grup"><label>Região:</label>
                        <select name="regiao2" ">
                            <% for(String s : lr){%>
                                <%if(s.equals(cu.getRegiaoById(u.getRegiao()))){%>
                                    <option selected><%=s%></option>
                                <%}else{%>
                                    <option><%=s%></option>
                                <%}%>
                            <%}%>
                        </select>
                    </select>
                    <div class="form-grup"><label>Tamanho:</label><input type="number"  name="tamanho" value="<%=u.getTamanho()%>"><br>
                    <input type="submit" name="inserir" value="Alterar"> <br>
                </form>
            </div>
        </div>
    </body>
</html>
