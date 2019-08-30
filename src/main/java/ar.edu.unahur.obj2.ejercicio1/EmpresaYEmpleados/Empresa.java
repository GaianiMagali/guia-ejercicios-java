package ar.edu.unahur.obj2.ejercicio1.EmpresaYEmpleados;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Empresa {
    private String nombre;
    private int anioFundacion;
    ArrayList<Empleado> empleados = new ArrayList();


    public Empresa(String nombre, int anioFundacion){
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
    }

    //Get atributos
    public String getNombre() {
        return nombre;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    //Agregar empleados y retornarlas
    public void agrgarEmpleados(Empleado empleado){ empleados.add(empleado); }

    public void getEmpleados(){
        empleados.stream().map(e -> e.getNombre()).forEach(e -> System.out.println("Empleado : " + e));
    }

    public ArrayList<Empleado> empleados(){
        return empleados;
    }


    @Override
    public String toString() {
        return "Empresa: "+ "\n" +
                "nombre de Empresa :" + nombre + "\n" +
                "anioFundacion :" + anioFundacion + "\n" +
                "Empleados :" + empleados() + "\n"
              ;
    }
}
