/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Kildare
 */
public class notFoundException extends Exception{
    

    public notFoundException() {
       
    }
    public notFoundException(String message) {
        super(message);
       System.out.println(message);
    }
}
