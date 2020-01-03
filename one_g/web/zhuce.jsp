<%--
  Created by IntelliJ IDEA.
  User: 徐斌的终极宝贝
  Date: 2020/1/3
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link />
</head>
<link rel="stylesheet" type="text/css" href="css/zhuce.css" />
<body><div class="header" id="head">
    <div class="title">在线学习系统</div>

</div>

<div class="wrap" id="wrap">
    <div class="logGet">
        <!-- 头部提示信息 -->

        <!-- 输入框 -->
        <form enctype="multipart/form-data">
            <!-- 头部提示信息 -->
            <div style="width:500px;float:left;margin:0 20px;">
                <div style="font-size:28px;">注册新用户</div>
                <br />
                <span class="p">*</span>
                <label for="username" class="l">用户名:</label>
                <div style="height:35px;width:300px;position:relative;display:inline;">
                    <input id="username" type="text" style="height:30px;width:100px;padding-right:50px;">
                    <span style="position:absolute;right:18px;top:2px;background-image:url(user.ico);height:16px;width:16px;display:inline-block;"></span>
                </div>
                <br /><br />
                <span class="p">*</span>
                <label for="phonenumber" class="l">手机号:</label>
                <div class="d">
                    <input id="phonenumber" type="text" class="i">
                </div>
                <br /><br />
                <span class="c">*</span>
                <label for="login_password" class="l">登录密码:</label>
                <div class="d">
                    <input id="login_password" type="text" class="i">
                </div>
                <br /><br />
                <span class="c">*</span>
                <label for="confirm_password" class="l">确认密码:</label>
                <div class="d">
                    <input id="confirm_password" type="text" class="i">
                </div>
                <br /><br />
                <span class="p">*</span>
                <label for="ver_code" class="l">验证码:</label>
                <div class="d">
                    <input id="ver_code" type="text" class="i">
                </div>
                <br /><br />
                <input type="checkbox" name="agree" style="margin-left:75px;display:inline-block;" value="1" />
                <span style="font-size:10px;">我已阅读并同意《用户注册协议》</span>
                <br /><br />
                <input type="submit" value="同意以上协议并注册" style="margin-left:50px;height:30px;width:225px;background-color:#ccFF90;display:inline-block;" />
            </div>
        </form>
    </div>
</div>

<div class="footer" id="foot">
    <div class="copyright">
        <p>Copyright © 2018 Qunar.com Inc. All Rights Reserved.</p>
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
