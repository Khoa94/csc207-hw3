package edu.grinnell.csc207.nguyenkh.utils;

import java.math.BigInteger;

public class Calculator
{
  public static BigInteger eval0(String input)
  {
    StringBuilder number1String = new StringBuilder();
    StringBuilder number2String = new StringBuilder();
    BigInteger number1 = BigInteger.valueOf(0);
    BigInteger number2 = BigInteger.valueOf(0);
    char operation1 = 0;
    int i = 0;

    // assign the 1st number of the string to number1
    while (i < input.length() && Character.isDigit(input.charAt(i)))
      {
        number1String.append(input.charAt(i));
        i++;
      }// while
    number1 = new BigInteger(number1String.toString());

    while (i < input.length())
      {
        if (i < input.length() - 2)
          {
            i++; // jump to the sign
            operation1 = (input.charAt(i));
            i = i + 2; // jump to the next number
          }// if

        while (i < input.length() && Character.isDigit(input.charAt(i)))
          {
            number2String.append(input.charAt(i));
            i++;
          }// while
        number2 = new BigInteger(number2String.toString());

        if (operation1 == '+')
          {
            number1 = number1.add(number2);
          }// if
        if (operation1 == '-')
          {
            number1 = number1.subtract(number2);
          }// if
        if (operation1 == '*')
          {
            number1 = number1.multiply(number2);
          }// if
        if (operation1 == '/')
          {
            number1 = number1.divide(number2);
          }// if
        if (operation1 == '^')
          {
            number1 = number1.pow(number2.intValue());// because pow takes int
                                                      // as an argument;
          }// if

        number2String.setLength(0);
        number2 = null;

      }// while
    return number1;
  }// eval0
}// Calculator
