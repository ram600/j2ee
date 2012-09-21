/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.calc;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;

/**
 *
 * @author admin
 */
public class CalculatorController {

    private Calculator calculator;
    private UIPanel resultsPanel;
    private UIInput firstNumberInput;
    private UIInput secondNumberInput;


    public String add(){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        try {
            calculator.add();
            resultsPanel.setRendered(true);
            facesContext.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,  "Added successfully",null));
        } catch (Exception e) {
            resultsPanel.setRendered(false);
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), null));
        }
        return "results";
    }

    public String multiply() {
    FacesContext facesContext = FacesContext.getCurrentInstance();

    try {
      calculator.multiply();
      resultsPanel.setRendered(true);
      facesContext.addMessage(null, new FacesMessage(
          FacesMessage.SEVERITY_INFO, "Multiplied successfully", null));

    } catch (Exception ex) {
      resultsPanel.setRendered(false);
      facesContext.addMessage(null,
          new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), null));
    }
    return null;
  }

  public String divide() {
    FacesContext facesContext = FacesContext.getCurrentInstance();

    try {
      calculator.divide();
      resultsPanel.setRendered(true);
      facesContext.addMessage(null, new FacesMessage(
          FacesMessage.SEVERITY_INFO, "Divided successfully", null));

    } catch (Exception ex) {
      resultsPanel.setRendered(false);
      if (ex instanceof ArithmeticException) {
        secondNumberInput.setValue(Integer.valueOf(1));
      }
      facesContext.addMessage(null,
          new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), null));
    }
    return null;
  }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public UIInput getFirstNumberInput() {
        return firstNumberInput;
    }

    public void setFirstNumberInput(UIInput firstNumberInput) {
        this.firstNumberInput = firstNumberInput;
    }

    public UIPanel getResultsPanel() {
        return resultsPanel;
    }

    public void setResultsPanel(UIPanel resultsPanel) {
        this.resultsPanel = resultsPanel;
    }

    public UIInput getSecondNumberInput() {
        return secondNumberInput;
    }

    public void setSecondNumberInput(UIInput secondNumberInput) {
        this.secondNumberInput = secondNumberInput;
    }

  public String clear() {
    FacesContext facesContext = FacesContext.getCurrentInstance();

    try {
      calculator.clear();
      resultsPanel.setRendered(false);
      facesContext.addMessage(null, new FacesMessage(
          FacesMessage.SEVERITY_INFO, "Results cleared", null));

    } catch (Exception ex) {
      resultsPanel.setRendered(false);
      facesContext.addMessage(null,
          new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), null));
    }
    return null;
  }


}
