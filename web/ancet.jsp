<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Анкета</title>
</head>
<body>
<h1 style="color:#0001ff" > Заповніть свої данні: </h1>
<form action="/form" method="POST">
    <table width="100%" cellspacing="0" cellpadding="4">
        <tr>
            <td  align="right" width="100"> <ins> Ім'я</ins> </td>
            <td><input name="name" maxlength="50" size="20"></td>
        </tr>

        <tr>
            <td align="right"> <ins> Прізвище </ins></td>
            <td><input name="lastname" maxlength="50" size="20"></td>
        </tr>

        <tr>
            <td align="right"> <ins> Вік</ins></td>
            <td><input name="age" maxlength="50" size="20"></td>
        </tr>

    </table>

    <h1 style="color:#ff0b00">Дайте відповідь на запитання: </h1>

    <b><ins>Запитання 1:</ins></b>
    <p>Яку мову програмування ви хочети вчити? </p>
    <p><input name="ans1" type="radio" value="a1"> Java</p>
    <p><input name="ans1" type="radio" value="a2"> C++</p>
    <p><input name="ans1" type="radio" value="a3"> Python</p>

    <b><ins>Запитання 2:</ins></b>
    <p>Скільки часу ви готові відавати навчанню? </p>
    <p><input name="ans2" type="radio" value="a4"> 1 годину в день</p>
    <p><input name="ans2" type="radio" value="a5"> 2 години в день</p>
    <p><input name="ans2" type="radio" value="a6"> 3 годнини в день</p>

    <b><ins>Запитання 3:</ins></b>
    <p>Як ви плануєте вивчати мову програмування? </p>
    <p><input name="ans3" type="radio" value="a7"> Самостійно</p>
    <p><input name="ans3" type="radio" value="a8"> Відвідувати курси</p>


    <input type="submit" value="Готово">

</form>


</body>
</html>