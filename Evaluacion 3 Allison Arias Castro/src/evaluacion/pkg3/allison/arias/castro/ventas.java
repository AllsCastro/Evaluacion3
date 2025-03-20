/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion.pkg3.allison.arias.castro;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author allis
 */
public class ventas {
    private String [] productos= {"Arroz", " Azucar", "Leche"};
    private int[][] venta= new int[7][productos.length]; 
    private String[] dias= {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
   
    public ventas(){
        generarVentasAleatorias();
    }
    private void generarVentasAleatorias(){
        Random rand= new Random();
        for (int i= 0; i < 7; i ++) {
            for (int j= 0; j < productos.length; j++) {
                venta [i][j] = rand.nextInt(10);   
                
            }
}

    }
    

    void mostrarVentas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void calcularVentasPorProducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void DiaConMayorVentas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void ProductoMasVendido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}