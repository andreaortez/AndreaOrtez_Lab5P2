package andreaortez_lab5p2;

public class Personaje {

    private String nombre, debilidad, universo, poder;
    private double fuerza, afisica, amental, vida;

    public Personaje() {
    }

    public Personaje(String nombre, String debilidad, String universo, String poder, double fuerza, double afisica, double amental, double vida) {
        this.nombre = nombre;
        this.debilidad = debilidad;
        this.universo = universo;
        this.poder = poder;
        this.fuerza = fuerza;
        this.afisica = afisica;
        this.amental = amental;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getAfisica() {
        return afisica;
    }

    public void setAfisica(double afisica) {
        this.afisica = afisica;
    }

    public double getAmental() {
        return amental;
    }

    public void setAmental(double amental) {
        this.amental = amental;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String toStringNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Debilidad-> " + debilidad + "\nUniverso-> " + universo + "\nPoder-> " + poder + "\nFuerza-> " + fuerza + "\n Agilidad Fisica-> " + afisica
                + "\nAgilidad Mental-> " + amental + "\nPuntos de vida-> " + vida + '}';
    }

}
