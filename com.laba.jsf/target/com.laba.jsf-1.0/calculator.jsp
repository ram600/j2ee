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
<f:view>
  
    <h:form id="calcForm">
  <h4>Calculator</h4>
    <h:panelGrid columns="3" rowClasses="oddRow,evenRow" styleClass="formGrid">
      <%-- First Number--%>
      <h:outputLabel value="First Number" for="firstNumber" />
      <h:inputText id="firstNumber"
        value="#{calculator.firstNumber}" required="true" />
      <h:message for="firstNumber" />
      <%-- Second Number--%>
      <h:outputLabel value="Second Number" for="secondNumber" />
      <h:inputText id="secondNumber"
        value="#{calculator.secondNumber}" required="true" />
      <h:message for="secondNumber" />
   </h:panelGrid>
    <div>

      <h:commandButton action="#{calculator.add}"  value="Add" />
      <h:commandButton action="#{calculator.multiply}"  value="Multiply" />
      <h:commandButton action="#{calculator.clear}"  value="Clear" immediate="true"/>
    </div>

  </h:form>

  <h:panelGroup rendered="#{calculator.result != 0}">
    <h4>Results</h4>
   <h:panelGrid columns="1">
      <h:outputText value="First Number  #{calculator.firstNumber}"/>
      <h:outputText value="Second Number #{calculator.secondNumber}"/>
      <h:outputText value="Result  #{calculator.result}"/>
  </h:panelGrid>
  </h:panelGroup>
</f:view>

</body>
</html>