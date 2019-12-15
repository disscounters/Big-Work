<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 落生
  Date: 2019/12/11
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    *{
        box-sizing: border-box;
        padding: 0px;
        margin: 0px;
    }
    body{
        background-image: url("/images/002234-15731437546bd1.jpg");
    }
    .form{
       position: absolute;
        top: 30%;
        left: 38%;
        text-align: center;
    }
    h1{
        color: red;
    }
    .username,.password {
        border-radius: 5px;
        margin: 5px;
        padding: 8px;
    }
    button{
        padding: 12px;
        margin: 8px;
        border-radius: 5px;
    }


</style>
<body>
<form class="form" action="/log" method="post">
<div>
    <h1 >管理员登陆</h1>
   <label >
       Username:
       <input class="username" type="text" name="username" required autocomplete="tel">
   </label>
    <br>
   <label >
    Password:
    <input class="password" type="password" name="pwd" required autocomplete="tel">
   </label>
    <br>
    <button type="submit" class="btn">登陆</button>
</div>

</form>
</body>
</html>
