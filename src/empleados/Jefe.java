package empleados;

import empleados.Empleado;

public class Jefe extends Empleado {

    //ATRIBS

    int presupuesto;

    //CONSTRUCTS

    public Jefe(int presupuesto, int sueldo, String nombre){
        //Llama al constructor de la clase padre (Empleado)
        super(nombre,sueldo);
        this.presupuesto = presupuesto;

    }
    //METHODS
    void asignarPpto(int ppto){
       this.presupuesto = ppto;
    }
    void mostrar(){
        //LLama al metodo mostrar de la clase padre (Empleado)
       super.mostrar();
        System.out.println("Presupuesto= "+presupuesto+"\n");
    }



}
