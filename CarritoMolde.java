package carrito;

/**
 *
 * @author Cristian
 */
public class CarritoMolde {
    public String marca, color, transmision, modelo;
    public int puertas;
    
    //Constructor
    public CarritoMolde(){
        marca = "Unknow";
        color = "Not Available";
        transmision = "Not Available";
        modelo = "Not Available";
        puertas =  0;
    }
    
    public void setColor(String valor){
        color = valor;
    }
    
    public void setMarca(String valor1){
        marca = valor1;
    }
    
    public void setTransmisión(String valor3){
        transmision = valor3;
    }
    
    public void setModelo(String valor4){
        modelo = valor4;
    }
    
    public void setPuertas(int valor5){
        puertas = valor5;
    }
    
}
