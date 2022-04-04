package com.Exception;

public class DemoException {

    public static void main(String[] args) {
      try {
          try {
              int a =30,b=0;
              int c =a/b;
          }catch (ArithmeticException e){
              System.out.println("Exception is  "+e);
          }
          try {
              int[] a = new int[5];
                    a[7]=9;
          }catch (ArrayIndexOutOfBoundsException e){
              System.out.println("Exception is " + e);
          }

      }catch (Exception e){
          System.out.println("Exception is " + e);
      }


    }
}
