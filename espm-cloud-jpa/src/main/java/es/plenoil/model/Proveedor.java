package es.plenoil.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PROVEEDOR")
@NamedQueries({ 
	@NamedQuery(name = "Proveedor.getAllProveedores", query = "SELECT p FROM Proveedor p"), 
	@NamedQuery(name = "Proveedor.getProveedorByProveedorId", query = "SELECT p FROM Proveedor p where p.proveedorId = :proveedorId") 
})
public class Proveedor implements Serializable {

	private static final long serialVersionUID = 1L;

	public Proveedor() {
	}

	@Id
	@Column(name = "PROV_SAP_ID")
	private long proveedorId;
	@Column(name = "PROV_CODE")
	private String code;
	@Column(name = "PROV_DESC")
	private String description;
	private String image;
	public long getProveedorId() {
		return proveedorId;
	}

	public void setProveedorId(long id) {
		this.proveedorId = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String param) {
		this.code = param;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String param) {
		this.description = param;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String param) {
		this.image = param;
	}

}