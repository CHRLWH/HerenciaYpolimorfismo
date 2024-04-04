package empleados;

public class Currito extends Empleado{

    //ATRIBS

    String nombreJefe;

    //CONSTRUCTS

    public Currito(String nombreJefe, int sueldo, String nombre){

        super(nombre,sueldo);
        this.nombreJefe = nombreJefe;

    }

    //METHODS

    void asignarJefe(String nombre){
        this.nombreJefe = nombre;
    }
    void mostrar(){
        super.mostrar();
        System.out.println("Nombre del Jefe= "+nombreJefe);
    }
}
