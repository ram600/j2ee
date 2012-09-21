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
    <h:messages infoClass="infoClass" errorClass="errorClass"
            layout="table" globalOnly="true"/>
    <h:form id="calcForm">
  <h4>Calculator</h4>
    <h:panelGrid columns="3" rowClasses="oddRow,evenRow" styleClass="formGrid">
       <!--???? ??????-->
      <h:commandLink action="CALCULATOR" value="Calculator Application" />
      <h:commandLink action="CALCULATOR_REDIRECT" value="Calculator Application (redirect)" />
      <h:outputLink value="faces/calculator.jsf">
            <h:outputText value="Calculator Application (outputlink)"/>
       </h:outputLink>

      <%-- First Number--%>
      <h:outputLabel value="First Number" for="firstNumber" />
      <h:inputText id="firstNumber" binding="#{calculatorController.firstNumberInput}"
        value="#{calculatorController.calculator.firstNumber}"  required="true"  />
      <h:message for="firstNumber" showSummary="true" showDetail="false"/>
      <%-- Second Number--%>
      <h:outputLabel value="Second Number" for="secondNumber" />
      <h:inputText id="secondNumber"
        value="#{calculatorController.calculator.secondNumber}" binding="#{calculatorController.secondNumberInput}" required="true" />
      <h:message for="secondNumber" showSummary="true" showDetail="false"/>
   </h:panelGrid>
    <div>

      <h:commandButton action="#{calculatorController.add}"  value="Add" />
      <h:commandButton action="#{calculatorController.multiply}"  value="Multiply" />
      <h:commandButton action="#{calculatorController.clear}"  value="Clear" immediate="true"/>
      <h:commandButton action="HOME" value="Home" immediate="true"/>
    </div>

  </h:form>

  <h:panelGroup binding="#{calculatorController.resultsPanel}" >
    <h4>Results</h4>
   <h:panelGrid columns="1">
      <h:outputText value="First Number  #{calculatorController.calculator.firstNumber}"/>
      <h:outputText value="Second Number #{calculatorController.calculator.secondNumber}"/>
      <h:outputText value="Result  #{calculatorController.calculator.result}"/>
  </h:panelGrid>
  </h:panelGroup>
</f:view>

</body>
</html>