import java.util.ArrayList;
import java.util.List;

public class Personaje {

    //Atributos
    private String nombre;
    private String clase;
    private String raza;
    private List<String> rasgos = new ArrayList<>();
    private int nivel;
    private String armaPrincipal;
    private String armadura;
    private List<String> habilidadesActivas = new ArrayList<>();
    private List<String> habilidadesPasivas = new ArrayList<>();
    private String mascota;

    //? Setters (Para que el builder pueda construir el objeto paso a paso)
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setClase(String clase) {this.clase = clase;}
    public void setRaza(String raza) {this.raza = raza;}
    public void setRasgos(List<String> rasgos) {this.rasgos = rasgos;}
    public void setNivel(int nivel) {this.nivel = nivel;}
    public void setArmaPrincipal(String armaPrincipal) {this.armaPrincipal = armaPrincipal;}
    public void setArmadura(String armadura) {this.armadura = armadura;}
    public void setHabilidadesActivas(List<String> activas) {this.habilidadesActivas = activas;}
    public void setHabilidadesPasivas(List<String> pasivas) {this.habilidadesPasivas = pasivas;}
    public void setMascota(String mascota) {this.mascota = mascota;}
    
    //? Getters (No son obligatorios pero me da TOC)
    public String getNombre() {return this.nombre;}
    public String getClase() {return this.clase;}
    public String getRaza() {return this.raza;}
    public List<String> getRasgos() {return this.rasgos;}
    public int getNivel() {return this.nivel;}
    public String getArmaPrincipal() {return this.armaPrincipal;}
    public String getArmadura() {return this.armadura;}
    public List<String> getHabilidadesActivas() {return this.habilidadesActivas;}
    public List<String> getHabilidadesPasivas() {return this.habilidadesPasivas;}
    public String getMascota() {return this.mascota;}

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", clase='" + getClase() + "'" +
            ", raza='" + getRaza() + "'" +
            ", rasgos='" + getRasgos() + "'" +
            ", nivel='" + getNivel() + "'" +
            ", armaPrincipal='" + getArmaPrincipal() + "'" +
            ", armadura='" + getArmadura() + "'" +
            ", habilidadesActivas='" + getHabilidadesActivas() + "'" +
            ", habilidadesPasivas='" + getHabilidadesPasivas() + "'" +
            ", mascota='" + getMascota() + "'" +
            "}";
    }
}