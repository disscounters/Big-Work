<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 落生
  Date: 2019/12/15
  Time: 8:00
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

    .page{
        display: grid;
        grid-template-columns: auto;
        grid-template-rows: 20% 10%  67%  3%;
        grid-template-areas: "header "
        " nav "
        "body "
        "footer ";
        width: 100vw;
        height: 100vh;
        background-image: url("../../images/157616470776.jpg");
    }



    .header {
        font-family: Gadugi;
        font-style: italic;
        padding: 35px 30px  ;
        grid-area: header;
    }

    .header-nav{
        grid-area: nav;
        position: relative;


    }
    .header-nav>ul{
        list-style: none;
        display: flex;
    }
    .employment-guidelines a{
        text-decoration: none;
        color: black;
    }

    .major,.laboratory,.log,.teachers,.employment-guidelines {
        position: relative;
        display: block;
        border-radius: 3px;
        opacity: 0.8;
        text-align: center;
        background-color: aquamarine;
        padding: 12px;
        margin: 2px;
    }

    .major:hover,.laboratory:hover,.log:hover,.teachers:hover,.employment-guidelines:hover{
        opacity: 1;
        cursor: move;
        border-radius: 6px;
        background-color: lightskyblue;
    }


    .dropdown-major,.dropdown-laboratory,.dropdown-teachers{
        display: none;
        background-color: aliceblue;
        position: absolute;
        top:45px;
        right: 4px;
        border-radius: 3px;

    }
    .dropdown-major a,.dropdown-laboratory a,.dropdown-teachers a{
        display: inline-block;
        text-decoration: none;
        color: black;
        text-align: center;
        padding: 10px;
        margin: 0px;
    }

    .dropdown-major a:hover,.dropdown-laboratory a:hover,.dropdown-teachers a:hover{
        background-color: aqua;

    }

    .log{
        margin-left: auto;
    }

    .log a{
        text-decoration: none;
        color: black;
    }


    .new,.notice{
        background-color: whitesmoke;
        height: 100%;
    }

    .body{
        display: flex;

    }

    .body>.blank{
        flex-basis: 30%;
    }

    .body>.notice,.body>.new{
        flex-basis: 40%;
    }

    .onenew a{
        text-decoration: none;
        color: black;
    }
    .list{
        font-size: 20px;
        padding: 8px;
        margin: 5px;
        height: 80%;
    }
    .onenew{
        height: 20%;
        border-bottom-style: solid;
    }

    .time{
        font-size: 12px;
        height: 20%;
    }
    .footer{

        background-color: beige;
        width: 100%;
        position: fixed;
        bottom: 0;
        text-align:center;
    }
</style>
<body>
<div class="page">

    <div class="header"><h1>软件工程专业</h1></div>

    <div class="header-nav">
        <ul>
            <li class="major">专业介绍<div class="dropdown-major"><a href="../../HTML/majorone.html" target="_self">专业简介</a><a href="../../HTML/majortwo.html" target="_self">方向简介</a></div></li>
            <li class="laboratory">实验室 <div class="dropdown-laboratory"><a href="../../HTML/laboratoryone.html" target="_self">925移动开发实验室</a><a href="../../HTML/laboratorytwo.html" target="_blank">923实验室</a></div></li>
            <li class="teachers">教师队伍 <div class="dropdown-teachers"><a href="../../HTML/professor.html" class="professor">教授</a><a href="../../HTML/vice-professor.html">副教授</a><a href="../../HTML/teacher.html" class="teacher">讲师</a></div></li>
            <li class="employment-guidelines"><a href="../../HTML/employemt-guidelines.html">就业指南</a></li>
            <li class="log"><a href="/log" >登陆</a></li>
        </ul>

    </div>


    <div class="body">
        <div class="new">

            <c:forEach items="${new}" var="n" varStatus="s">
                <c:if test="${s.count<=5}">
                  <div class="onenew">

                        <div class="time"> <fmt:formatDate pattern="yyyy-MM-dd HH:mm " value="${n.newInsertTime }"/>
                        </div>
                      <div class="list"><a href="/news?nid=${n.newTitle}">${n.newTitle }</a></div>
        </div>
    </c:if>
            </c:forEach>

        </div>
        <div class="blank">
        </div>

        <div class="notice">
            <c:forEach items="${notice}" var="no" varStatus="t">
                <c:if test="${t.count<=5}">
                <div class="onenew">
                        <div class="list"><a href="/notice?noid=${no.noticeTitle}"> ${no.noticeTitle}</a></div>
                        <div class="time"> <fmt:formatDate pattern="yyyy-MM-dd HH:mm " value="${no.noticeInsertTime}"/>
                        </div>
                    </div>
                </c:if>
            </c:forEach>
        </div></div>
    </div>

    <div class="footer"><p>东北林业大学<sup>©</sup></p></div>

</div>
<script src="../../jquery.js"></script>
<script>

    $(".major").click(function (){
        $(".dropdown-major").slideToggle();
    });
    $(".laboratory").click(function (){
        $(".dropdown-laboratory").slideToggle();
    });
    $(".teachers").click(function (){
        $(".dropdown-teachers").slideToggle();
        $(".professor").hover(function () {
            $(".teacherslists1").toggle();
        },function () {
            $(".teacherslists1").toggle();
        });
    });



</script>
</body>
</html>
