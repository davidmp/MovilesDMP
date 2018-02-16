<%-- 
    Document   : index
    Created on : 08/02/2018, 11:02:27 AM
    Author     : Docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:out value="${saludo}" />
        
        <c:if test="${!empty listarUsuario}">
        <table border="1">
            <c:forEach items="${listarUsuario}" var="dato">
                <tr>
                    <td>
                        <c:out value="${dato.apellidos}" /><br/>
                        <img src="http://localhost:8084/EventoUPeU/GeneradorQR?codigo=${dato.dnicodigo}" />
                    </td>
                </tr>
            </c:forEach>            
        </table>
        </c:if>
    </body>
</html>
