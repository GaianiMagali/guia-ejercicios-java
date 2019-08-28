package ar.edu.unahur.obj2.ejercicio1;

import ar.edu.unahur.obj2.ejercicio1.EmpresaYEmpleados.Empleado;
import ar.edu.unahur.obj2.ejercicio1.EmpresaYEmpleados.Empresa;

public class Imprim {

    public static void main(String[] args) {
        Empresa accenture = new Empresa("Accenture", 2018);
        Empresa fiat = new Empresa("Fiat", 2019);
        Empleado Juan = new Empleado("Juan","Jimenez","9/04/1994","12/08/2019");
        accenture.agregarEmpresa(accenture);
        fiat.agregarEmpresa(fiat);
        accenture.agregarEmpleado(Juan);


    }


}
