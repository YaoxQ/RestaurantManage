<%@ page language="java" pageEncoding="gb2312"%>
<@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body bgcolor="#D9DFFF">
<table  border="1" cellspacing="8" width="500" style="width: 185px; "><tr><th><a href="addMenu.jsp">添加菜品</a></th></tr> </table>
<table border="1" cellspacing="8" width="700">
<tr align="center" bgcolor="silver">
<th>菜品ID</th><th>菜品 名称</th><th>菜品价格</th><th>操作</th>
</tr>
<s:iterator value="#request.lis" id="dd">
<tr>
<td><s:property value="dd.id"/></td>
<td><s:property value="dd.name"/></td>
<td><s:property value="dd.price"/></td>
<td>
<a href="deleteMenu.action"?dd.id=<s:property value="#dd.id"/> onClick="if(!confirm('确定删除该菜品信息吗？'))return false;else return true;">删除</a>
</td>
</tr>
</s:iterator>
<tr>
<s:set name="page" value="#request.page"></s:set>
<s:if test="#page.hasFirst">
<s:a href="MenuAction.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</s:a>
</s:if>
<s:if test="#page.hasPre">
<a:href="MenuAction.action"?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a:href></s:if>
<s:if test="#page.hasLast">
<a:href="MenuAction.action"?pageNow=<s:property value="#page.totalPage"/>">尾页</a:href></s:if>
</tr></table></body></html>