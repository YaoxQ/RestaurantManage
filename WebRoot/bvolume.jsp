<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
  <head>  
    <title>营业额情况</title>

  </head>
  
  <body>
   <table width="400" border=1>
    <caption>营业额情况如下：</caption>
    <tr>
    <th>订单编号</th> <th>总计价格</th><th>描述</th><th>操作</th>
    <s:iterator value="request.list" id="bsvolume">
       <td align="center" ><s:property value=bsvolume.orderid"/></td>
    </s:iterator>
    </tr>
   </table>
  </body>
</html>
