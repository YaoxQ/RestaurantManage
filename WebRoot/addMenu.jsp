<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html><head></head>
<body bgcolor="#D9DFFF">
<h3>请填写新添加菜品信息</h3>
<s:form action="addMenu" method="post" enctype="multipart/form-data">
<table border="0" cellspacing="0" cellpadding="1">
<tr><td>
<s:textfield name="Menu.MenuId" label="菜品ID" value=""></s:textfield></td>
</tr>
<tr><td>
<s:textfield name="Menu.MenuName" label="菜单名称" value=""></s:textfield></td>
</tr>
<tr><td>
<s:textfield name="Menu.Price" label="菜单价格" value=""></s:textfield></td>
</tr>
</table>
<p>
<input type="button" value="确定添加"/>  
<input type="reset" value="重置"/>
</p>
</s:form>
</body></html>