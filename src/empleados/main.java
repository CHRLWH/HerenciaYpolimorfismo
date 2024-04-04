package empleados;

public class main {
    public static void main(String[] args) {
        Jefe empleado1 = new Jefe(299999999,9000, "Miguel");
        empleado1.mostrar();

        Jefe empleado2 = new Jefe(2111222233,2777, "David");

        empleado2.mostrarCodigoEmpleado();
    }
}
