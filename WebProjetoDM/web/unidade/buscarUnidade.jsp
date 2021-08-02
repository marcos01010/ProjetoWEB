<%-- 
    Document   : buscarUnidade
    Created on : 30 de abr. de 2021, 10:29:25
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dm.dadosbean.Universidade"%>
<%@page import="dm.dadoscontroler.ControleUniversidade"%>
<%@page import="java.util.List" %>

<%
    ControleUniversidade cu = new ControleUniversidade();
    Universidade u = new Universidade();
    u = cu.listarId(Integer.parseInt(request.getParameter("id")));
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
            <h1>Buscar</h1>
            <div>
                <% %> 
                <div class="lista">
                    ID: <%=u.getId()%><br>
                    Nome: <%=u.getNome()%><br>
                    Bairro: <%=u.getBairro()%><br>
                    Região: <%=cu.getRegiaoById(u.getRegiao())%><br>
                    Tamanho: <%=u.getTamanho()%> Alunos<br>
                    <a href="../unidade/validarExcluir.jsp?id=<%=u.getId()%>">Excluir</a>
                    <a href="../unidade/alterarDados.jsp?id=<%=u.getId()%>"> Alterar</a><br>
                </div>
                <%%>
            </div>
            </div>
        </div>
        <br>
    </body>
</html>
