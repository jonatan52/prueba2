/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuentes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NCACalplenvi
 */
public class ProductoArrayList {

    // ATRIBUTOS
    //public tipoDato nombre;
    private int codigo;
    private String descripcion;
    private float valorUnitario;

    // Constructores Sobrecargados
    public ProductoArrayList(int cod, String descrip, float vUnitario) {
        this.codigo = cod;
        this.descripcion = descrip;
        this.valorUnitario = vUnitario;
    }

    public ProductoArrayList() {
        this.codigo = 0;
        this.descripcion = "";
        this.valorUnitario = 0;
    }

    // castear variables producto3
    public ProductoArrayList(String cod, String descrip, String vUnitario) {
        this.codigo = Integer.parseInt(cod);
        this.descripcion = descrip;
        this.valorUnitario = Float.parseFloat(vUnitario);
    }

    // METODOS GET Y SET
    // Get y set variable codigo
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Get y Set variable descripcion
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Get y Set variable ValorUnitario
    public float getValorUnitario() {
        return this.valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    // METODO PRINCIPAL
    public static void main(String[] args) {
        ArrayList <ProductoArrayList> listadoProductos = new ArrayList<ProductoArrayList>();
        
        ProductoArrayList p1 = new ProductoArrayList(10, "Papa", 1000);
        listadoProductos.add(p1);
        
        //p1.mostrarse();
        Scanner captura = new Scanner(System.in);

        System.out.println("Digite el codigo del producto: ");
        int d1 = captura.nextInt();

        System.out.println("Digite la descripcion del producto: ");
        String d2 = captura.next();

        System.out.println("Digite el precio del producto: ");
        float d3 = captura.nextFloat();

        ProductoArrayList p2 = new ProductoArrayList(d1, d2, d3);
        listadoProductos.add(p2);
        
        //p2.mostrarse();
        
        ProductoArrayList p3 = new ProductoArrayList();
        //p3.mostrarse();
        p3.setCodigo(10);
        p3.setDescripcion("Arroz");
        p3.setValorUnitario(3500);
        //p3.mostrarse();
        listadoProductos.add(p3);

        ProductoArrayList p4 = new ProductoArrayList("2", "Zapato", "30000");
        listadoProductos.add(p4);
        
        //System.out.println(p4.toString());

        //System.out.println("El valor de 2 pares de zapato es $: " + p4.calculaprecio(2));
        System.out.println("Listado Productos: " + listadoProductos);
    }

    public void mostrarse() {
        System.out.println("Codigo: " + this.codigo + " \nDescripcion: " + this.descripcion + " \nValor Unitario: " + this.valorUnitario);
        
    }

    @Override
    public String toString() {
        return "Codigo: " + this.getCodigo() + " \nDescripcion: " + this.getDescripcion() + " \nValor Unitario: " + this.getValorUnitario();
    }
    

    public float calculaprecio(int cantidad) {
        return cantidad * this.valorUnitario;
    }
}
