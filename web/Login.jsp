<%--
  Created by IntelliJ IDEA.
  User: challengezwb
  Date: 4/6/17
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>photo store</title>
</head>
<body background="IMG_0704.JPG">
<div align="center" >
    <p style="font-size: 50px">NBA</p>
</div>
<div align="center" style="line-height :50px">
    <form name="form1" method="post" action="LoginServlet">
        <table width="615" border="0">
            <tr>
                <td width="123">UserName：</td>
                <td width="483"><label>
                    <input name="EmailAddress" type="text" size="50">
                </label></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input name="PassWord" type="password" size="50"></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td><label>
                    <input type="submit" name="Submit" value="enter">
                </label></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
