package ar.edu.unahur.obj2.ejercicio1;

import ar.edu.unahur.obj2.ejercicio1.EmpresaYEmpleados.Empleado;
import ar.edu.unahur.obj2.ejercicio1.EmpresaYEmpleados.Empresa;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;

public class EmpresaYEmpleado {

        Empresa empresa;
        Empresa empresa1;

        Empleado empleado;
        Empleado emplead1;

        @BeforeTest
        public void setup() {
            empresa = new Empresa("Jono S", 1990);
            empresa1 = new Empresa("Jon S", 2018);
            empleado = new Empleado("juan","Ar","1900","2019");
            emplead1 = new Empleado("Lisa","Simpson","1900","2019");

        }

        @Test
        public void aniadirEmpleado() {

            empresa.agrgarEmpleados(empleado);
            empresa.agrgarEmpleados(emplead1);

            empresa1.agrgarEmpleados(empleado);
            empresa1.agrgarEmpleados(emplead1);

            empresa.getEmpleados();
            List<Empleado> empleados = Arrays.asList(empleado, emplead1);
            Assert.assertEquals(empresa.empleados(), empleados);

        }

        @Test
        public void listarEmpresas() {
            List<Empresa> empresas = Stream.of(empresa, empresa1).collect(Collectors.toList());

            System.out.println(empresas);
        }

        @Test
        public void listarEmpresasYEmpleado() {
            empresa.agrgarEmpleados(empleado);
            empresa.agrgarEmpleados(emplead1);

            empresa1.agrgarEmpleados(empleado);
            empresa1.agrgarEmpleados(emplead1);

            List<Empresa> empresas = Stream.of(empresa, empresa1).collect(Collectors.toList());

            /*System.out.println(empresas.stream().map(
                    em -> em.empleados())
                    .flatMap(e -> e.stream()).collect(Collectors.toSet()));*/

            /*empresa.getEmpleados();*/

            System.out.println(empresas);
        }
    }







