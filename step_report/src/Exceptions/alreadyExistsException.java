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
public class alreadyExistsException extends Exception{
    
    public alreadyExistsException() {
       
    }
    public alreadyExistsException(String message) {
        super(message);
       System.out.println(message);
    }
}
