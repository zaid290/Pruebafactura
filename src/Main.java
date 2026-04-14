public class Main {

    public static void main(String[] args) {
        SistemaFactura sis = new SistemaFactura();
        Factura factura = null;
        int opc;

        do {
            opc = SistemaFactura.menu();

            switch (opc) {
                case 1:
                    factura = sis.crearFactura();
                    break;
                case 2:
                    sis.imprimirFactura(factura);
                    break;
                case 3:
                    sis.imprimirMonto(factura);
                    break;
                case 4:
                    sis.actualizarFactura(factura);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opc != 5);
    }
}
