package empleados;

class Empleado {


    //ATRIBS

    String nombre;
    int sueldo;

    //CONSTRUCTORES

    protected Empleado(String nombre, int sueldo){

        this.nombre = nombre;
        this.sueldo = sueldo;

    }

    //METHODS

    void subirSueldo(int aumento){

        int subida = sueldo+aumento;
        System.out.println(subida);
    }

    void mostrar(){
        System.out.println("Nombre= "+nombre+"\nSueldo= "+sueldo);
    }


}
