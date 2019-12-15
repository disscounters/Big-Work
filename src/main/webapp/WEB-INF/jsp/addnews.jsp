<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 落生
  Date: 2019/12/12
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
    background-color: lightcyan;


}

    div{
        position: absolute;
        top: 30%;
        left: 35%;
    }
    .one,.two{
        display: inline-block;
        margin: 10px;
    }
    button{
        display: inline-block;
        padding: 12px;
        margin: 0px 10px;
    }
</style>
<body>

   <div >
       <h1>添加新闻</h1><form action="/addnews" method="post">
       <span class="one"></label>Title <input type="text" name="newtitle" required autocomplete="tel"></span><br>
   <span class="two"> Context <br> <textarea name="newcontext" cols="30" rows="10"></textarea></span><br>

    <button type="submit">添加</button></form>
       <form action="/deletenews" method="post">  <button type="submit">删除</button></form>
   </div>

</body>
</html>
