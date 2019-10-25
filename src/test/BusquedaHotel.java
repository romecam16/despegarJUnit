package test;

import org.junit.Test;

public class BusquedaHotel extends BaseTest {

    @Test
    public void prueba1() {
        buscarAlojamiento(ciudad, fechaEntrada, fechaSalida, numeroPersonas);
        verificarListaResultados(ciudad);

    }

    @Test
    public void prueba2() {

    }
}
