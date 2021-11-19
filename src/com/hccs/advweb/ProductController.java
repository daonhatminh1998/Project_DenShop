package com.hccs.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class ProductController {

	@Autowired
	private ProductService productService;

	public ProductController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getProductsList(Model model) {
		ArrayList<Product> productsList = productService.getProductsList();
		model.addAttribute("productsList", productsList);
		return "index";
	}

}
