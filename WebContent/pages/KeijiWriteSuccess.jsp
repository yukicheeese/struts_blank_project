<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Action Class</title>
</head>
<body>

<logic:messagesNotPresent>
<bean:write name="KeijiWriteForm" property="username" />
<bean:write name="KeijiWriteForm" property="email" />
<bean:write name="KeijiWriteForm" property="title" />
<bean:write name="KeijiWriteForm" property="msg" />
</logic:messagesNotPresent>

<logic:messagesPresent>
<h1>エラーです。以下、
ActionErrorsオブジェクトに含まれるメッセージすべてを一覧表示</h1>
<html:errors/>
</logic:messagesPresent>

</body>
</html:html>