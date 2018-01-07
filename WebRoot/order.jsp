<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body bgcolor="#D9DFFF">
<s:set name="dd" value="#request.ddInfo"></s:set>
<s:form action="order" method="post" enctype="multipart/from-data">
<table border="0" cellspacing="8" width="500">
<tr>
<td width="80">订单编号：</td>
<td>
<input type="text" name="dd.orderid" value="<s:property value="#dd.orderid"/>"readonly/>
</td>
</tr>
<tr>
<td width="80">菜单ID
</td>
<td>
<select name="dd.Book.menuid" >
<s:iterator value="#request.Book" id="menuid">
<option value="<s:property value="#Book.id"/>">
</option>
<s:property/></s:iterator></select></td>
</tr>
<tr>
<td width="80">菜单名称：</td>
<td>
<input type="text" name="dd.menuname" value="<s:property value="#dd.menuname"/>"readonly/>
</td>
</tr>
<tr>
<td width="80">数量：</td>
<td>
<input type="number" name="dd.number" value="<s:property value="#dd.number"/>"/>
</td>
</tr>
<tr>
<td width="80">价格：</td>
<td ><input type="text" name="dd.price" value="<s:property value="#dd.price"/>"/>
</td>
</tr>
<tr><td width="120">生成订单时间：</td>
<td><input type="datetime" name="dd.ordertime" value="<s:property value="#dd.ordertime"/>"/>
</td>
</tr> 
</table>
<input type="submit" value="确定"/>
<input type="button" value="返回" onclick="javascript:history.back();"/> </s:form></body></html>