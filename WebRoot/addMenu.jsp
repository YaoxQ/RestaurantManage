<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html><head></head>
<body bgcolor="#D9DFFF">
<h3>����д����Ӳ�Ʒ��Ϣ</h3>
<s:form action="addMenu" method="post" enctype="multipart/form-data">
<table border="0" cellspacing="0" cellpadding="1">
<tr><td>
<s:textfield name="Menu.MenuId" label="��ƷID" value=""></s:textfield></td>
</tr>
<tr><td>
<s:textfield name="Menu.MenuName" label="�˵�����" value=""></s:textfield></td>
</tr>
<tr><td>
<s:textfield name="Menu.Price" label="�˵��۸�" value=""></s:textfield></td>
</tr>
</table>
<p>
<input type="button" value="ȷ�����"/>  
<input type="reset" value="����"/>
</p>
</s:form>
</body></html>