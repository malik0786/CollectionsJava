package com.Exception;

public class MultipleCatch {
    public static void main(String[] args) {

            try {
                int a =30,b=0;
                int c =a/b;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception is " + e);
            }
            catch (ArithmeticException e){
                System.out.println("Exception is  "+e);
            }
            catch (Exception e){
            System.out.println("Exception is " + e);
        }finally {
                System.out.println("This would always execute");
            }
    }
}
