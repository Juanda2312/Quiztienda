# 🛒 Tienda de Productos

Proyecto académico desarrollado en Java para la **Universidad del Quindío** como parte del curso de Programación Orientada a Objetos (POO). Simula la gestión básica de productos en una tienda, incluyendo registro, actualización, eliminación y cálculo automático de precios de venta.

---

## 📁 Estructura del proyecto

```
src/
├── main/java/co/edu/uniquindio/poo/
│   ├── application/
│   │   └── App.java           # Punto de entrada de la aplicación
│   └── model/
│       ├── Producto.java      # Entidad producto con lógica de precios
│       ├── Tienda.java        # Gestión del inventario
│       └── Tipo.java          # Enum con los tipos de producto
└── test/java/co/edu/uniquindio/poo/
    └── AppTest.java           # Pruebas unitarias
```

---

## 🧩 Clases principales

### `Tipo` (enum)
Define los tres tipos de producto disponibles:
| Valor | Descripción |
|---|---|
| `REFRIGERADOS` | Productos que requieren refrigeración |
| `PERECEDEROS` | Productos con fecha de vencimiento corta |
| `NOPERECEDEROS` | Productos de larga duración |

### `Producto`
Representa un producto de la tienda. El precio de venta se calcula automáticamente al crear el producto o al modificar su precio de compra o tipo.

**Atributos:** `nombre`, `preciocompra`, `tipo`, `precioventa`

**Lógica de precio de venta:**
| Tipo | Margen de ganancia |
|---|---|
| `REFRIGERADOS` | 10% sobre el precio de compra |
| `PERECEDEROS` | 15% sobre el precio de compra |
| `NOPERECEDEROS` | 5% sobre el precio de compra |

Dos productos son considerados iguales si tienen el mismo `nombre` y `tipo`.

### `Tienda`
Gestiona la lista de productos usando un `ArrayList`. Garantiza que no existan productos duplicados.

**Métodos principales:**
- `añadirproducto(Producto)` — Agrega un producto si no existe uno igual.
- `eliminarproducto(Producto)` — Elimina un producto registrado.
- `actualizarproducto(Producto, String, double, Tipo)` — Actualiza los datos de un producto existente.
- `buscarproducto(Producto)` — Busca un producto en la lista.

---

## ▶️ Ejemplo de ejecución

La clase `App` demuestra el flujo principal:

1. Se crea la tienda *"Tienda de doña Ines"*.
2. Se registran productos: cebolla (perecedero), pollo (refrigerado) y arroz (no perecedero).
3. Se muestran ventanas emergentes con el estado actual del inventario después de cada operación.
4. Se elimina la cebolla y se actualiza el precio del arroz.
5. Se actualiza el pollo para convertirlo en carne.

La interfaz de usuario utiliza `JOptionPane` para mostrar los resultados en ventanas de diálogo.

---

## 🛠️ Tecnologías

- **Java** (SE 8+)
- **Maven** (gestión del proyecto)
- **JUnit 5** (pruebas unitarias)
- **Swing / JOptionPane** (interfaz de usuario)

---

## 🚀 Cómo ejecutar

```bash
# Clonar el repositorio
git clone <url-del-repositorio>

# Compilar con Maven
mvn compile

# Ejecutar
mvn exec:java -Dexec.mainClass="co.edu.uniquindio.poo.application.App"
```

---

## 📄 Licencia

GNU/GPL V3.0 — [Ver licencia](https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
