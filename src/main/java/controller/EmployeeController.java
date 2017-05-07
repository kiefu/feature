package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.DetailDto;
import dto.EmployeeDto;
import service.EmployeeService;



@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

		@RequestMapping(value="/serach/{id}",method = RequestMethod.GET)
		public String Employee(Model model, @PathVariable int id) {
		    EmployeeDto Employee = employeeService.getEmployee(id);
		    model.addAttribute("search", Employee );
		    return "search";
		}
		@RequestMapping(value = "/update/input/", method = RequestMethod.GET)
		public String update(Model model,@PathVariable int id) {
			EmployeeDto employee =employeeService.getEmployee(id);
		    DetailDto Detail = new DetailDto();
		    Detail.setId(employee.getId());
		    Detail.setName(employee.getName());
		    Detail.setDescription(employee.getDescription());
		    Detail.setFile(employee.getFile());

		    model.addAttribute("Dto", Detail);
		    return "update";
		}
		@RequestMapping(value = "/update/input/", method = RequestMethod.POST)
		public String update(@ModelAttribute EmployeeDto Dto, Model model) {
			EmployeeDto dto = new EmployeeDto();
		    int count = employeeService.update(dto);
		    return "redirect:/search/";
		}
		@RequestMapping(value = "/delete/input/", method = RequestMethod.GET)
		public String testDelete(Model model) {
			DetailDto form = new DetailDto();
		    model.addAttribute("DetailDto", form);
		    return "search";
		}

		@RequestMapping(value = "/delete/input/", method = RequestMethod.POST)
		public String Delete(@ModelAttribute DetailDto form, Model model) {
		    int count = employeeService.delete(form.getId());
		    return "redirect:/search/";
		}
}

