package com.knoldus


//A class to define all the methods of calculator
class CalculatorImpl {
  def add(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber

  def subtract(firstNumber: Int, secondNumber: Int): Int = firstNumber - secondNumber

  def multiply(firstNumber: Int, secondNumber: Int): Long = firstNumber * secondNumber

  def divide(numerator: Int, denominator: Int): Any = {
    if (denominator != 0) {
      numerator / denominator
    } else {
      "ArithmeticException : cant divide by 0"
    }
  }


  def power(number: Int, power: Int): Double = math.pow(number, power)

  def absolute(number: Int): Int = math.abs(number)

  def modulus(firstNumber: Int, secondNumber: Int): Any = {
    if (secondNumber != 0) {
      firstNumber % secondNumber
    } else {
      "ArithmeticException : cant divide by 0"
    }

  }


  def getMaximum(firstNumber: Int, secondNumber: Int): Int = {
    if (firstNumber > secondNumber) {
      firstNumber
    }
    else {
      secondNumber
    }
  }

  def getMinimum(firstNumber: Int, secondNumber: Int): Int = {
    if (firstNumber < secondNumber) {
      firstNumber
    }
    else {
      secondNumber
    }
  }

}
