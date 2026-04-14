import java.util.Scanner;

public class PruebaFactura {

    Scanner sc;

    public PruebaFactura() {
        sc = new Scanner(System.in);
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("\n--- SISTEMA DE FACTURA ---");
        System.out.println("1. Crear factura");
        System.out.println("2. Ver información de la factura");
        System.out.println("3. Ver monto total");
        System.out.println("4. Actualizar factura");
        System.out.println("5. Salir");
        System.out.print(">> ");
        opc = sc.nextInt();
        return opc;
    }

    public Factura crearFactura() {
        System.out.print("Número de pieza: ");
        String numeroPieza = sc.next();
        System.out.print("Descripción: ");
        String descripcion = sc.next();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Precio por artículo: ");
        double precio = sc.nextDouble();
        return new Factura(numeroPieza, descripcion, cantidad, precio);
    }

    public void imprimirFactura(Factura factura) {
        if (factura == null) {
            System.out.println("Primero debe crear una factura.");
            return;
        }
        System.out.println("\n--- Información de la Factura ---");
        System.out.println("Número de pieza: " + factura.getNumeroPieza());
        System.out.println("Descripción:     " + factura.getDescripcionPieza());
        System.out.println("Cantidad:        " + factura.getCantidad());
        System.out.println("Precio unitario: " + factura.getPrecioPorArticulo());
    }

    public void imprimirMonto(Factura factura) {
        if (factura == null) {
            System.out.println("Primero debe crear una factura.");
            return;
        }
        System.out.println("Monto total: " + factura.obtenerMontoFactura());
    }

    public void actualizarFactura(Factura factura) {
        if (factura == null) {
            System.out.println("Primero debe crear una factura.");
            return;
        }
        System.out.print("Número de pieza (" + factura.getNumeroPieza() + "): ");
        factura.setNumeroPieza(sc.next());
        System.out.print("Descripción (" + factura.getDescripcionPieza() + "): ");
        factura.setDescripcionPieza(sc.next());
        System.out.print("Cantidad (" + factura.getCantidad() + "): ");
        factura.setCantidad(sc.nextInt());
        System.out.print("Precio (" + factura.getPrecioPorArticulo() + "): ");
        factura.setPrecioPorArticulo(sc.nextDouble());
        System.out.println("Factura actualizada.");
    }
}
