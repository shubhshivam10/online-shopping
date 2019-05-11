package net.shivam.shoppingbackend.dao;

import java.util.List;

import net.shivam.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
