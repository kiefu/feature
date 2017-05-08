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
import dto.RegusterDto;
import service.EmployeeService;



@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
//メイン画面
		@RequestMapping(value="/employee/{id}",method = RequestMethod.GET)
		public String Employee(Model model, @PathVariable int id ,String name) {
		    EmployeeDto Employee = employeeService.getEmployee(id, name);
		    model.addAttribute("employee", Employee );
		    return "employee";
		}
//詳細画面に接続
		@RequestMapping(value = "/detail/", method = RequestMethod.GET)
		public String update(Model model,@PathVariable int id,String name) {
			EmployeeDto employee =employeeService.getEmployee(id, name);
		    DetailDto Detail = new DetailDto();
		    Detail.setId(employee.getId());
		    Detail.setName(employee.getName());
		    Detail.setDescription(employee.getDescription());
		    Detail.setFile(employee.getFile());

		    model.addAttribute("Dto", Detail);
		    return "detail";
		}
//登録画面
		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public String register(@ModelAttribute RegusterDto RegusterDto, Model model) {
			RegusterDto dto = new RegusterDto();
		    int count = employeeService.register(dto);
		    return "redirect:/register/";
		}
//データの更新
		@RequestMapping(value = "/update", method = RequestMethod.POST)
		public String update(@ModelAttribute EmployeeDto Dto, Model model) {
			EmployeeDto dto = new EmployeeDto();
		    int count = employeeService.update(dto);
		    return "redirect:/detail/";
		}
//データの削除
		@RequestMapping(value = "/delete/input/", method = RequestMethod.GET)
		public String testDelete(Model model) {
			DetailDto Detail = new DetailDto();
		    model.addAttribute("DetailDto", Detail);
		    return "Detail";
		}

		@RequestMapping(value = "/delete/input/", method = RequestMethod.POST)
		public String Delete(@ModelAttribute DetailDto form, Model model) {
		    int count = employeeService.delete(form.getId());
		    return "redirect:/Detail/";
		}
}

