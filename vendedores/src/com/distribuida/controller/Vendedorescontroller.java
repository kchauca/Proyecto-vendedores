package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.VendedoresDAO;
import com.distribuida.entities.Vendedores;


	

	@Controller
	@RequestMapping("/Vendedores")          // path principal
	public class Vendedorescontroller {
		
		
		@Autowired
		private VendedoresDAO VendedoresDAO;
		
		
	// JSP .- jAVA SERVER PAGE, SON LAS PAGINAS WEB DE TENCOLOGIA JAVA 
		@GetMapping("/findAll")
		public String findAll(Model model ) {
			
			
			//try {
				
				
			
				List<Vendedores>Vendedores =VendedoresDAO.findALL();
				
				model.addAttribute("Vendedores",Vendedores);
				
				
				return "listar-Vendedores"; 
				
	//		} catch (Exception e) {
	//			// TODO: handle exception
	//			e.printStackTrace();
	//		}
			
		
			
			
			
		}
		
	
		
		@GetMapping ("/findOne")
		public String findOne (@RequestParam("idVendedores") @Nullable Integer idVendedores   
			
			                   ,@RequestParam("opcion") @Nullable Integer opcion
			                   ,Model model
			
				) {
			
			
			//try {
			
			
			if(idVendedores !=null) {
				
				Vendedores Vendedores =VendedoresDAO.findOne(idVendedores);
				model.addAttribute("Vendedores", Vendedores);
			}
				if(opcion==1)return "add-Vendedoreses";
				else return "del-Vendedoreses";
				
		//	} catch (Exception e) {
				// TODO: handle exception
	//		}
			
		

}
	
		
		
		@PostMapping("/add")
		public String add(@RequestParam("idCliente")@Nullable Integer idVendedores
			              ,@RequestParam("nombre")@Nullable String nombre
			              ,@RequestParam("direccion")@Nullable String direccion
		                  ,@RequestParam("telefono")@Nullable String  telefono
			              ,@RequestParam("correo")@Nullable String  correo
			              ,Model model
			
			){
				
				
				
				//try {
				

					if(idVendedores ==null) {
				Vendedores Vendedores =new Vendedores(0,nombre,direccion,telefono,correo);
				VendedoresDAO.add(Vendedores);
				
				}else {
					
					Vendedores Vendedores2 =new Vendedores(idVendedores,nombre,direccion,telefono,correo);
					VendedoresDAO.up(Vendedores2);
				}
					return "redirect:/clintes/findAll"; 
				
			//	} catch (Exception e) {
					// TODO: handle exception
			//	}
			
				
			
		
			
			
		}
		
		@GetMapping("/del")
		public String del(@RequestParam("idVendedores")@Nullable Integer idVendedores) {
			
			
		//	try {
			
				VendedoresDAO.del(idVendedores);
				return"redirect:/Vendedoreses/findAll";
	//		} catch (Exception e) {
				// TODO: handle exception
	//		}
			
		}
		
		}
		
	