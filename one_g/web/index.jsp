<%--
  Created by IntelliJ IDEA.
  User: 徐斌的终极宝贝
  Date: 2019/12/25
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <title>在线学习系统</title>
</head>
<link rel="stylesheet" type="text/css" href="css/index.css" />
<body>
<div class="header" id="head">
  <div class="title">在线学习系统</div>

</div>

<div class="wrap" id="wrap">
  <div class="logGet">
    <!-- 头部提示信息 -->
    <div class="logD logDtip">
      <p class="p1">登录</p>
    </div>
    <!-- 输入框 -->
    <form name="post" method="post" action="do_login.jsp" onSubmit="return check(this);">
      <div class="lgD">
        <img src="img/logName.png" width="20" height="20" alt="" />
        <input type="uname" placeholder="输入用户名" />
      </div>
      <div class="lgD">
        <img src="img/logPwd.png" width="20" height="20" alt="" />
        <input type="upassword" placeholder="输入用户密码" />
      </div>
      <div class="logC">
        <a href="index.html" target="_self"><button>登 录</button></a>
      </div>
    </form>
    <div class="logE">
      <a href="" class="logF">注册</a>
      <a href="" class="logH">访客登陆</a>
    </div>
  </div>
</div>

<div class="footer" id="foot">
  <div class="copyright">
    <p>Copyright © 2019 Qunar.com Inc. All Rights Reserved.</p>
    <div class="img">
      <i class="icon"></i><span>联系邮箱：1918208027@qq.com</span>
    </div>

    <div class="img">
      <i class="icon1"></i><span>联系地址：河南质量工程职业学院</span>
    </div>
    <div class="img">
      <i class="icon2"></i><span>联系电话：15038436861</span>
    </div>


  </div>

</div>
</body>
</html>
