package com.distribuida.dao;
import java.util.List;

import com.distribuida.entities.Vendedores;

public interface VendedoresDAO {

	
	public List<Vendedores> findAll();
	
	public Vendedores findOne(int id);
	
	public  void  add(Vendedores vendedores);
	
	public  void up (Vendedores vendedores);
	
	public  void del(int id);
}
