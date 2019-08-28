package ar.edu.unahur.obj2.ejercicio1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EjercicioAdministradorYVendedores {

    Vendedor v1;

    @BeforeTest
    public void setup() {
        v1 = new Vendedor(2345,"Maguita", "Gaiani", "vendedor", "ma@", 30000);
    }

    @Test
    public void Testempleados() {
        assertEquals(v1.getNombre(),"Maguita");
    }
}
