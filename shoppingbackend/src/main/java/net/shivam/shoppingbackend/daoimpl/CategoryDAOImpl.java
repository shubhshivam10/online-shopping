package net.shivam.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.shivam.shoppingbackend.dao.CategoryDAO;
import net.shivam.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		// adding first category
		Category category = new Category();
		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This Is Television Of Brand ONIDA");
		category.setImageURL("CAT1_PNG");
		category.setActive(true);
		categories.add(category);
		// adding second category
		category = new Category();

		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This Is Mobile Of Brand APPLE");
		category.setImageURL("CAT2_PNG");
		category.setActive(true);
		categories.add(category);
		//adding the third category
		category = new Category();

		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This Is Laptop Of Brand DELL");
		category.setImageURL("CAT3_PNG");
		category.setActive(true);
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		//for  each or enhanced 
		for(Category category :categories) {
			if (category.getId()==id)
				return category;
		}
		return null;
	}

}
