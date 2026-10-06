import java.util.ArrayList;
import java.util.List;

public class BuilderConcretoPersonaje implements PersonajeBuilder {

    private Personaje resultado;
    private List<String> rasgos = new ArrayList<>();
    private List<String> habilidadesActivas = new ArrayList<>();
    private List<String> habilidadesPasivas = new ArrayList<>();

@Override 
public void reset() {

    this.resultado = new Personaje();
    this.rasgos = new ArrayList<>();
    this.habilidadesActivas = new ArrayList<>();
    this.habilidadesPasivas = new ArrayList<>();


}

@Override
public void buildNombre(String nombre) {
    resultado.setNombre(nombre);
}

@Override 
public void buildClase(String clase) {
    resultado.setClase(clase);
}

@Override 
public void buildRaza(String raza) {
    resultado.setRaza(raza);
}

@Override 
public void buildRasgos(String rasgo) {

    this.rasgos.add(rasgo);

    resultado.setRasgos(rasgos);
}

@Override 
public void buildNivel(int nivel) {

    resultado.setNivel(nivel);

}

@Override
public void buildArmaprincipal(String arma) {

    resultado.setArmaPrincipal(arma);

}

@Override
public void buildArmadura(String armadura) {

    resultado.setArmadura(armadura);

}

@Override
public void buildHabilidadesActivas(String activa) {

    this.habilidadesActivas.add(activa);

    resultado.setHabilidadesActivas(habilidadesActivas);

}

@Override
public void buildHabilidadesPasivas(String pasiva) {

    this.habilidadesPasivas.add(pasiva);

    resultado.setHabilidadesPasivas(habilidadesPasivas);

}

@Override
public void buildMascota(String mascota) {

    resultado.setMascota(mascota);

}

public Personaje obtenerPersonaje() {

    return resultado;

}

}