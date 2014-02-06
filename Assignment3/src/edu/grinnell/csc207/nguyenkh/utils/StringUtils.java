package edu.grinnell.csc207.nguyenkh.utils;

import java.io.PrintWriter;
import java.util.ArrayList;

public class StringUtils
{
  public static String[] splitAt(String inputString, Character inputChar)
  {
    ArrayList<String> stringList = new ArrayList<String>();
    String tempString; // tempString is used to add each string into an array
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < inputString.length(); i++)
      {
        if (inputString.charAt(i) != inputChar)
          {
            sb.append(inputString.charAt(i));
          }// if
        else
          {
            tempString = sb.toString();
            stringList.add(tempString);
            sb.setLength(0);
          }// else
      }// for

    // After reaching the last character of the string, we need to do the
    // following
    tempString = sb.toString();
    stringList.add(tempString);
    sb.setLength(0);

    String[] stockArr = new String[stringList.size()];
    stockArr = stringList.toArray(stockArr);
    return stockArr;
  }// splitAt


  public static String[] splitCSV(String inputString)
  {
    ArrayList<String> stringList = new ArrayList<String>();
    String tempString;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < inputString.length(); i++)
      {
        if (inputString.charAt(i) == '"')
          {
            i++;
            while (i < inputString.length())
              {
                if (inputString.charAt(i) == '"'
                    && inputString.charAt(i + 1) == '"') //when there are two double quotation mark next to each other
                  {
                    sb.append('"');
                    i = i + 2;
                  }
                if (inputString.charAt(i) == '"')
                  {
                    break;
                  }
                else
                  {
                    sb.append(inputString.charAt(i));
                    i++;
                  }
              }
            i++; // skip over the double quotation mark
          }

        if (inputString.charAt(i) != ',')
          {
            sb.append(inputString.charAt(i));
          }// if
        else
          {
            tempString = sb.toString();
            stringList.add(tempString);
            sb.setLength(0);
          }// else
      }// for

    // After reaching the last character of the string, we need to do the
    // following
    tempString = sb.toString();
    stringList.add(tempString);
    sb.setLength(0);

    String[] stockArr = new String[stringList.size()];
    stockArr = stringList.toArray(stockArr);
    return stockArr;
  }// splitCSV

  public static String deLeet(String inputLeet)
  {
    StringBuilder outDeleet = new StringBuilder();
    for (int i = 0; i < inputLeet.length(); i++)
      {
        if (inputLeet.charAt(i) == '@')
          {
            outDeleet.append('a');
          }// if

        else if (inputLeet.charAt(i) == '|')
          {
            if (inputLeet.charAt(i + 1) == '3')
              {
                outDeleet.append('b');
                i++;
              }// inner if
            if (i < inputLeet.length() - 2)
              {
                if (inputLeet.charAt(i + 1) == '\\'
                    && inputLeet.charAt(i + 2) == '|')
                  {
                    outDeleet.append('n');
                    i = i + 2;
                  }// inner if
              }// if
          }// else if

        else if (inputLeet.charAt(i) == '3')
          {
            outDeleet.append('e');
          }// else if

        else if (inputLeet.charAt(i) == '1')
          {
            outDeleet.append('l');
          }// else if

        else if (inputLeet.charAt(i) == '0')
          {
            outDeleet.append('o');
          }// else if

        else if (inputLeet.charAt(i) == '+')
          {
            outDeleet.append('t');
          }// else if

        else
          {
            outDeleet.append(inputLeet.charAt(i));
          }// else if
      }
    return outDeleet.toString();
  }// deLeet

  public static void nameGame(String inputName)
  {
    int i = 0;
    while (inputName.charAt(i) != 'u' && inputName.charAt(i) != 'e'
           && inputName.charAt(i) != 'o' && inputName.charAt(i) != 'a'
           && inputName.charAt(i) != 'i')
      {
        i++;
      }// while
    String tempName = inputName.substring(i, inputName.length()); // the input
                                                                  // name
                                                                  // without
                                                                  // consonants
                                                                  // at the
                                                                  // beginning
    PrintWriter screenPen = new PrintWriter(System.out, true);
    screenPen.println(inputName + '!');
    screenPen.println(inputName + ", " + inputName + " bo " + 'B' + tempName
                      + " Bonana fanna fo " + 'F' + tempName);
    screenPen.println("Fee fy mo M" + tempName + ", " + inputName + '!');
  }// nameGame

  public static void main(String[] args)
    throws Exception
  {
    nameGame("Shirley");
    nameGame("Lincoln");
  }// main
}// stringUtils
