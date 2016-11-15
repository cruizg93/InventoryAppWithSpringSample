package com.blacktierental.springapp.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.blacktierental.springapp.controller.InventoryController;
import com.blacktierental.springapp.domain.Product;
import com.blacktierental.springapp.repository.InMemoryProductDao;
import com.blacktierental.springapp.service.SimpleProductManager;

public class InventoryControllerTest {

	@Test
	public void testHandleRequestView() throws Exception{
		InventoryController controller = new InventoryController();
		
		SimpleProductManager spm = new SimpleProductManager();
		spm.setProductDao(new InMemoryProductDao(new ArrayList<Product>()));
		controller.setProductManager(spm);
		
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("hello",modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());
		
		@SuppressWarnings({ "unchecked" })
		Map<String,Object> modelMap =(Map<String,Object>)modelAndView.getModel().get("model");
		String nowValue = (String) modelMap.get("now");
		assertNotNull(nowValue);
	}

}
