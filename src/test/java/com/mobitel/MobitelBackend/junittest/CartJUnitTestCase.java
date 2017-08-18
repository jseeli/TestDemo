package com.mobitel.MobitelBackend.junittest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend.dao.CartDAO;
import com.mobitel.MobitelBackend.model.Cart;

public class CartJUnitTestCase 
{
	
	static CartDAO cartDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.mobitel.MobitelBackend");
		context.refresh();
		
		cartDAO=(CartDAO)context.getBean("cartDAO");
	}
	
	@Test
	public void testForAddingCartItem()
	{
		Cart cart=new Cart();
		cart.setCartid(1002);
		cart.setProdid(4);
		cart.setProdname("Lenovo Vibe P3");
		cart.setPrice(12000);
		cart.setQuantity(2);
		cart.setStatus("N");
		cart.setUsername("Rohan");
		
		assertTrue(cartDAO.addToCart(cart));
	}
	
	@Test
	public void testForgetAllCartItem()
	{
		List<Cart> cartItems=cartDAO.getCartItems("harish");
		assertNotNull("Test Failed",cartItems);
	}
	
}
