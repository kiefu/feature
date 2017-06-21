package jp.co.employee.contoroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.employee.dto.DeleteDto;
import jp.co.employee.dto.RegisterDto;
import jp.co.employee.dto.SearchDto;
import jp.co.employee.dto.UpdateDto;
import jp.co.employee.form.SearchForm;
import jp.co.employee.service.EmployeeService;

/**
 *@contollor　EmployeeController
 *@author tono
 *従業員管理を行うコントローラクラス
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
	 *初期画面表示
	 */
	@RequestMapping(value="/search/",method = RequestMethod.GET)
	public String init(Model model) {
	    return "search";
	}

		/**
		 * @param model
		 * @param searchform
		 * @return search
		 *検索処理
		 */
	@RequestMapping(value="/search/",method = RequestMethod.POST)
		public String search(@ModelAttribute SearchForm searchform,Model model){
			List<SearchDto> searchList = (List<SearchDto>) employeeService.getEmployee(searchform);
			model.addAttribute("searchForm", searchform);
			 model.addAttribute("searchList", searchList );
		    return "searchList";

		}
		/**
		 * @param model
		 * @param id
		 * @return detail
		 * IDを引数に詳細画面に遷移する
		 */
		@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
		public String detail(Model model,@PathVariable int id) {
		    model.addAttribute("detail", employeeService.getEmployee(id));
		    return "detail/";
		}

		/**
		 *
		 * @param model
		 * 登録画面を呼び出す
		 *
		 */
		@RequestMapping(value = "/register", method = RequestMethod.GET)
		public String registerinit(Model model) {;
		    return "/register";
		}
		/**
		 *
		 * @param model
		 * @paramregisterDto
		 * 新規従業員データの登録処理
		 *
		 */
		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public String register(@ModelAttribute RegisterDto registerDto, Model model) {
		    employeeService.register(registerDto);
		    model.addAttribute("register", registerDto);
		    return "/search";
		}
		/**
		 *
		 * @param model
		 * @param updatedto
		 * @return 検索画面
		 *データを更新画面に遷移
		 *	 *
		 */
		@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
		public String update(Model model, @PathVariable int id) {
		    model.addAttribute("update", employeeService.getEmployee(id));
		    return "/update/";
		}
		/**
		 *
		 * @param model
		 * @param updatedto
		 * @return 検索画面
		 *データを更新する処理
		 */
		@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
		public String update(@ModelAttribute UpdateDto updatedto, Model model) {
		    employeeService.update(updatedto);
		    return "/search/";
		}
		/**
		 *
		 * @param model
		 * @param DeleteDto
		 * @return 検索画面
		 *データを削除する処理
		 */
		@RequestMapping(value = "/detail", method = RequestMethod.POST)
		public String delete(@ModelAttribute DeleteDto deleteDto, Model model) {
			 employeeService.delete(deleteDto);
	    return "search";
		}

}

