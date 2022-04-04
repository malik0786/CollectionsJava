package com.Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserDefinedException {

    public static void main(String[] args)  {
        int i;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            i = Integer.parseInt(br.readLine());
            if (i < 10) {
                throw new MyException("Error");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
    class MyException extends Exception{

        public MyException(String message) {
            super(message);
        }
    }

