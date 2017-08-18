package com.mobitel.MobitelBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend.dao.CartDAO;
import com.mobitel.MobitelBackend.model.Cart;

public class CartTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.mobitel.MobitelBackend");
		context.refresh();
		
		CartDAO cartDAO=(CartDAO)context.getBean("cartDAO");
		
		/*Cart cart=new Cart();
		cart.setCartid(1002);
		cart.setProdid(4);
		cart.setProdname("Lenovo Vibe P1");
		cart.setPrice(12000);
		cart.setQuantity(2);
		cart.setStatus("N");
		cart.setUsername("Rohan");
		cartDAO.addToCart(cart);
		System.out.println("Added to Cart");*/
		
		/*List<Cart> list=cartDAO.getCartItems("harish");
		for(Cart cart:list)
		{
			System.out.print(cart.getCartid()+":::");
			System.out.print(cart.getProdid()+":::");
			System.out.print(cart.getProdname()+":::");
			System.out.print(cart.getPrice()+":::");
			System.out.println(cart.getQuantity()+":::");
		}
		System.out.println("Cart Item Displayed:");*/
		
		/*Cart cart=cartDAO.getCartItem(12);
		cart.setQuantity(6);
		cartDAO.updateCartItem(cart);
		System.out.println("The CartItem Updated");*/
		
		Cart cart=cartDAO.getCartItem(9);
		cartDAO.deleteCartItem(cart);
		System.out.println("Cart Item Deleted");
		
	}
}
