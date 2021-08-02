<%-- 
    Document   : alterarUnidade
    Created on : 24 de abr. de 2021, 14:01:47
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <h1>Alterar</h1>
                <form name="alteraDados" action="alterarDados.jsp" method="post">
                    <input type="number" name="id" value="">
                    ID: <input type="submit" name="alterar" value="Alterar">
                </form>
            </div>
        </div>
    </body>
</html>
