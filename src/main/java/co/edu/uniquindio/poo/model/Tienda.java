package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Producto> listaproductos = new ArrayList<Producto>();
    
    public Tienda(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto> getListaproductos() {
        return listaproductos;
    }

    @Override
    public String toString() {
        return "Tienda [nombre=" + nombre + ", listaproductos=" + listaproductos + "]";
    }
    /**
     * Crea un producto siempre y cuando no exista un producto con el mismo nombre y tipo
     * @param producto
     * @return
     */
    public String añadirproducto(Producto producto){
        String mensaje = "Ya existe este producto";
        if (listaproductos.size() == 0){
            listaproductos.add(producto);
            mensaje = "El producto a sido añadido correctamente";

        }else{
            Producto productoencontrado = buscarproducto(producto);
            if (productoencontrado == null){
                listaproductos.add(producto);
                mensaje = "El producto a sido añadido correctamente";
            }                          
        }  
        return mensaje;
    }   
    /**
     * Busca en la lista de productos para verificar si ya existe un producto igual
     * @param productonuevo
     * @return
     */
    public Producto buscarproducto(Producto productonuevo){
        Producto productoencontrado = null;
        for (Producto productoactual : listaproductos) {
            if (productoactual.equals(productonuevo)){
                productoencontrado = productoactual;
                return productoencontrado;
            }
        }
        return productoencontrado;
    }
    /**
     * Elimina un producto de la lista siempre y cuando este haya sido registrado
     * @param producto
     * @return
     */
    public String eliminarproducto(Producto producto){
        String mensaje = "Este producto no esta registrado";
        for (int i = 0; i < listaproductos.size(); i++) {
            Producto productoactual = listaproductos.get(i);
            if (productoactual.equals(producto)) {
                listaproductos.remove(i);
                mensaje = "El producto a sido borrado correctamente";
                return mensaje;
            }
        }
        return mensaje;
    }

    /**
     * Actualiza la información de un producto siempre y cuando este este registrado
     * @param producto
     * @param nombre
     * @param preciocompra
     * @param tipo
     * @return
     */
    public String actualizarproducto(Producto producto, String nombre, double preciocompra, Tipo tipo){
        String mensaje = "No se a encontrado este producto";
        for (Producto productoactual : listaproductos) {
            if (productoactual.equals(producto)) {
                productoactual.setNombre(nombre);
                productoactual.setPreciocompra(preciocompra);
                productoactual.setTipo(tipo);
                mensaje = "El producto a sido actualizado";
                return mensaje;
            }
        }

        return mensaje;
    }
}

