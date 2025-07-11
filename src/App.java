import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreemap;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Daniel Cajas"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();
        runEmpleadoDAO();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.runHashMap();
        mapa.runLinkedHashMap();
        mapa.runTreeMap();
        mapa.runHashMapOb();
        mapa.runTreeMapOb();
    }

    private static void runEmpleadoDAO() {
        
        System.out.println("---- Prueba Empleados con HashMap ----");
         EmpleadoDAO daoHash = new EmpleadoDAOHashMap();
        EmpleadoContoller controllerHash = new EmpleadoContoller(daoHash);

        Empleado e1 = new Empleado(4, "Pedro", "DEV");
        Empleado e2 = new Empleado(2, "Pedro", "DEV");
        Empleado e3 = new Empleado(5, "Juan", "DEV");
        Empleado e4 = new Empleado(3, "Maria", "DEV");
        Empleado e5 = new Empleado(1, "Juan", "DEV");

        controllerHash.agregarEmpleado(e1);
        controllerHash.agregarEmpleado(e2);
        controllerHash.agregarEmpleado(e3);
        controllerHash.agregarEmpleado(e4);
        controllerHash.agregarEmpleado(e5);

        System.out.println("\n-- Lista con HashMap --");
        controllerHash.list();
        controllerHash.remove(2);
        System.out.println("\n-- Lista despues de eliminar ID 2 --");
        controllerHash.list();

        System.out.println("\n---- Prueba Empleados con TreeMap ----");
        EmpleadoDAO daoTree = new EmpleadoDAOTreemap();
        EmpleadoContoller controllerTree = new EmpleadoContoller(daoTree);

        controllerTree.agregarEmpleado(e1);
        controllerTree.agregarEmpleado(e2);
        controllerTree.agregarEmpleado(e3);
        controllerTree.agregarEmpleado(e4);
        controllerTree.agregarEmpleado(e5);

        System.out.println("\n-- Lista con TreeMap --");
        controllerTree.list();
        controllerTree.remove(2);
        System.out.println("\n-- Lista despues de eliminar ID 2 --");
        controllerTree.list();
    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
