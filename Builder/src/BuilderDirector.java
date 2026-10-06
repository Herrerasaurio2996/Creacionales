public class BuilderDirector {

    private PersonajeBuilder builder;

    BuilderDirector(PersonajeBuilder builder) {

        this.builder = builder;
    
    }

    public void cambiarPersonaje(PersonajeBuilder builder) {

        this.builder = builder;

    }

    //Personaje Guerrero
    public void buildPersonajeGuerrero() {

        builder.reset();
        builder.buildNombre("Kael");
        builder.buildClase("Guerrero");
        builder.buildRaza("Humano");
        builder.buildRasgos("Valiente");
        builder.buildRasgos("Resistente");
        builder.buildRasgos("Lider");
        builder.buildNivel(15);
        builder.buildArmaprincipal("Espada de acero");
        builder.buildArmadura("Armadura pesada");
        builder.buildHabilidadesActivas("Golpe devastador");
        builder.buildHabilidadesActivas("Carga brutal");
        builder.buildHabilidadesActivas("Provocar");
        builder.buildHabilidadesPasivas("Resistencia Fisica");
        builder.buildHabilidadesPasivas("Maestro de la espada");
        builder.buildMascota("Lobo gris");

    }

    //Personaje Mago
    public void buildPersonajeMago() {

        builder.reset();
        builder.buildNombre("Lyra");
        builder.buildClase("Maga");
        builder.buildRaza("Elfa");
        builder.buildRasgos("Inteligente");
        builder.buildRasgos("Serena");
        builder.buildRasgos("Misteriosa");
        builder.buildNivel(12);
        builder.buildArmaprincipal("Baculo de cristal");
        builder.buildArmadura("Tunica arcana");
        builder.buildHabilidadesActivas("Bola de fuego");
        builder.buildHabilidadesActivas("Rayo de hielo");
        builder.buildHabilidadesActivas("Teletransporte");
        builder.buildHabilidadesPasivas("Regeneracion de mana");
        builder.buildHabilidadesPasivas("Afinidad elemental");
        builder.buildMascota("Buho magico");

    }

    //Personaje Picaro
    public void buildPersonajePicaro() {

        builder.reset();
        builder.buildNombre("Nyx");
        builder.buildClase("Picaro");
        builder.buildRaza("Medio elfo");
        builder.buildRasgos("Agil");
        builder.buildRasgos("Astuto");
        builder.buildRasgos("Sigiloso");
        builder.buildNivel(18);
        builder.buildArmaprincipal("Dagas gemelas");
        builder.buildArmadura("Armadura de cuero oscuro");
        builder.buildHabilidadesActivas("Ataque furtivo");
        builder.buildHabilidadesActivas("Paso Sombrio");
        builder.buildHabilidadesActivas("Lanzamiento de dagas");
        builder.buildHabilidadesPasivas("Evasion");
        builder.buildHabilidadesPasivas("Daño critico aumentado");
        builder.buildMascota("Cuervo negro");

    }
    
}
