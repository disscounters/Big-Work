<%--
  Created by IntelliJ IDEA.
  User: 落生
  Date: 2019/12/12
  Time: 19:54
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
        background-color: lightgrey;

    }
    div{
        position: absolute;
        top: 30%;
        left: 35%;
    }
    .one,.two{
        display: inline-block;
        margin: 3px;
        padding: 12px;
    }
    button{
        display: inline-block;
        padding: 12px;
        margin: 5px 10px;
    }
</style>
<body>

<form action="/addnotice" method="post">
    <div>
        <h1>添加公告</h1>
   <span class="one"> Title <input type="text" name="noticetitle" required autocomplete="tel"></span><br>
   <span class="two"> Context <br><textarea name="noticecontext"  cols="30" rows="5" ></textarea></span><br>
    <button type="submit">添加</button>
    </div>
</form>

</body>
</html>
