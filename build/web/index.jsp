<!DOCTYPE html>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,Servlets.myServlet,logic.Message,logic.ListManager" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css" media="screen" title="no title" charset="utf-8">
        <title> anonclub </title>
    </head>
    <body>
        <nav>
          <a href="index.jsp" title="home">
            <img class="brand" src="logo.png" alt="Logo" />
          </a>
          <a href="vorstand.html"> Vorstand </a>
          <a href="new_message.html"> Neue Nachricht</a>
        </nav>
        
        <!-- CONTENT -->
        
        <h1>Vereinsnachrichten</h1>
        <table border="1">
            <thead>
                <tr>
                  <td>Ueberschrift</td>
                  <td>Datum</td>
                </tr>
            </thead>
            <tbody>
                <%int i=0; for(Message msg : ListManager.getInstance().getMessageList()){%>
                  <tr>
                      <td>
                          <a href="myServlet?lesen=<%=i++%>">
                              <%=msg.getHeadline()%> 
                          </a>
                      </td>
                      <td>
                          <%=msg.getDate()%>
                      </td>
                  </tr>
                <%}%>   
            </tbody>
        </table>

        <footer>
          <a href="#"> Rechtliche Hinweise </a>
        </footer>
    </body>
</html>
