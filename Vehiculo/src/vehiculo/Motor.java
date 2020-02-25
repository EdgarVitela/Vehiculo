package vehiculo;

public class Motor {

private float peso;
private String marca;
private String modelo;

    public Motor() {
    }

    public Motor(float peso, String marca, String modelo) {
        this.peso = peso;
        this.marca = marca;
        this.modelo = modelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
