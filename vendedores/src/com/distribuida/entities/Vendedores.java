package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="vendedores")
public class Vendedores {


	
	// Atributos 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_vendedores")
		private int idVendedores;
		
		@Column(name = "nombre")
		private String nombre;
		@Column(name = "direccion")
		private String direccion;
		@Column(name = "telefono")
		private String telefono;
		@Column(name = "correo")
		private String correo;
		
		
		public Vendedores(int idVendedores, String nombre, String direccion, String telefono, String correo) {
			super();
			this.idVendedores = idVendedores;
			this.nombre = nombre;
			this.direccion = direccion;
			this.telefono = telefono;
			this.correo = correo;
		}
		public int getIdVendedores() {
			return idVendedores;
		}
		public void setIdVendedores(int idVendedores) {
			this.idVendedores = idVendedores;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		@Override
		public String toString() {
			return "Vendedores [idVendedores=" + idVendedores + ", nombre=" + nombre + ", direccion=" + direccion
					+ ", telefono=" + telefono + ", correo=" + correo + "]";
		}
		
	
		
}
		
	