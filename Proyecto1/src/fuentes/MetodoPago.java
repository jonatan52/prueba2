/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuentes;

/**
 *
 * @author JONATAN T.C
 */
public class MetodoPago {
    // Atributos
    private int codigo;
    private String descripcion;
    
    // Constructor
    public MetodoPago(int codi, String descri){
        this.codigo = codi;
        this.descripcion = descri;
    }
    
    // Get and Set
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // to Sring
    @Override
    public String toString(){
        return "Codigo: " + this.getCodigo() + " \nDescripcion: " + this.getDescripcion(); 
    }
}
