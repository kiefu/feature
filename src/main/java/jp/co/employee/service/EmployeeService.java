package jp.co.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.employee.dto.DeleteDto;
import jp.co.employee.dto.RegisterDto;
import jp.co.employee.dto.SearchDto;
import jp.co.employee.dto.UpdateDto;
import jp.co.employee.entity.Employee;
import jp.co.employee.form.SearchForm;
import jp.co.employee.mapper.EmployeeMapper;
/**
 * @author tono
 *従業員データ操作のサービスクラス
 *
 * */
@Service
public class EmployeeService {
	/**
	 *
	 *従業員データ操作用のmapper呼び出し
	 * */
		@Autowired
	    private EmployeeMapper employeeMapper;


		/**
		 * @author tono
		 * @param id
		 * @param name
		 * @return searchlist
		 * 検索処理を行う。
		 * */
		public List<SearchDto> getEmployee(SearchForm searchform) {
	    	List<SearchDto> searchlist = employeeMapper.getEmployee(searchform);
	        return searchlist;
	    }

		 /**
		 * @author tono
		 * @param id
		 *entuty値取得
		 * */
	    public Employee getEmployee(int id) {
	    	Employee entity = employeeMapper.getEmployee(id);
			return entity;
	    }
	    /**
	    /**
		 * @param updatedto
		 * @return count
		 *データの更新を行う。
		 * */
		public int update(UpdateDto updatedto) {
			   int count = employeeMapper.update(updatedto);
			   return count;
		}
		/**
		 * @param RegisterDto
		 * @return count
		 *データの登録を行う。
		 * */
		public int register(RegisterDto registedto) {
			   int count = employeeMapper.register(registedto);
			   return count;
		}
		/**
		 * @param DeleteDto
		 * @return count
		 *データの削除を行う
		 * */
		public int delete(DeleteDto deletedto) {
			   int count = employeeMapper.delete(deletedto);
			   return count;
	}
}



