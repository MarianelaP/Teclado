/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package HolaTeclado;

/**
 *
 * @author Usuario
 */
public class java {

    /**
     * Creates a new instance of <code>java</code> without detail message.
     */
    public java() {
    }

    /**
     * Constructs an instance of <code>java</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public java(String msg) {
        super(msg);
    }
}

public class HolaTeclado {
    public static void main( String args[]){
        String nombre;
        int edad = 0;
        
        System.out.print("Dime tu nombre: ");
        nombre= Teclado.LeeCadena();
        
        System.out.print("Dime tu edad: ");
        nombre= Teclado.LeeEntero();
        
        System.out.println("Hola "+nombre+
                            ", tienes" +edad+ "años");
        nombre= Teclado.LeeCadena();
        
        
    }
}