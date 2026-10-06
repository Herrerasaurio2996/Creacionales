//2. Prototipo Concreto
public class Carta implements PrototipoCarta{

    private String grupo;
    private String tema;
    private boolean esLimitado;
    private String integrante;
    private String rango;

    //Constructor normal

    public Carta(String grupo, String tema, boolean esLimitado) {
        this.grupo = grupo;
        this.tema = tema;
        this.esLimitado = esLimitado;

        //Atributos con un valor asignado por defecto
        this.integrante = "SIN ASIGNAR";
        this.rango = "C";   //?El rango mas bajo de todos
    }
    
    //Constructor clonando
    private Carta(Carta prototipo) {

        this.grupo = prototipo.grupo;
        this.tema = prototipo.tema;
        this.esLimitado = prototipo.esLimitado;
        this.integrante = prototipo.integrante;
        this.rango = prototipo.rango;

    }

    //? Getters
    public String getGrupo() {return this.grupo;}
    public String getTema() {return this.tema;}
    public boolean isEsLimitado() {return this.esLimitado;}
    public String getIntegrante() {return this.integrante;}
    public String getRango() {return this.rango;}

    @Override 
    public Carta clonar() {
        
        return new Carta(this);

    }

    public Carta asignarIntegrante(String integrante, String rango) {
        Carta clon = this.clonar();
        clon.integrante = integrante;
        clon.rango = rango;
        return clon;
    }

    public Carta asignarRango(String rango) {
        Carta clon = this.clonar();
        clon.rango = rango;
        return clon;
    }

    public void mostrarDetalles() {
        System.out.println("Carta [" + grupo + " - " + integrante + "] " +
               "| Rango: " + rango +
               " | Tema: " + tema + (esLimitado ? " (LE)" : ""));
    }
    
}