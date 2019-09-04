package com.example.registro.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name = "contabilidad_cuenta")
public class Registro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private long id_cuenta;
	
	@NotNull
	private long gruopo_empresa_id_empresa;
	
	@NotNull
	private long contabilidad_tipo_id_tipo;
	
	@NotNull
	@Column(nullable = true)
	private long creacion_usuario;
	
	@Column(nullable = true,columnDefinition = "DATETIME")
	private Date creacion_fecha_hora;
	
	@Column(nullable = true,columnDefinition = "TINYINT")
	private int nivel;
	
	@NotNull
	@Size(max = 100)
    @Column(length = 100,nullable = true)
	private String cuenta;
	
	@NotNull
	@Size(max = 200)
    @Column(length = 200,nullable = true)
	private String nombre;
	
	@Column(nullable = true,columnDefinition = "TINYINT")
	private int detalle;
	
	@Column(nullable = true)
	private char naturaleza;
	
	@NotNull
	@Size(max = 3)
    @Column(length = 3,nullable = true)
	private String moneda;
	
	@Column(nullable = true,columnDefinition = "TINYINT")
	private int bloqueado;
	
	@Column(nullable = true,columnDefinition = "TINYINT")
	private int status;
	
	public Registro() {}

	public Registro(@NotNull long id_cuenta, @NotNull long gruopo_empresa_id_empresa,
			@NotNull long contabilidad_tipo_id_tipo, @NotNull long creacion_usuario, Date creacion_fecha_hora,
			int nivel, @NotNull @Size(max = 100) String cuenta, @NotNull @Size(max = 200) String nombre, int detalle,
			char naturaleza, @NotNull @Size(max = 3) String moneda, int bloqueado, int status) {
		super();
		this.id_cuenta = id_cuenta;
		this.gruopo_empresa_id_empresa = gruopo_empresa_id_empresa;
		this.contabilidad_tipo_id_tipo = contabilidad_tipo_id_tipo;
		this.creacion_usuario = creacion_usuario;
		this.creacion_fecha_hora = creacion_fecha_hora;
		this.nivel = nivel;
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.detalle = detalle;
		this.naturaleza = naturaleza;
		this.moneda = moneda;
		this.bloqueado = bloqueado;
		this.status = status;
	}

	public long getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(long id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public long getGruopo_empresa_id_empresa() {
		return gruopo_empresa_id_empresa;
	}

	public void setGruopo_empresa_id_empresa(long gruopo_empresa_id_empresa) {
		this.gruopo_empresa_id_empresa = gruopo_empresa_id_empresa;
	}

	public long getContabilidad_tipo_id_tipo() {
		return contabilidad_tipo_id_tipo;
	}

	public void setContabilidad_tipo_id_tipo(long contabilidad_tipo_id_tipo) {
		this.contabilidad_tipo_id_tipo = contabilidad_tipo_id_tipo;
	}

	public long getCreacion_usuario() {
		return creacion_usuario;
	}

	public void setCreacion_usuario(long creacion_usuario) {
		this.creacion_usuario = creacion_usuario;
	}

	public Date getCreacion_fecha_hora() {
		return creacion_fecha_hora;
	}

	public void setCreacion_fecha_hora(Date creacion_fecha_hora) {
		this.creacion_fecha_hora = creacion_fecha_hora;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDetalle() {
		return detalle;
	}

	public void setDetalle(int detalle) {
		this.detalle = detalle;
	}

	public char getNaturaleza() {
		return naturaleza;
	}

	public void setNaturaleza(char naturaleza) {
		this.naturaleza = naturaleza;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public int getBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(int bloqueado) {
		this.bloqueado = bloqueado;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Registro [id_cuenta=" + id_cuenta + ", gruopo_empresa_id_empresa=" + gruopo_empresa_id_empresa
				+ ", contabilidad_tipo_id_tipo=" + contabilidad_tipo_id_tipo + ", creacion_usuario=" + creacion_usuario
				+ ", creacion_fecha_hora=" + creacion_fecha_hora + ", nivel=" + nivel + ", cuenta=" + cuenta
				+ ", nombre=" + nombre + ", detalle=" + detalle + ", naturaleza=" + naturaleza + ", moneda=" + moneda
				+ ", bloqueado=" + bloqueado + ", status=" + status + "]";
	}
}
