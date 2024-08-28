package co.edu.uniquindio.poo.application;
import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.model.Producto;
import co.edu.uniquindio.poo.model.Tienda;
import co.edu.uniquindio.poo.model.Tipo;

public class App {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Tienda de doña Ines");
        Producto arroz = new Producto("arroz", 1500, Tipo.NOPERECEDEROS);
        Producto pollo = new Producto("pollo", 20000, Tipo.REFRIGERADOS);
        Producto cebolla = new Producto("cebolla", 500, Tipo.PERECEDEROS);
        tienda.añadirproducto(cebolla);
        tienda.añadirproducto(pollo);
        JOptionPane.showMessageDialog(null, tienda.toString(), tienda.getNombre(), 0);
        tienda.añadirproducto(arroz);
        JOptionPane.showMessageDialog(null, tienda.toString(), tienda.getNombre(), 0);
        tienda.eliminarproducto(cebolla);
        arroz.setPreciocompra(2800);
        JOptionPane.showMessageDialog(null, tienda.toString(), tienda.getNombre(), 0);
        tienda.actualizarproducto(pollo, "carne", 15000, Tipo.REFRIGERADOS);
        JOptionPane.showMessageDialog(null, tienda.toString(), tienda.getNombre(), 0);
    }
}
