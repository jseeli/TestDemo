package com.mobitel.MobitelBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend.dao.ProductDAO;
import com.mobitel.MobitelBackend.model.Product;

public class ProductDAOTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend");
		
		context.refresh();
		
		// Inserting a Category Object.
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		/*Product product=new Product();
		
		product.setProdname("Samsung Galaxy 7");
		product.setProddesc("It is a 4G Mobile");
		product.setPrice(19000);
		product.setCatid(3);
		product.setSuppid(2);
		product.setQuantity(10);
		
		productDAO.insertUpdateProduct(product);*/
		
		List<Product> list=productDAO.getProductDetails();
		
		for(Product product:list)
		{
			System.out.print(product.getProdid()+":::");
			System.out.print(product.getProdname());
		}
		
		
		System.out.println("Product Displayed");
	}
}
