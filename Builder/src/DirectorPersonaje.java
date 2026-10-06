public class DirectorPersonaje {

    private PersonajeBuilder builder;

    public DirectorPersonaje(PersonajeBuilder builder) {

        this.builder = builder;
    
    }

    public void cambiarPersonaje(PersonajeBuilder builder) {

        this.builder = builder;

    }

    //Personaje Guerrero
    public void buildPersonajeGuerrero(String nombre, int nivel) {

        builder.reset();
        builder.buildNombre(nombre);
        builder.buildClase("Guerrero");
        builder.buildRaza("Humano");
        builder.buildRasgos("Valiente");
        builder.buildRasgos("Resistente");
        builder.buildRasgos("Lider");
        builder.buildNivel(nivel);
        builder.buildArmaPrincipal("Espada de acero");
        builder.buildArmadura("Armadura pesada");
        builder.buildHabilidadesActivas("Golpe devastador");
        builder.buildHabilidadesActivas("Carga brutal");
        builder.buildHabilidadesActivas("Provocar");
        builder.buildHabilidadesPasivas("Resistencia Fisica");
        builder.buildHabilidadesPasivas("Maestro de la espada");
        builder.buildMascota("Lobo gris");

    }

    //Personaje Mago
    public void buildPersonajeMago(String nombre, int nivel) {

        builder.reset();
        builder.buildNombre(nombre);
        builder.buildClase("Maga");
        builder.buildRaza("Elfa");
        builder.buildRasgos("Inteligente");
        builder.buildRasgos("Serena");
        builder.buildRasgos("Misteriosa");
        builder.buildNivel(nivel);
        builder.buildArmaPrincipal("Baculo de cristal");
        builder.buildArmadura("Tunica arcana");
        builder.buildHabilidadesActivas("Bola de fuego");
        builder.buildHabilidadesActivas("Rayo de hielo");
        builder.buildHabilidadesActivas("Teletransporte");
        builder.buildHabilidadesPasivas("Regeneracion de mana");
        builder.buildHabilidadesPasivas("Afinidad elemental");
        builder.buildMascota("Buho magico");

    }

    //Personaje Picaro
    public void buildPersonajePicaro(String nombre, int nivel) {

        builder.reset();
        builder.buildNombre(nombre);
        builder.buildClase("Picaro");
        builder.buildRaza("Medio elfo");
        builder.buildRasgos("Agil");
        builder.buildRasgos("Astuto");
        builder.buildRasgos("Sigiloso");
        builder.buildNivel(nivel);
        builder.buildArmaPrincipal("Dagas gemelas");
        builder.buildArmadura("Armadura de cuero oscuro");
        builder.buildHabilidadesActivas("Ataque furtivo");
        builder.buildHabilidadesActivas("Paso Sombrio");
        builder.buildHabilidadesActivas("Lanzamiento de dagas");
        builder.buildHabilidadesPasivas("Evasion");
        builder.buildHabilidadesPasivas("Daño critico aumentado");
        builder.buildMascota("Cuervo negro");

    }
    
}
