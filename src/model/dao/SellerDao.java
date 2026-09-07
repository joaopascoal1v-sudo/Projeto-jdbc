package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void isert(Seller obj);
	void update(Seller obj);
	void deleteByid(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();

}