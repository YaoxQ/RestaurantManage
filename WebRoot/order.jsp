<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body bgcolor="#D9DFFF">
<s:set name="dd" value="#request.ddInfo"></s:set>
<s:form action="order" method="post" enctype="multipart/from-data">
<table border="0" cellspacing="8" width="500">
<tr>
<td width="80">������ţ�</td>
<td>
<input type="text" name="dd.orderid" value="<s:property value="#dd.orderid"/>"readonly/>
</td>
</tr>
<tr>
<td width="80">�˵�ID
</td>
<td>
<select name="dd.Book.menuid" >
<s:iterator value="#request.Book" id="menuid">
<option value="<s:property value="#Book.id"/>">
</option>
<s:property/></s:iterator></select></td>
</tr>
<tr>
<td width="80">�˵����ƣ�</td>
<td>
<input type="text" name="dd.menuname" value="<s:property value="#dd.menuname"/>"readonly/>
</td>
</tr>
<tr>
<td width="80">������</td>
<td>
<input type="number" name="dd.number" value="<s:property value="#dd.number"/>"/>
</td>
</tr>
<tr>
<td width="80">�۸�</td>
<td ><input type="text" name="dd.price" value="<s:property value="#dd.price"/>"/>
</td>
</tr>
<tr><td width="120">���ɶ���ʱ�䣺</td>
<td><input type="datetime" name="dd.ordertime" value="<s:property value="#dd.ordertime"/>"/>
</td>
</tr> 
</table>
<input type="submit" value="ȷ��"/>
<input type="button" value="����" onclick="javascript:history.back();"/> </s:form></body></html>