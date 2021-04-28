package com.bmid.camel.project.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PreFactura {

	private Long idFactura;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fecha;
	
	public PreFactura() {
		super();
	}
	public PreFactura(Long idFactura, Date fecha) {
		super();
		this.idFactura = idFactura;
		this.fecha = fecha;
	}
	public Long getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
