package ar.edu.unahur.obj2.ejercicio1;

public abstract class Empleados {

    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private String cargo;
    private int sueldoBase;

    public Empleados(int dni, String nombre, String apellido, String email, String cargo, int sueldoBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.sueldoBase = sueldoBase;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public abstract int getSueldo();

    public int getSueldoBase() {
        return sueldoBase;
    }


    @Override
    public String toString() {
        return "Empleados{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cargo='" + cargo + '\'' +
                ", sueldoBase=" + sueldoBase + '}';
    }
}
