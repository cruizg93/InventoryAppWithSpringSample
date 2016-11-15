package com.blacktierental.springapp.controller;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.blacktierental.springapp.controller.InventoryController;

public class HelloControllerTest {

	@Test
	public void testHandleRequestView() throws Exception{
		InventoryController controller = new InventoryController();
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("hello",modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());
		String nowValue = (String) modelAndView.getModel().get("now");
		assertNotNull(nowValue);
	}

}
