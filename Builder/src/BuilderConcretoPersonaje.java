public class BuilderConcretoPersonaje implements PersonajeBuilder {

    private Personaje resultado;

public BuilderConcretoPersonaje() {reset();}

@Override 
public void reset() {this.resultado = new Personaje();}

@Override
public void buildNombre(String nombre) {resultado.setNombre(nombre);}

@Override 
public void buildClase(String clase) {resultado.setClase(clase);}

@Override 
public void buildRaza(String raza) {resultado.setRaza(raza);}

@Override 
public void buildRasgos(String rasgo) {resultado.agregarRasgos(rasgo);}

@Override 
public void buildNivel(int nivel) {resultado.setNivel(nivel);}

@Override
public void buildArmaPrincipal(String arma) {resultado.setArmaPrincipal(arma);}

@Override
public void buildArmadura(String armadura) {resultado.setArmadura(armadura);}

@Override
public void buildHabilidadesActivas(String activa) {resultado.agregarHabilidadesActivas(activa);}

@Override
public void buildHabilidadesPasivas(String pasiva) {resultado.agregarHabilidadesPasivas(pasiva);}

@Override
public void buildMascota(String mascota) {resultado.setMascota(mascota);}

public Personaje obtenerPersonaje() {return resultado;}

}