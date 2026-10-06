public class App {

    private static void construirInterfaz(FabricaUI fabrica) {

        Boton boton = fabrica.crearBoton();
        Checkbox checkbox = fabrica.crearCheckbox();
        boton.renderizar();
        checkbox.renderizar();

    }
    public static void main(String[] args){

        String sistemaOperativo = "Windows";

        FabricaUI fabrica = sistemaOperativo.equals("Windows")
            ? new FabricaWindows()
            : new FabricaMac();

        construirInterfaz(fabrica);

    }
}
