package TestVehiculo;

import vehiculo.Motor;
import vehiculo.Vehiculo;

public class TestVehiculo {
    
public static void main (String [] args){
    
    Vehiculo vehiculo1=new Vehiculo ();
    vehiculo1.setMotor1(new Motor());
    vehiculo1.getMotor1().setPeso(50.2f);
    vehiculo1.getMotor1().setMarca("Ferrari");
    vehiculo1.getMotor1().setModelo("Nuevo");
    
    System.out.println(vehiculo1.getMotor1().getPeso());
    System.out.println(vehiculo1.getMotor1().getMarca());
    System.out.println(vehiculo1.getMotor1().getModelo());
    
}
}