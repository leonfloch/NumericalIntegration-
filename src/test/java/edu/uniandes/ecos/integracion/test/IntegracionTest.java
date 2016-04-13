package edu.uniandes.ecos.integracion.test;

import edu.uniandes.ecos.integracion.mundo.Archivo;
import edu.uniandes.ecos.integracion.mundo.Resultado;
import edu.uniandes.ecos.integracion.mundo.Integracion;
import java.util.LinkedList;
import junit.framework.TestCase;
import org.junit.*;



/**
 * Se definen los casos de prueba
 * @author Leonardo Valbuena Calderon
 * @date 25/03/2016
 */
public class IntegracionTest extends TestCase {
    
    /**
     * datos donde se encuentran los valores de x
     */
    private static final String TABLA_X = "data/tableX.txt";
    
    /**
     * datos donde se encuentran los valores de dof
     */
    private static final String TABLA_DOF = "data/tableDof.txt";
    
    /**
     * Clase donde se gestionan los calculos
     */
    Integracion integracion = new Integracion();
    
    
    /**
     * test para x=1.1 dof=9
     */
    @Test
    //@METODO
    public void test1() {
        double result = integracion.calcularIntegral(1.1, 9);
        assertEquals(0.35006, result);
    }
    
    /**
     * test para x=1.1812 dof=10
     */
    @Test
    //@METODO
    public void test2() {                        
        double result = integracion.calcularIntegral(1.1812, 10);
        assertEquals(0.36757, result);
    }
    
    /**
     * test para x=2.750 dof=30
     */
    @Test
    //@METODO
    public void test3() {
        double result = integracion.calcularIntegral(2.750, 30);
        assertEquals(0.49500, result);
    }
    
    
    
    
}
