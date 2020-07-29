package fr.epita.web;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.epita.datamodel.Reviewer;

@Controller
@RequestMapping("/reviewers")
public class ReviewerController {

	
	@GetMapping(value = "/list")
	public String listReviewers(Model model) {
		Reviewer rv1 = new Reviewer();
		rv1.setName("Quentin");
		rv1.setBirthDate(LocalDate.of(1990, 04, 01));
		model.addAttribute("reviewersList", Arrays.asList(rv1));
		
		return "reviewers";
		
	}
	
	
}
