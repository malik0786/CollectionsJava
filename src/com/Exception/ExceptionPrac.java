package com.Exception;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionPrac {
    public static void main(String[] args) {
        int x,j=1,k;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x=8;
        try {
            System.out.println("Enter value of j");
            j=Integer.parseInt(br.readLine());
            k=x+j;
            System.out.println(k);
            if (k<10){
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException e){
            System.out.println("Minimum value would 10");
        }
catch (IOException e){
    System.out.println(e);
}

    }

}
