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
public class Cliente {
    private String nombre;
    private int edad;
    private Date fecha;
    private ArrayList <Mascota>mascota;

    public Cliente(String nombre, int edad, Date fecha) {
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
        mascota= new ArrayList<>();
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Mascota> getMascota() {
        return mascota;
    }

    public void setMascota(ArrayList<Mascota> mascota) {
        this.mascota = mascota;
    }
    
    public void AsignarMascota(Mascota mascotas){
        mascota.add(mascotas);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", fecha=" + fecha + ", mascota=" + mascota + '}';
    }
    
    
    
}
