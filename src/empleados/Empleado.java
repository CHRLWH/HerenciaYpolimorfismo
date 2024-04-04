package empleados;

class Empleado {


    //ATRIBS

    private static int contadorAdds = 0;
    private int numeroEmpleado = contadorAdds+1;

    //El codigo del empleado se compone de la inicial + el numero de empleado
    private String codigoEmpleado;
    String nombre;
    int sueldo;


    //CONSTRUCTORES

    protected Empleado(String nombre, int sueldo){

        this.nombre = nombre;
        this.sueldo = sueldo;
        contadorAdds++;
        this.codigoEmpleado = String.valueOf(nombre.charAt(0))+contadorAdds;


    }

    //METHODS

    void subirSueldo(int aumento){

        int subida = sueldo+aumento;
        System.out.println(subida);
    }

    void mostrar(){
        System.out.println("Empleado numero: "+numeroEmpleado+"\nNombre= "+nombre+"\nSueldo= "+sueldo);
    }
    public static void cuantosEmpleadosHay () {
        System.out.println("Se han instanciado "+contadorAdds+" empleados");
    }

    void mostrarCodigoEmpleado(){
        System.out.println(codigoEmpleado);
    }

}
