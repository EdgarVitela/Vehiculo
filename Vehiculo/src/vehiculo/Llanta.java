package vehiculo;

public class Llanta {
   
private float peso;
private float tamaño;
private String material;

    public Llanta() {
    }

    public Llanta(float peso, float tamaño, String material) {
        this.peso = peso;
        this.tamaño = tamaño;
        this.material = material;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


}
