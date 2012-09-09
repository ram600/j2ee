/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calc;

/**
 *
 * @author linux
 */
public class Calculator {

    /** Первый операнд */
    private int firstNumber = 0;

    /** Результат операции */
    private int result = 0;

    /** Второй операнд */
    private int secondNumber = 0;

    /** Сложение операндов */
    public void add() {
    result = firstNumber + secondNumber;
  }

    /** Перемножение операндов */
  public void multiply() {
    result = firstNumber * secondNumber;
  }

  /** Сброс результата */
  public void clear() {
    result = 0;
  }

  /* ---------- свойства ------------- */

    public Calculator() {
    }

  
  public int getFirstNumber() {
    return firstNumber;
  }

  public void setFirstNumber(int firstNumber) {
    this.firstNumber = firstNumber;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int getSecondNumber() {
    return secondNumber;
  }

  public void setSecondNumber(int secondNumber) {
    this.secondNumber = secondNumber;
  }

}