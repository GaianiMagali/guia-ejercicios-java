package ar.edu.unahur.obj2.ejercicio1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Ejercicio1Test {

    @Test
    public void Testempleados() {
        Vendedor v1 = new Vendedor(2345,"Maguita", "Gaiani", "vendedor", "ma@", 30000);
        String nombre = v1.getNombre();
        assertEquals(nombre,"Magui");
    }
}