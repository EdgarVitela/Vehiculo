package vehiculo;

public class Vehiculo {
    
private String color;
private String modelo;
private String marca;
private Motor motor1;
private Chasis chasis1;
private Llanta llanta1;

    public Vehiculo() {
    }

    public Vehiculo(String color, String modelo, String marca, Motor motor1, Chasis chasis1, Llanta llanta1) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.motor1 = motor1;
        this.chasis1 = chasis1;
        this.llanta1 = llanta1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor1() {
        return motor1;
    }

    public void setMotor1(Motor motor1) {
        this.motor1 = motor1;
    }

    public Chasis getChasis1() {
        return chasis1;
    }

    public void setChasis1(Chasis chasis1) {
        this.chasis1 = chasis1;
    }

    public Llanta getLlanta1() {
        return llanta1;
    }

    public void setLlanta1(Llanta llanta1) {
        this.llanta1 = llanta1;
    }
    
    

    


}
