<%@ page language="java" pageEncoding="gb2312"%>
<@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body bgcolor="#D9DFFF">
<table  border="1" cellspacing="8" width="500" style="width: 185px; "><tr><th><a href="addMenu.jsp">��Ӳ�Ʒ</a></th></tr> </table>
<table border="1" cellspacing="8" width="700">
<tr align="center" bgcolor="silver">
<th>��ƷID</th><th>��Ʒ ����</th><th>��Ʒ�۸�</th><th>����</th>
</tr>
<s:iterator value="#request.lis" id="dd">
<tr>
<td><s:property value="dd.id"/></td>
<td><s:property value="dd.name"/></td>
<td><s:property value="dd.price"/></td>
<td>
<a href="deleteMenu.action"?dd.id=<s:property value="#dd.id"/> onClick="if(!confirm('ȷ��ɾ���ò�Ʒ��Ϣ��'))return false;else return true;">ɾ��</a>
</td>
</tr>
</s:iterator>
<tr>
<s:set name="page" value="#request.page"></s:set>
<s:if test="#page.hasFirst">
<s:a href="MenuAction.action?pageNow=<s:property value="#page.pageNow-1"/>">��һҳ</s:a>
</s:if>
<s:if test="#page.hasPre">
<a:href="MenuAction.action"?pageNow=<s:property value="#page.pageNow+1"/>">��һҳ</a:href></s:if>
<s:if test="#page.hasLast">
<a:href="MenuAction.action"?pageNow=<s:property value="#page.totalPage"/>">βҳ</a:href></s:if>
</tr></table></body></html>