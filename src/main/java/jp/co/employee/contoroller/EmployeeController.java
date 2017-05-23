package jp.co.employee.contoroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.employee.dto.DetailDto;
import jp.co.employee.dto.EmployeeDto;
import jp.co.employee.dto.RegusterDto;
import jp.co.employee.entity.Employee;
import jp.co.employee.service.EmployeeService;


/**
 *
 * @author tono
 *
 */
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
//メイン画面
		/**
		 *
		 * @param model
		 * @param id
		 * @param name
		 * @return  INIT とかの方がいい
		 *
		 *
		 */
		@RequestMapping(value="/employee/",method = RequestMethod.GET)
		public String search(Model model, @PathVariable int id ,String name) {
		    Employee Employee = employeeService.getEmployee(id, name);
		    model.addAttribute("employee", Employee );
		    return "employee";
		}
		/**
		 *
		 * @param model
		 * @param id
		 * @param name
		 * @return  INIT とかの方がいい
		 *
		 *POSTにする。searchにする。
		 */
		@RequestMapping(value = "/detail/", method = RequestMethod.POST)
		public String deatail(Model model,@PathVariable int id,String name) {
			Employee employee =employeeService.getEmployee(id, name);
		    DetailDto Detail = new DetailDto();
		    Detail.setId(employee.getId());
		    Detail.setName(employee.getName());
		    Detail.setDescription(employee.getDescription());
		    Detail.setFile(employee.getFile());

		    model.addAttribute("detail", Detail);
		    return "detail";
		}
//登録画面
		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public String register(@ModelAttribute RegusterDto regusterDto, Model model) {
		    int count = employeeService.register(regusterDto);
		    return "redirect:/search/";
		}
//データの更新
		@RequestMapping(value = "/update", method = RequestMethod.POST)
		public String update(@ModelAttribute EmployeeDto updatedto, Model model) {
		    int count = employeeService.update(updatedto);
		    return "redirect:/search/";
		}
//データの削除
		@RequestMapping(value = "/delete/", method = RequestMethod.GET)
		public String testDelete(@ModelAttribute EmployeeDto deleteDto, Model model) {
			int count = employeeService.delete(deleteDto);
		    return "search";
		}
}

