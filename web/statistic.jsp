<%@ page import="com.gmail.kovalchuk.Statistic" %>
<%@ page import="com.gmail.kovalchuk.FormsList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
          <title>Статистика</title>
    </head>
<body>
<%!private FormsList formsList = FormsList.getInstance();%>

    <p>Статистика відпоівдей на запитання:</p>

    <p>Запитання 1: Яку мову програмування ви хочети вчити?</p>
    <p>Java - <%=Statistic.getAnsNumber("Яку мову програмування ви хочети вчити?", "a1", formsList)%></p>
    <p>C++" - <%=Statistic.getAnsNumber("Яку мову програмування ви хочети вчити?", "a2", formsList)%></p>
    <p>Python - <%=Statistic.getAnsNumber("Яку мову програмування ви хочети вчити?", "a3", formsList)%></p>

    <p>Запитання 2: Скільки часу ви готові відавати навчанню?</p>
    <p>1 годину в день - <%=Statistic.getAnsNumber("Скільки часу ви готові відавати навчанню?", "a4", formsList)%></p>
    <p>2 години в день - <%=Statistic.getAnsNumber("Скільки часу ви готові відавати навчанню?", "a5", formsList)%></p>
    <p>3 години в день - <%=Statistic.getAnsNumber("Скільки часу ви готові відавати навчанню?", "a6", formsList)%></p>

    <p>Запитання 3:  Як ви плануєте вивчати мову програмування?</p>
    <p>Самостійно - <%=Statistic.getAnsNumber("Як ви плануєте вивчати мову програмування?", "a7", formsList)%></p>
    <p>Відвідувати курси - <%=Statistic.getAnsNumber("Як ви плануєте вивчати мову програмування?", "a8", formsList)%></p>

    <%!int x = 1; %>
    <p>Користувачів заповнило анкету: - <%=x++%> </p>


</body>
</html>