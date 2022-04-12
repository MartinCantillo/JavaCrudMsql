/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadPersona;

/**
 *
 * @author marti
 */
public class EntidadPersona {
     private int cedula;
    private String nombre;
    private int edad; 
    private String cargo;

    public EntidadPersona() {
    }

    public EntidadPersona(int cedula) {
        this.cedula = cedula;
    }

    public EntidadPersona(int cedula, String nombre, int edad, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
