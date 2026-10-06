//3. Cliente
public class App {
    public static void main(String[] args) throws Exception {

        Carta cartaTIF = new Carta("Twice", "This is for", false);
        Carta cartaMina = cartaTIF.asignarIntegrante("Mina", "B");

        //* Se clona la carta con rango e integrante y se le modifica el rango
        //! No se modifica el rango a la carta inicial, sino al clon de dicha carta
        Carta cartaMinaR = cartaMina.asignarRango("R");

        Carta cartaMarsE = new Carta("Twice", "Mars", true);
        Carta cartaSana = cartaMarsE.asignarIntegrante("Sana", "A");

        Carta cartaLoud = new Carta("Nmixx", "LOUD", true);
        Carta cartaBae = cartaLoud.asignarIntegrante("Bae", "S");

        cartaMina.mostrarDetalles();
        cartaMinaR.mostrarDetalles();
        cartaSana.mostrarDetalles();
        cartaBae.mostrarDetalles();

        //Carta sin integrante ni rango asignado
        cartaTIF.mostrarDetalles();

    }
}