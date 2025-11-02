import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import sebas.lab.testing.GestionBiblioteca;

/**
 * Suite de Pruebas Unitarias para GestionBiblioteca
 * 
 * @author jacks
 */
public class TestGestionBiblioteca {
    
    private GestionBiblioteca biblioteca;
    
    @Before
    public void setUp() {
        biblioteca = new GestionBiblioteca();
    }
    
    // ========== Tests para calcularPrecioConDescuento() ==========
    
    /**
     * Test 1: Precio sin descuento (0%)
     * Verifica que con 0% de descuento el precio se mantiene igual
     */
    @Test
    public void testCalcularPrecioSinDescuento() {
        double precio = 100.0;
        double descuento = 0.0;
        double resultado = biblioteca.calcularPrecioConDescuento(precio, descuento);
        assertEquals(100.0, resultado, 0.01);
    }
    
    /**
     * Test 2: Precio con 50% de descuento
     * Verifica que con 50% de descuento el precio se reduce a la mitad
     */
    @Test
    public void testCalcularPrecioCon50PorCientoDescuento() {
        double precio = 100.0;
        double descuento = 50.0;
        double resultado = biblioteca.calcularPrecioConDescuento(precio, descuento);
        assertEquals(50.0, resultado, 0.01);
    }
    
    /**
     * Test 3: Excepción con precio negativo
     * Verifica que lanza IllegalArgumentException cuando el precio es negativo
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalcularPrecioConPrecioNegativo() {
        biblioteca.calcularPrecioConDescuento(-10.0, 20.0);
    }
    
    // ========== Tests para estaDisponible() ==========
    
    /**
     * Test 1: Libro no disponible (no agregado)
     * Verifica que un libro no agregado no está disponible
     */
    @Test
    public void testLibroNoDisponible() {
        boolean resultado = biblioteca.estaDisponible("El Quijote");
        assertFalse(resultado);
    }
    
    /**
     * Test 2: Libro disponible después de agregarlo
     * Verifica que un libro está disponible después de agregarlo
     */
    @Test
    public void testLibroDisponibleDespuesDeAgregar() {
        biblioteca.agregarLibro("Cien años de soledad");
        boolean resultado = biblioteca.estaDisponible("Cien años de soledad");
        assertTrue(resultado);
    }
    
    // ========== Tests para agregarLibro() ==========
    
    /**
     * Test 1: Agregar libro exitosamente
     * Verifica que se puede agregar un libro correctamente
     */
    @Test
    public void testAgregarLibroExitosamente() {
        boolean resultado = biblioteca.agregarLibro("1984");
        assertTrue(resultado);
        assertTrue(biblioteca.estaDisponible("1984"));
    }
    
    /**
     * Test 2: Agregar libro duplicado retorna false
     * Verifica que no se puede agregar un libro que ya existe
     */
    @Test
    public void testAgregarLibroDuplicado() {
        biblioteca.agregarLibro("El Principito");
        boolean resultado = biblioteca.agregarLibro("El Principito");
        assertFalse(resultado);
    }
    
    // ========== Tests para obtenerCategoriaLector() ==========
    
    /**
     * Test 1: 0 libros → "Principiante"
     * Verifica que con 0 libros leídos la categoría es Principiante
     */
    @Test
    public void testCategoriaLectorPrincipiante() {
        String categoria = biblioteca.obtenerCategoriaLector(0);
        assertEquals("Principiante", categoria);
    }
    
    /**
     * Test 2: 5 libros → "Intermedio"
     * Verifica que con 5 libros leídos la categoría es Intermedio
     */
    @Test
    public void testCategoriaLectorIntermedio() {
        String categoria = biblioteca.obtenerCategoriaLector(5);
        assertEquals("Intermedio", categoria);
    }
    
    /**
     * Test 3: 25 libros → "Avanzado"
     * Verifica que con 25 libros leídos la categoría es Avanzado
     */
    @Test
    public void testCategoriaLectorAvanzado() {
        String categoria = biblioteca.obtenerCategoriaLector(25);
        assertEquals("Avanzado", categoria);
    }
    
    // ========== Tests para obtenerLibrosDisponibles() ==========
    
    /**
     * Test 1: Nunca retorna null
     * Verifica que el método siempre retorna una lista, nunca null
     */
    @Test
    public void testObtenerLibrosDisponiblesNuncaRetornaNull() {
        List<String> libros = biblioteca.obtenerLibrosDisponibles();
        assertNotNull(libros);
    }
    
    /**
     * Test 2: Contiene libros después de agregarlos
     * Verifica que la lista contiene los libros después de agregarlos
     */
    @Test
    public void testObtenerLibrosDisponiblesContieneLibrosAgregados() {
        biblioteca.agregarLibro("Don Quijote");
        biblioteca.agregarLibro("La Odisea");
        
        List<String> libros = biblioteca.obtenerLibrosDisponibles();
        assertEquals(2, libros.size());
        assertTrue(libros.contains("Don Quijote"));
        assertTrue(libros.contains("La Odisea"));
    }
}
