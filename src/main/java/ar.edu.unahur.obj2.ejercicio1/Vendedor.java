package ar.edu.unahur.obj2.ejercicio1;

public class Vendedor extends Empleados {

    private int porcenComision;
    private int totalVentas;

    public Vendedor(int dni, String nombre, String apellido, String cargo, String email, int sueldoBase) {
        super(dni, nombre, apellido, cargo, email, sueldoBase);
        //Se puede agregar los atributos

    }

    public int getPorcentaje() {
        return porcenComision;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcenComision = porcentaje;
    }

    public int getTotalVtas() {
        return totalVentas;
    }

    public void setTotalVtas(int totalVtas) {
        this.totalVentas = totalVtas;
    }

    @Override
    public int getSueldo() {
        return getSueldoBase() + (getPorcentaje() * getTotalVtas() / 100);
    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "porcentajeComision=" + porcenComision +
                ", totalVentas=" + totalVentas +
                '}';
    }
}
