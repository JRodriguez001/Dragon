/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragon;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Perros extends Mascota {

    private String Raza;

    public Perros(String Raza, float codigo, String nombre, double peso, Date fecha) {
        super(codigo, nombre, peso, fecha);
        this.Raza = Raza;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + getNombre()
                + "\nCodigo: " + getCodigo()
                + "\nPeso: " + getPeso()
                + "\nFecha: " + getFecha()
                + "\nRaza: " + Raza);
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }
    
    

    @Override
    public String toString() {
        return "Raza=" + Raza ;
    }

}
