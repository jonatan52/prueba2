/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuentes;

/**
 *
 * @author NCACalplenvi
 */
public class Factura {
    private int numero;
    private Fecha fecha;
    private Vendedor vendedor;
    private MetodoPago metodopago;
    private DetalleFactura detalleFactura;
    private TotalVentas totalVentas;

    public Factura(int numero, Fecha fecha, Vendedor vendedor, MetodoPago metodopago, DetalleFactura detalleFactura, TotalVentas totalVentas) {
        this.numero = numero;
        this.fecha = fecha;
        this.vendedor = vendedor;
        this.metodopago = metodopago;
        this.detalleFactura = detalleFactura;
        this.totalVentas = totalVentas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public MetodoPago getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(MetodoPago metodopago) {
        this.metodopago = metodopago;
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(DetalleFactura detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public TotalVentas getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(TotalVentas totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + ", fecha=" + fecha + ", vendedor=" + vendedor + ", metodopago=" + metodopago + ", detalleFactura=" + detalleFactura + ", totalVentas=" + totalVentas + '}';
    }
    
    
}
