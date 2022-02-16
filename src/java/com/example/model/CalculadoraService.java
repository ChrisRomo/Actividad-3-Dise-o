/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

/**
 *
 * @author Chris
 */
public class CalculadoraService{
    public static String operacion = "";
    public static double calcularOp(double n1, double n2, String operacion){
        double respuesta = 0;
        
        if(operacion.equals("suma")){
            respuesta = n1 + n2;
        }
        else if(operacion.equals("resta")){
            respuesta = n1 - n2;
        }
        else if(operacion.equals("multiplicacion")){
            respuesta = n1 * n2;
        }
        else if(operacion.equals("division")){
            respuesta = n1 / n2;
        }
        else{
            respuesta = 0;
        }
        
        return respuesta;
    }
}
