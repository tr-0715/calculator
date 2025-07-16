package calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController{
	
	@GetMapping("/")
	public String showForm() {
		return "form";
	}
	@PostMapping("/calculate")
	public String calculate(@RequestParam double num1,
			                @RequestParam double num2,
			                @RequestParam String operator,
			                Model model) {
		double result = 0;
		boolean valid =true;
		
	switch (operator) {
	case "+":
		result = num1 + num2;
		break;
	case"-":
		result = num1 - num2;
		break;
	case"*":
		result = num1 * num2;
		break;
	case"/":
		if (num2 == 0) {
			model.addAttribute("error","0で割ることはできません");
			valid = false;
			}else{
				result = num1 / num2;
			}
		    break;
		 default:
			 model.addAttribute("error","演算子が正しくありません");
			 }
	
	    if(valid) {
	    	model.addAttribute("result",result);
	    }
	    return "form";
	}

	}
	
	
