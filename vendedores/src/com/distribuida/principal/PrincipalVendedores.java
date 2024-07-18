package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.VendedoresDAO;
import com.distribuida.entities.Vendedores;


public class PrincipalVendedores {

	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml"); 		
		
		VendedoresDAO VendedoresDAO = context.getBean("vendedoresDAOImpl", VendedoresDAO.class);

		
		//add
		
		Vendedores vendedores1= new Vendedores (1, "Juan Pérez", "123 Calle eugenio", "123456789", "juan.perez@example.com");
	     VendedoresDAO.add(vendedores1);
		
	     
	     //UP
	    
	     
		Vendedores vendedores2 = new Vendedores (2, "María López", "456 Avenida Siempre Viva", "987654321", "maria.lopez@example.com");
		
		//VendedoresDAO.up(vendedores2);
		
		//DEL
		
		System.out.println("******** DEL *********" + VendedoresDAO.findOne(1));
				
		
			//findAll	
				
		VendedoresDAO.findAll().forEach(item-> {System.out.println(item.toString());});
		

		context.close();
		}

	
	}


