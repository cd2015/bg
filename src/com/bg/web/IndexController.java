package com.bg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bg.repository.CurrencyRepository;

@Controller
public class IndexController {
	@Autowired
	private CurrencyRepository currencyRepository;
	
	@Transactional
	@RequestMapping("/index")
	public String indexPage(Model model) {
		return "index";
	}
}
