package com.bmid.camel.project.dto;

import java.util.List;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
	
	private String nombres;
	private String apellidos;
	private String telefono;
	private String numeroIdentificacion;
	private String direccion;
	//private List<DetalleFactura> detalle;

	
	public Persona(String nombres, String apellidos, String telefono, String numeroIdentificacion, String direccion) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.numeroIdentificacion = numeroIdentificacion;
		this.direccion = direccion;
	}
	public Persona() {
		super();
	}
	/*public Persona(String nombres, String apellidos, String telefono, String numeroIdentificacion, String direccion,
			List<DetalleFactura> detalle) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.numeroIdentificacion = numeroIdentificacion;
		this.direccion = direccion;
		this.detalle = detalle;
	}*/
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/*public List<DetalleFactura> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<DetalleFactura> detalle) {
		this.detalle = detalle;
	}*/
	
}