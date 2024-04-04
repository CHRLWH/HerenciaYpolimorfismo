package empleados;

class Empleado {


    //ATRIBS

    private static int contadorAdds = 0;
    private int numeroEmpleado = contadorAdds+1;
    String nombre;
    int sueldo;

    //CONSTRUCTORES

    protected Empleado(String nombre, int sueldo){

        this.nombre = nombre;
        this.sueldo = sueldo;
        contadorAdds++;


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


}
