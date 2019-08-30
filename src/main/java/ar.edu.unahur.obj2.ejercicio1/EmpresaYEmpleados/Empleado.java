package ar.edu.unahur.obj2.ejercicio1.EmpresaYEmpleados;

import java.util.ArrayList;

public class Empleado {
    private String nombre,apellido,fechaDeNacimiento,fechaDeContrato;

    public Empleado(String nombre, String apellido, String fechaDeNacimiento, String fechaDeContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.fechaDeContrato = fechaDeContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getFechaDeContrato() {
        return fechaDeContrato;
    }

    @Override
    public String toString() {
        return "Empleado :" +
                ", nombre='" + nombre  +
                ", apellido='" + apellido  +
                ", fechaDeNacimiento='" + fechaDeNacimiento  +
                ", fechaDeContrato=" + fechaDeContrato + '}';
    }
}
