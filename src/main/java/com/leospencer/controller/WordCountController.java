package com.leospencer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.leospencer.model.TextModel;
import com.leospencer.services.Transformer;
import com.leospencer.services.TransformerService;

@Controller
public class WordCountController {

	@Autowired
	Transformer transformer;

	@RequestMapping("/wordcount")
	public ModelAndView show() {
		System.out.println("in controller");

		return new ModelAndView("wordcount", "text", new TextModel());

	}

	@RequestMapping(value = "/parse", method = RequestMethod.POST)
	public String parseText(@ModelAttribute("input") TextModel inputTextModel, ModelMap model) {

		model.addAttribute("sortedAlphabetical", transformer.getWordsInSortedOrder(inputTextModel.getText()));
		model.addAttribute("sortedByFrequency", transformer.getWordsInOrderOfFrequency(inputTextModel.getText()));
		model.addAttribute("originalText", inputTextModel.getText());
		
		return "results";

	}
}