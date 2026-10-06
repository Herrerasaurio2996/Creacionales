public class App {
    public static void main(String[] args) throws Exception {

        Logistica logisticaTerrestre = new LogisticaTerrestre();
        logisticaTerrestre.planificarEntrega();

        System.out.println();

        Logistica logisticaMaritima = new LogisticaMaritima();
        logisticaMaritima.planificarEntrega();
    }
}
