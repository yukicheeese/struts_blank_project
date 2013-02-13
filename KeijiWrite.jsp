
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<body>
<div align="center">
<h1>掲示板投稿</h1>
<html:form action="/Write">
<table border="1">

<tr>
	<th>おなまえ</th>
	<td><html:text name="KeijiWriteForm" property="username" size="40" /></td>
</tr>
<tr>
	<th>めーるあどれす</th>
	<td><html:text name="KeijiWriteForm" property="email" size="40" /></td>
</tr>
<tr>
	<th>たいとる</th>
	<td><html:text name="KeijiWriteForm" property="title" size="40" /></td>
</tr>
<tr>
	<th>ほんぶん</th>
	<td><html:text name="KeijiWriteForm" property="msg" /></td>
</tr>

</table>
<html:submit value="投稿" />
<html:reset value="元に戻す" />
</html:form>
</div>
</body>
</html>