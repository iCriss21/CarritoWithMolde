package carrito;

/**
 *
 * @author Cristian
 */
public class Carrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarritoMolde carrito1 = new CarritoMolde();
        carrito1.setColor("Capi Pistache :v");
        carrito1.setMarca("Lamborghini");
        carrito1.setModelo("2015");
        carrito1.setPuertas(4);
        carrito1.setTransmisión("Manual");
        System.out.println("La Marca es: "+ carrito1.marca);
        System.out.println("El Modelo es: "+ carrito1.modelo);
        System.out.println("La Transmisión es: "+ carrito1.transmision);
        System.out.println("El Color es: "+ carrito1.color);
        System.out.println("Puertas: "+ carrito1.puertas);
    }
    
}

