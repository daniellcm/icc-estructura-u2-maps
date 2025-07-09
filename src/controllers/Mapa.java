package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }
        public void runHashMap() {
            Map<String, String> mapa = new HashMap<>();
            mapa.put("001" , "Celular");
            mapa.put("002" , "Laptop");
            mapa.put("003" , "Celular");
            mapa.put("003" , "PC");
            System.out.println(mapa); 
            System.out.println(mapa.keySet());
            System.out.println("----- RunHashMap -----");

            for (String clave : mapa.keySet()) {               
                System.out.println(mapa.get(clave));
            }
            System.out.println(mapa.get("001"));
            System.out.println(mapa.get("005"));    
        }

        public void runLinkedHashMap() {
            //Crear un mapa con clave numeros y valor nombre de personas solo nombres
            //Integer - String
            //Agregar 5 elementos e imprimir todos los VALORES
            Map<Integer, String> linkedMap = new HashMap<>();
            linkedMap.put(1, "Daniel");
            linkedMap.put(2, "Diana");
            linkedMap.put(3, "Anabel");
            linkedMap.put(4, "Jose");
            linkedMap.put(5, "Luis");
            System.out.println("----- RunLinkedHashMap -----");
            
            for (String valores : linkedMap.values()) {
                System.out.println(valores);
            }
        }

        public void runTreeMap() {
            Map<Integer, String> items = new TreeMap<>();
            items.put(3, "carro");
            items.put(6, "bicicleta");
            items.put(1, "moto");
            //Imprimir los valores
            System.out.println("----- RunTreeMap -----");
            System.out.println(items);
        }

        public void runHashMapOb() {
            Map<Empleado, Integer> empleados = new HashMap<>();
            empleados.put(new Empleado(1, "Juan" , "Dev, "), 1200);
            empleados.put(new Empleado(2, "Juan" , "Dev, "), 1500);
            empleados.put(new Empleado(3, "Pedro" , "Dev, "), 2000);
            empleados.put(new Empleado(1, "Pedro" , "Dev, "), 2500);
            empleados.put(new Empleado(1, "Diego" , "Dev, "), 3000);
            System.out.println("----- RunHashMapOb -----");
            System.out.println(empleados);
            System.out.println("----- HashMap -----");
            for (Empleado empleado : empleados.keySet()) {               
                System.out.println("Empleado: " + empleado + "HashCode: " + empleado.hashCode());
            }
        }

        public void runTreeMapOb() {
            Map<Empleado, Integer> empleados = new TreeMap<>();
            empleados.put(new Empleado(1, "Juan" , "Dev"), 1200);
            empleados.put(new Empleado(2, "Juan" , "Dev"), 1500);
            empleados.put(new Empleado(3, "Pedro" , "Dev"), 2000);
            empleados.put(new Empleado(1, "Diego" , "Dev"), 1200);
            empleados.put(new Empleado(1, "Juan" , "Senior"), 3000);
            System.out.println("----- RunTreeMapOb -----");
            for (Map.Entry<Empleado, Integer> entry : empleados.entrySet()) {
                Empleado empleado = entry.getKey();
                Integer salario = entry.getValue();
                System.out.println("Empleado: " + empleado + ", Salario: " + salario);
            }
        }    
}
