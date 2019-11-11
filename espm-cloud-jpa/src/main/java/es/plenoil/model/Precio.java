package es.plenoil.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Precio
 *
 */
@Entity
@Table(name = "PRECIOS")
@NamedQueries({ 
	@NamedQuery(name = "Precios.getAllPrecios", query = "SELECT p FROM Precios p"), 
	@NamedQuery(name = "Precios.getPreciosByProveedorId", query = "SELECT p FROM Precios p where p.proveedorId = :proveedorId"),
	@NamedQuery(name = "Precios.getPreciosByProveedorIdAndClhId", query = "SELECT p FROM Precios p where p.proveedorId = :proveedorId AND p.clhId = :clhId"),
	@NamedQuery(name = "Precios.getPreciosByProveedorIdAndClhIdAndFecha", query = "SELECT p FROM Precios p where p.proveedorId = :proveedorId AND p.clhId = :clhId AND p.fecha = :fecha")
})

public class Precio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Precio() {
	}
	
	@Id
	@Column(name = "PREC_ID")
	@GeneratedValue(strategy = TABLE)
	private String precioId;
	@Column(name = "PREC_FECHA")
	private String fecha;
	@Column(name = "PREC_PRECIO")
	private String precio;
	@Column(name = "PREC_DESCUENTO")
	private String descuento;
	@OneToOne
	private Proveedor proveedor;
	@OneToOne
	private Clh clh;
	@OneToOne
	private Material material;
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String param) {
		this.fecha = param;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String param) {
		this.precio = param;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String param) {
		this.descuento = param;
	}

	public String getPrecioId() {
		return precioId;
	}

	public void setPrecioId(String param) {
		this.precioId = param;
	}

	public Proveedor getProveedor() {
	    return proveedor;
	}

	public void setProveedor(Proveedor param) {
	    this.proveedor = param;
	}

	public Clh getClh() {
	    return clh;
	}

	public void setClh(Clh param) {
	    this.clh = param;
	}

	public Material getMaterial() {
	    return material;
	}

	public void setMaterial(Material param) {
	    this.material = param;
	}

}
