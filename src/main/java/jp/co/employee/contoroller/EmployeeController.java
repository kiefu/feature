package jp.co.employee.contoroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.employee.dto.DeleteDto;
import jp.co.employee.dto.DetailDto;
import jp.co.employee.dto.RegisterDto;
import jp.co.employee.dto.SearchDto;
import jp.co.employee.dto.UpdateDto;
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
	 * @return search
	 *初期画面
	 */
	@RequestMapping(value="/search/",method = RequestMethod.GET)
	public String INIT(Model model) {
	    return "search";
	}

		/**
		 *
		 * @param model
		 * @param id
		 * @param name
		 * @return search
		 *
		 */
	 private List<SearchDto> searchList = new ArrayList<>();
	@RequestMapping(value="/search/",method = RequestMethod.POST)
		public String search(Model model, @PathVariable int id ,String name) {
			List<SearchDto> searchList = (List<SearchDto>) employeeService.getEmployee(id, name);
			 model.addAttribute("searchList", searchList );
		    return "searchList";

		}
		/**
		 *
		 * @param <SearchDto>
		 * @param model
		 * @param id
		 * @param name
		 * @return  全件検索
		 *
		 *POSTにする。searchにする。
		 */
	/*	@RequestMapping(value = "/search/", method = RequestMethod.POST)
		public <SearchDto> String findAll(Model model) {
		    List<jp.co.employee.dto.SearchDto> findall= employeeService.getFindAll();
		    model.addAttribute("searchList", findall);
		    return "searchList";
		}
		/**
		 *
		 * @param model
		 * @param id
		 * @param name
		 * @return 詳細画面
		 *entutyでいけるけど
		 *POSTにする。
		 */
		@RequestMapping(value = "/detail/{id}", method = RequestMethod.POST)
		public String deatail(Model model,@PathVariable int id) {
			Employee employee = employeeService.getEmployee(id);
		    DetailDto Detail = new DetailDto();
		    Detail.setId(employee.getId());
		    Detail.setName(employee.getName());
		    Detail.setDescription(employee.getDescription());
		    Detail.setFile(employee.getFile());

		    model.addAttribute("detail", Detail);
		    return "detail";
		}

		/**
		 *
		 * @param model
		 * @param id
		 * @param name
		 * @return 登録画面
		 *
		 */
		@RequestMapping(value = "/register", method = RequestMethod.GET)
		public String register(Model model) {
			RegisterDto registerDto=new RegisterDto();
		    model.addAttribute("register", registerDto);
		    return "redirect:/reg/";
		}
		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public String register(@ModelAttribute RegisterDto registerDto, Model model) {
		    int count = employeeService.register(registerDto);
		    model.addAttribute("register", registerDto);
		    return "redirect:/search/";
		}
		/**
		 *
		 * @param model
		 * @param id
		 * @param name
		 * @return 更新画面
		 *
		 */
		@RequestMapping(value = "/update", method = RequestMethod.POST)
		public String update(@ModelAttribute UpdateDto updatedto, Model model) {
		    int count = employeeService.update(updatedto);
		    return "redirect:/search/";
		}
		/**
		 *
		 * @param model
		 * @param id
		 * @param name
		 * @return 削除画面
		 *
		 */
		@RequestMapping(value = "/delete/", method = RequestMethod.GET)
		public String testDelete(@ModelAttribute DeleteDto deleteDto, Model model) {
			int count = employeeService.delete(deleteDto);
	    return "search";
		}
		public List<SearchDto> getSearchList() {
			return searchList;
		}
		public void setSearchList(List<SearchDto> searchList) {
			this.searchList = searchList;
		}
}

