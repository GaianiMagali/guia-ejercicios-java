package ar.edu.unahur.obj2.ejercicio1.Ticket;

public class Ticket {

    public String nombreProducto;
    public Double preciosUnidad;
    public int numeroUnidades;

    public Ticket(String nombreProducto, Double precioUnidad, int numeroUnidades){
        this.nombreProducto = nombreProducto;
        this.preciosUnidad = precioUnidad;
        this.numeroUnidades = numeroUnidades;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Double getPreciosUnidad() {
        return preciosUnidad;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "nombreProducto=" + nombreProducto +
                ", preciosUnidad='" + preciosUnidad + '\'' +
                ", numeroUnidades='" + numeroUnidades + '}';
    }
}
