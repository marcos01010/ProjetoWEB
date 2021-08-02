<%-- 
    Document   : validaInserirUnidade
    Created on : 26 de abr. de 2021, 18:27:00
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dm.dadosbean.Universidade"%>
<%@page import="dm.dadoscontroler.ControleUniversidade"%>

<%
    Universidade u = new Universidade();    
    ControleUniversidade cu = new ControleUniversidade();
    u.setNome(request.getParameter("nome"));
    u.setBairro(request.getParameter("bairro"));
    u.setRegiao(cu.getIdRegiao(request.getParameter("regiao2")));
    u.setTamanho(Integer.parseInt(request.getParameter("tamanho")));
    cu.cadastrar(u);
%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="..\css\style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Unidade</title>
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
        <h1>Inserir Unidade</h1>
        <p>Unidade Cadastrada</p>
        <br>
        <a href="../acesso/menu.jsp">Menu<a>
                </div>
            </div>
    </body>
</html>
