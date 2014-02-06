package edu.grinnell.csc207.nguyenkh.utils;

import java.io.PrintWriter;

public class CalcExpt
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    //pen.println(Calculator.eval0("1 + 1 + 2"));
    String myString = "\"\"";
    pen.println(myString.length());
    pen.close();
  } // main(String[]

} // class CalcExpt
