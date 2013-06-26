<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>error</title>
</head>
<body>
	<h2>报错啦...</h2>
	<s:property value="exception.message" />
</body>
</html>
