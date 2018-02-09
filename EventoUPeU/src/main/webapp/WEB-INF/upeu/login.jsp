<%-- 
    Document   : login
    Created on : 09/02/2018, 11:13:52 AM
    Author     : Docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div style="align-content: center">
            
            <form action="${pageContext.request.contextPath}/validar" method="POST">
            <table>
                <tr> <th colspan="2"> Formulario de Autentificacion </th> </tr>
                <tr>
                    <td>Usuario:</td>
                    <td><input type="text" name="usuario" placeholder="Usuario" /></td>
                </tr>
                <tr>
                    <td>Clave:</td>
                    <td><input type="password" name="clave" placeholder="Usuario" /></td>
                </tr>
                <tr>
                    <td colspan="2" ><button type="submit">Ingresar </button>  </td>
                </tr>
            </table>
            </form>
        </div>
        
    </body>
</html>
