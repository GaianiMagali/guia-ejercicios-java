package ar.edu.unahur.obj2.ejercicio1;

public class Administrativo extends Empleados {
    private int hsExtras;
    private int hsMes;

    public Administrativo(int dni, String nombre, String apellido, String email, String cargo, int sueldoBase) {
        super(dni, nombre, apellido, email, cargo, sueldoBase);
    }

    public void setHsExtras(int hsExtras) {
        this.hsExtras = hsExtras;
    }

    public int getHsExtras() {
        return hsExtras;
    }


    public void setHsMes(int hsMes) {
        this.hsMes = hsMes;
    }

    public int getHsMes() {
        return hsMes;
    }

    @Override
    public int getSueldo() {
        return ( getSueldoBase() * (getHsExtras() * 1) + getHsMes());

    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "hsExtra=" + hsExtras +
                ", hsMes=" + hsMes +
                "}";

    }


}


