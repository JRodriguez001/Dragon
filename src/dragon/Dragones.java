/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragon;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Dragones extends Mascota {

    private Color color;

    public Dragones(Color color, float codigo, String nombre, double peso, Date fecha) {
        super(codigo, nombre, peso, fecha);
        this.color = color;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + getNombre()
                + "\nCodigo: " + getCodigo()
                + "\nPeso: " + getPeso()
                + "\nFecha: " + getFecha()
                + "\nColor: " + color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "color=" + color;
    }

    
    
}
