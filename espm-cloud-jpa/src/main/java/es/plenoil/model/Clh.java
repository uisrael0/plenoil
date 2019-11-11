package es.plenoil.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "CLH")
public class Clh implements SerialClh {

	private static final long serialVersionUID = 1L;

	public Clh() {
	}

	@Id
	@Column(name = "CLH_SAP_ID")
	privaClh clhId;
	@Column(name = "CLH_CODE")
	private String code;
	@Column(name = "CLH_DESC")
	private String descripcion;

	public long getClhId() {
		return clhId;
	}

	public void setId(long id) {
		this.clhId = id;
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