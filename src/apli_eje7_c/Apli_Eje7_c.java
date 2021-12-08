/*Ejercicio 7: Pedir 3 números y mostrarlos ordenados de mayor a menor*/
package apli_eje7_c;

import javax.swing.JOptionPane;

public class Apli_Eje7_c {

    public static void main(String[] args) {
        //Declaración de variables
        int n1, n2, n3;
        
        // Pedir el ingreso de los números por medio de ventanas emergentes:
        n1 = Integer.parseInt (JOptionPane.showInputDialog ("Digite número 1: "));
        n2 = Integer.parseInt (JOptionPane.showInputDialog ("Digite número 1: "));
        n3 = Integer.parseInt (JOptionPane.showInputDialog ("Digite número 1: "));
        
        //Construir la condición por medio de la sentencia if
        //Cuando n1>n2>n3
        if ((n1 > n2) && (n2 > n3)){
            JOptionPane.showMessageDialog(null, "Orden: "+n1+" - "+n2+" - "+n3);
        }
        //Cuando n1>n3>n2 
            else if ((n1 > n3) && (n3 > n2)){
            JOptionPane.showMessageDialog(null, "Orden: "+n1+" - "+n3+" - "+n2);
            }
        //Cuando n2>n1>n3 
            else if ((n2 > n1) && (n1 > n3)){
            JOptionPane.showMessageDialog(null, "Orden: "+n2+" - "+n1+" - "+n3);
            }
        //Cuando n2>n3>n1 
            else if ((n2 > n3) && (n3 > n1)){
            JOptionPane.showMessageDialog(null, "Orden: "+n2+" - "+n3+" - "+n1);
        }
        //Cuando n3>n1>n2 
            else if ((n3 > n1) && (n1 > n2)){
            JOptionPane.showMessageDialog(null, "Orden: "+n3+" - "+n1+" - "+n2);
            }
        //Cuando n2>n1>n3 
            else {
            JOptionPane.showMessageDialog(null, "Orden: "+n3+" - "+n2+" - "+n1);
            }
    }
    
}
