/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dragon;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Dragon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {

        ArrayList<Mascota> inventario = new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList();

        while (true) {

            Date fecha;
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

            int opt = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
                    + "1. Agregar Mascotas\n"
                    + "2. Agregar Clientes\n"
                    + "3. Asignar Mascota\n"
                    + "4. Listar Inventario Mascotas\n"
                    + "5. Reporte\n"
            )
            );

            if (opt == 1) {
                int sele = Integer.parseInt(JOptionPane.showInputDialog("Seleccione: \n"
                        + "1.Dragon\n"
                        + "2.Perro\n"));
                switch (sele) {
                    case 1: {
                        float codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo: "));
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
                        int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso en Lbs: "));
                        fecha = df.parse(JOptionPane.showInputDialog("Ingrese la fecha(MM/dd/yyyy): "));
                        Color color = JColorChooser.showDialog(null, "Seleccione el color", Color.yellow);

                        inventario.add(new Dragones(color, codigo, nombre, peso, fecha));

                        break;
                    }
                    case 2: {
                        float codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo: "));
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
                        int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso en Lbs: "));
                        fecha = df.parse(JOptionPane.showInputDialog("Ingrese la fecha(MM/dd/yyyy): "));
                        String Raza = JOptionPane.showInputDialog("Escriba la raza: ");

                        inventario.add(new Perros(Raza, codigo, nombre, peso, fecha));

                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                        break;
                    }
                }
            } else if (opt == 2) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
                fecha = df.parse(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (MM/DD/YYYY)"));

                clientes.add(new Cliente(nombre, edad, fecha));

            } else if (opt == 3) {

                for (Cliente cliente : clientes) {
                    JOptionPane.showMessageDialog(null, clientes.indexOf(cliente) + ". Nombre: " + cliente.getNombre());
                }
                int seleccion = Integer.parseInt(JOptionPane.showInputDialog("Seleccionar numero de cliente : "));

                for (Mascota mascotas : inventario) {
                    if (mascotas instanceof Perros) {
                        Perros perro = (Perros) mascotas;
                        JOptionPane.showMessageDialog(null, inventario.indexOf(mascotas) + ". Perro - Nombre: " + perro.getNombre() + ", Raza: " + perro.getRaza());
                    } else if (mascotas instanceof Dragones) {
                        Dragones dragon = (Dragones) mascotas;
                        JOptionPane.showMessageDialog(null, inventario.indexOf(mascotas) + ". Dragón - Nombre: " + dragon.getNombre() + ", Color: " + dragon.getColor());
                    }
                }
                int sele = Integer.parseInt(JOptionPane.showInputDialog("Seleccionar numero de mascota : "));
                Mascota mascotaAsig = inventario.remove(sele);
                clientes.get(seleccion).AsignarMascota(mascotaAsig);

            } else if (opt == 4) {
                JOptionPane.showMessageDialog(null, "Mascotas Disponibles");
                for (Mascota mascotas : inventario) {
                    if (mascotas instanceof Perros) {
                        Perros perro = (Perros) mascotas;
                        JOptionPane.showMessageDialog(null, "Perro - Nombre: " + perro.getNombre() + ", Raza: " + perro.getRaza());
                    } else if (mascotas instanceof Dragones) {
                        Dragones dragon = (Dragones) mascotas;
                        JOptionPane.showMessageDialog(null, "Dragón - Nombre: " + dragon.getNombre() + ", Color: " + dragon.getColor());
                    }
                }
            } else if (opt == 5) {
                for (Cliente cliente : clientes) {

                    JOptionPane.showMessageDialog(null, "Nombre: " + cliente.getNombre()
                            + "Edad: " + cliente.getEdad()
                            + "Fecha Nacimiento:" + cliente.getFecha()
                            + "Mascota Asignada: "
                    );

                    for (Mascota mascota : cliente.getMascota()) {
                        if (mascota instanceof Perros) {
                            Perros perro = (Perros) mascota;
                            JOptionPane.showMessageDialog(null, "Perro - Nombre: " + perro.getNombre() + ", Raza: " + perro.getRaza());
                        } else if (mascota instanceof Dragones) {
                            Dragones dragon = (Dragones) mascota;
                            JOptionPane.showMessageDialog(null, "Dragón - Nombre: " + dragon.getNombre() + ", Color: " + dragon.getColor());
                        }
                    }

                }
                JOptionPane.showMessageDialog(null, "Mascotas Disponibles");
                for (Mascota mascotas : inventario) {
                    if (mascotas instanceof Perros) {
                        Perros perro = (Perros) mascotas;
                        JOptionPane.showMessageDialog(null, "Perro - Nombre: " + perro.getNombre() + ", Raza: " + perro.getRaza());
                    } else if (mascotas instanceof Dragones) {
                        Dragones dragon = (Dragones) mascotas;
                        JOptionPane.showMessageDialog(null, "Dragón - Nombre: " + dragon.getNombre() + ", Color: " + dragon.getColor());
                    }
                }

            }
        }

    }

}
