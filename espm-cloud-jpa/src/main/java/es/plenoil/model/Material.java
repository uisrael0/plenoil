package es.plenoil.model;

import static javax.persistence.GenerationType.TABLE;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "MATERIAL")
@NamedQueries({ 
	@NamedQuery(name = "Material.getAllMateriales", query = "SELECT m FROM Materiales m"), 
	@NamedQuery(name = "Material.getMaterialesByMaterialId", query = "SELECT m FROM Material m where m.materialId = :materialId"),
})

public class Material implements Serializable {

	private static final long serialVersionUID = 1L;

	public Material() {
	}

	@Id
	@Column(name = "MATE_SAP_ID")
	@GeneratedValue(strategy = TABLE)
	private long materialId;
	@Column(name = "MATE_CODE")
	private String code;
	@Column(name = "MATE_DESC")
	private String descripcion;

	public long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(long id) {
		this.materialId = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String param) {
		this.code = param;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String param) {
		this.descripcion = param;
	}

}