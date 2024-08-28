package co.edu.uniquindio.poo.model;

public class Producto {
    private String nombre;
    private double preciocompra;
    private Tipo tipo;
    private double precioventa;
    
    public Producto(String nombre, double preciocompra, Tipo tipo) {
        this.nombre = nombre;
        this.preciocompra = preciocompra;
        this.tipo = tipo;
        precioventa = calcularpreciodeventa();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
        precioventa = calcularpreciodeventa();
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
        precioventa = calcularpreciodeventa();
    }
    
    public double getPrecioventa() {
        return precioventa;
    }
    
    
    /**
     * Primero calcula el precio de venta para poder entregar la información completa y actualizada a la tienda
     */
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", preciocompra=" + preciocompra + ", tipo=" + tipo + ", precioventa="
                + precioventa + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        return result;
    }
    
    /**
     * Compara el nombre y tipo de 2 productos para saber si son el mismo producto
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (tipo != other.tipo)
            return false;
        return true;
    }
    
    /**
     * calcula el precio de venta a partir de su tipo y precio de compra 
     * @return
     */
    public double calcularpreciodeventa(){
        if (tipo == tipo.REFRIGERADOS){
            precioventa = preciocompra + (preciocompra*0.1);
            return precioventa;
        }else if(tipo == tipo.PERECEDEROS){
            precioventa = preciocompra + (preciocompra*0.15);
            return precioventa;
        }else{
            precioventa = preciocompra + (preciocompra*0.05);
            return precioventa;
        }
    }
    
}
