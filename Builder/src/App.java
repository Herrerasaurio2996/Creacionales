public class App {
    public static void main(String[] args) throws Exception {
        
        //Builder Concreto
        BuilderConcretoPersonaje builderConcreto = new BuilderConcretoPersonaje();

        //Builder directos
        DirectorPersonaje director = new DirectorPersonaje(builderConcreto);

        //Creando los objetos con el director
        //Personaje Guerrero
        director.buildPersonajeGuerrero("Kael", 15);
        Personaje pj1 = builderConcreto.obtenerPersonaje();
        System.out.println("Personaje 1: " + pj1);
        System.out.println();
        
        //Personaje Mago
        director.buildPersonajeMago("Lyra", 12);
        Personaje pj2 = builderConcreto.obtenerPersonaje();
        System.out.println("Personaje 2: " + pj2);
        System.out.println();
        
        director.buildPersonajePicaro("Nyx", 18);
        Personaje pj3 = builderConcreto.obtenerPersonaje();
        System.out.println("Personaje 3: " + pj3);
        System.out.println();

        //Creando los objetos sin el director
        builderConcreto.reset();
        builderConcreto.buildNombre("Eldrin");
        builderConcreto.buildClase("Druida");
        builderConcreto.buildRaza("Enano");
        builderConcreto.buildRasgos("Sabio");
        builderConcreto.buildRasgos("Paciente");
        builderConcreto.buildRasgos("Bioempatia");
        builderConcreto.buildNivel(20);
        builderConcreto.buildArmaPrincipal("Baston de raices antiguas");
        builderConcreto.buildArmadura("Armadura de corteza");
        builderConcreto.buildHabilidadesActivas("Transformacion salvaje");
        builderConcreto.buildHabilidadesActivas("Raices atrapantes");
        builderConcreto.buildHabilidadesActivas("Curacion natural");
        builderConcreto.buildHabilidadesPasivas("Regeneracion");
        builderConcreto.buildHabilidadesPasivas("Resistencia elemental");
        builderConcreto.buildHabilidadesPasivas("Comunion con la naturaleza");
        builderConcreto.buildMascota("Oso pardo");
        Personaje pj4 = builderConcreto.obtenerPersonaje();
        System.out.println("Personaje 4: " + pj4);

        builderConcreto.reset();
        builderConcreto.buildNombre("Eldrin");
        builderConcreto.buildClase("Druida");
        builderConcreto.buildRaza("Enano");
        // ...solo los pasos que necesitemos
        Personaje eldrin = builderConcreto.obtenerPersonaje();
        System.out.println("Personaje: " + eldrin);


    }
}
