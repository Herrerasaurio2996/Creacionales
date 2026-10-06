public interface PersonajeBuilder {

    void reset();

    void buildNombre(String nombre);
    
    void buildClase(String clase);
    
    void buildRaza(String raza);

    void buildRasgos(String rasgo);

    void buildNivel(int nivel);

    void buildArmaprincipal(String armaPrincipal);
    
    void buildArmadura(String armadura);

    void buildHabilidadesActivas(String activas);

    void buildHabilidadesPasivas(String pasivas);

    void buildMascota(String mascota);
}
