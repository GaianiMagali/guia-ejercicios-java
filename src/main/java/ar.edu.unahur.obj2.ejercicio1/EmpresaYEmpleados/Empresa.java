package ar.edu.unahur.obj2.ejercicio1.EmpresaYEmpleados;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private int anioFundacion;
    ArrayList<Empresa> empleados = new ArrayList();


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
    public void agrgarEmpleados(Empresa empresa){ empleados.add(empresa); }

    public ArrayList<Empresa> getEmpresa(){
        return empleados;
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "nombre=" + nombre +
                ", anioFundacion='" + anioFundacion
              + '}';
    }
}
