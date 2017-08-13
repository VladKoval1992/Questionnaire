
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
  <meta charset="utf-8">
  <title>Авторизація</title>
</head>
<body>


<form action="/login" method="POST">
  <table width="100%" cellspacing="0" cellpadding="4">

    <h1><ins>АВТОРИЗАЦІЯ</ins></h1>

    <tr>
      <td  align="right" width="100"> <ins> Логін:</ins> </td>
      <td><input name="login" maxlength="50" size="20"></td>
    </tr>

    <tr>
      <td  align="right" width="100"> <ins> Пароль:</ins> </td>
      <td><input name="password" type="password" maxlength="50" size="20"></td>
    </tr>

  </table>
  <input type="submit" value="Вхід">

</form>

</body>
</html>

