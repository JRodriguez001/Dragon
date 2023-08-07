/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragon;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author david
 */
public class Mascota {

    private float codigo;
    private String nombre;
    private double peso;
    private Date fecha;
    

    public Mascota() {
    }

    public Mascota(float codigo) {
        this.codigo = codigo;
    }

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public Mascota(double peso) {
        this.peso = peso;
    }

    public Mascota(float codigo, String nombre, double peso, Date fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
        this.fecha = fecha;
    }

    

    public float getCodigo() {
        return codigo;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   

    @Override
    public String toString() {
        return "Mascota{" + "codigo=" + codigo + ", nombre=" + nombre + ", peso=" + peso + ", fecha=" + fecha + '}';
    }

}
