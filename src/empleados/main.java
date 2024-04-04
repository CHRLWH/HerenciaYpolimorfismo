package empleados;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Jefe jefe1 = new Jefe(299999999,9000, "Miguel");
        jefe1.mostrar();

        Jefe jefe2 = new Jefe(2111222233,2777, "David");

        jefe2.mostrarCodigoEmpleado();

        //Polimorfismo, puedo guardar objetos de las clases hijo en uno de la clase padre.

        Empleado empleadoPrueba = jefe1;

        ArrayList <Empleado> listaEmpleados = new ArrayList<>();
        //En una lista del tipo de la clase padre puedo meter objetos de las clases hijos.
        listaEmpleados.add(jefe1);

        //En una lista de tipo de una clase hijo solo podré guardar objetos de esa misma clase.
        ArrayList <Jefe> listaJefes = new ArrayList<>();
        listaJefes.add(jefe2);
    }
}
