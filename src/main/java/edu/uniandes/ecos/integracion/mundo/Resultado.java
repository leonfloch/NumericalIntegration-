package edu.uniandes.ecos.integracion.mundo;

/**
 * Representa la tabla de resultados
 * @author Leonardo Valbuena Calderon
 * @date 25/03/2016
 */
public class Resultado {
    
    /**
     * limite para la integral
     */
    private String x;
    
    /**
     * representa los grados de libertad
     */
    private long dof;
    
    /**
     * valor de la integral esperado
     */
    private long p;
    
    /**
     * valor de la integral actual
     */
    private long pActual;
    
    

    /**
     * Constructor
     */
    //@METODO
    public Resultado() {
        
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public String getX() {
        return x;
    }

    /**
     * 
     * @param x 
     */
    //@METODO
    public void setX(String x) {
        this.x = x;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public long getDof() {
        return dof;
    }

    /**
     * 
     * @param dof 
     */
    //@METODO
    public void setDof(long dof) {
        this.dof = dof;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public long getP() {
        return p;
    }

    /**
     * 
     * @param p 
     */
    //@METODO
    public void setP(long p) {
        this.p = p;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public long getpActual() {
        return pActual;
    }

    /**
     * 
     * @param pActual 
     */
    //@METODO
    public void setpActual(long pActual) {
        this.pActual = pActual;
    }

    
    
    
    
    
    
    
}
