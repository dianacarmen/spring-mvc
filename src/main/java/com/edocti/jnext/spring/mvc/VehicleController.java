package com.edocti.jnext.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;

	@RequestMapping(value="/vehicles", method=RequestMethod.GET)
	public ModelAndView getAllVehicles() {
		ModelAndView mav = new ModelAndView("vehicles"); //numele fisierului .jsp
		mav.addObject("allVehicles", vehicleService.getAllVehicles());
		return mav;
	}
	
	@RequestMapping(value="/vehicleForm", method=RequestMethod.GET)
	public ModelAndView setupForm() {
		ModelAndView mav = new ModelAndView("vehicleForm"); 
		mav.addObject("vehicle", new Vehicle());
		return mav;
	}
	
	@RequestMapping(value="/vehicleForm", method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("vehicle") Vehicle vehicle, BindingResult result, SessionStatus status) {
		vehicleService.addVehicle(vehicle);
		return "redirect:vehicles";
	}
}
