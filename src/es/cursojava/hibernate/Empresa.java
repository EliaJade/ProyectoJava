package es.cursojava.hibernate;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="TB_EMPRESA")
public class Empresa {
	
	//definir atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; //se usa long en vez de int, bbdd no sabe cuantos registros van a tener y cuanto va durar y pues el long tiene menos limite
	@Column(length = 30)
	
	private String name;
	private String tipoSociedad;
	@Column(nullable = false)
	private String cif;
	@Column(name= "ACTIVIDAD")
	private String tipoActividad;
	private Date fechaConsitucion; //java.util
	
	//siempre un constr vacio:
	public Empresa() {
		
	}

	public Empresa(long id, String name, String tipoSociedad, String cif, String tipoActividad, Date fechaConsitucion) {
		super();
		this.id = id;
		this.name = name;
		this.tipoSociedad = tipoSociedad;
		this.cif = cif;
		
		this.tipoActividad = tipoActividad;
		this.fechaConsitucion = fechaConsitucion;
	}
	
	public Empresa( String name, String tipoSociedad, String cif, String tipoActividad, Date fechaConsitucion) {
		super();
		this.name = name;
		this.tipoSociedad = tipoSociedad;
		this.cif = cif;
		
		this.tipoActividad = tipoActividad;
		this.fechaConsitucion = fechaConsitucion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTipoSociedad() {
		return tipoSociedad;
	}

	public void setTipoSociedad(String tipoSociedad) {
		this.tipoSociedad = tipoSociedad;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getTipoActividad() {
		return tipoActividad;
	}

	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad = tipoActividad;
	}

	public Date getFechaConsitucion() {
		return fechaConsitucion;
	}

	public void setFechaConsitucion(Date fechaConsitucion) {
		this.fechaConsitucion = fechaConsitucion;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", name=" + name + ", tipoSociedad=" + tipoSociedad + ", cif=" + cif
				+ ", tipoActividad=" + tipoActividad + ", fechaConsitucion=" + fechaConsitucion + "]";
	}
	
}
