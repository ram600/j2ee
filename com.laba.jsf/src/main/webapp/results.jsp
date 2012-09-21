<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
                      "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Calculator Application</title>
<link rel="stylesheet" type="text/css"
       href="<%=request.getContextPath()%>/css/main.css" />
</head>
<body>

<h:panelGrid columns="1" rowClasses="oddRow, evenRow">
    <h:commandLink action="calculatop" value="Return to the calculator page"/>
    <h:commandLink action="HOME" value="Go to the home page"/>
    <h:commandLink action="CALCULATOR" value="Go to main calculator page"/>
 </h:panelGrid>
    
</body>
</html>