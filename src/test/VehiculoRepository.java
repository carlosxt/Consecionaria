package test;

import entities.Auto;
import entities.Moto;
import entities.Vehiculo;
import interfaces.I_VehiculoRepository;
import java.util.ArrayList;
import java.util.List;

public class VehiculoRepository implements I_VehiculoRepository {

    private final List<Vehiculo> lista;

    public VehiculoRepository() {
      lista = new ArrayList<>();
    }

    @Override
    public void cargar() {

        lista.add(new Auto("Peugeot", "206", 4, 200000));
        lista.add(new Moto("Honda","Titan",125,60000));
        lista.add(new Auto("Peugeot","208",5,250000));
        lista.add(new Moto("Yamaha","YBR",160,80500.50f));
    }
    
    public List<Vehiculo> getLista(){
        return lista;
    }
    
   
   
}
