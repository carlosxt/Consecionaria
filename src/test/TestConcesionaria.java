package test;

import entities.Auto;
import entities.Moto;
import entities.Vehiculo;
import java.util.Collections;
import java.util.Comparator;

public class TestConcesionaria {

    public static void main(String[] args) {
        VehiculoRepository vr = new VehiculoRepository();
        vr.cargar();

        vr.
                getLista().forEach(System.out::println);
        System.out.println("=============================");

        //vehiculo(+)
        Vehiculo vehiculoc = vr
                .getLista()
                .stream()
                .max(Comparator.comparing(Vehiculo::getPrecio))
                .get();
        System.out.println("Vehículo más caro: " + vehiculoc.getMarca() + " "
                + "" + vehiculoc.getModelo()
        );

        //vehiculo(-)
        Vehiculo vehiculob = vr
                .getLista()
                .stream()
                .min(Comparator.comparing(Vehiculo::getPrecio))
                .get();
        System.out.println("Vehículo más barato: " + vehiculob.getMarca() + " "
                + "" + vehiculob.getModelo()
        );

        //vehiculo(y)
        vr
                .getLista()
                .stream()
                .filter(p -> p.getModelo().toLowerCase().contains("y"))
                .forEach(p -> System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + p.getMarca() + " "
                + p.getModelo() + " $"
                + p.getFormatPrecio()));
//                

        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        vr
                .getLista()
                .stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio).reversed())
                .forEach(p -> System.out.println(p.getMarca() + " " + p.getModelo()));

    }
}
