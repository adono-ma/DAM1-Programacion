/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ixche
 */
public class MyException extends Exception{
    public MyException(String error_msg) {
        super(error_msg);
        System.out.println("Error: Duplicado.");
        
        /*
        al suscribir se hace select en el registro, si devuelve 0, INSERT y return true
        si es algo distinto a 0, es que ya estaba suscrito, se manda un sout con un mensaje
        de error con un Este usuario ya estaba suscrito desde (fecha) y se hace el throws de duplicado
        */
    }
}
