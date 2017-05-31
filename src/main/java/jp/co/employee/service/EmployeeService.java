package jp.co.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.employee.dto.DeleteDto;
import jp.co.employee.dto.RegusterDto;
import jp.co.employee.dto.SearchDto;
import jp.co.employee.dto.UpdateDto;
import jp.co.employee.entity.Employee;
import jp.co.employee.mapper.EmployeeMapper;

@Service
public class EmployeeService {
		@Autowired
	    private EmployeeMapper employeeMapper;


		/**
		 * @author tono
		 * @param id
		 * @param name
		 *
		 * */
	    public List<SearchDto> getEmployee(int id, String name) {
	    	List<SearchDto> entity = employeeMapper.getEmployee(id,name);
	        return entity;
	    }
		/**
		 * @author tono
		 * 全件取得
		 *
		 * */
	    public List<SearchDto> getFindAll() {
	        List<SearchDto> employeeList = employeeMapper.getFindAll();
	        return employeeList;
	    }

	    public Employee getEmployee(int id) {
	    	Employee entity = employeeMapper.getEmployee(id);
			return entity;
	    }
		public int update(UpdateDto updatedto) {
			   int count = employeeMapper.update(updatedto);
			   return count;
		}
		public int register(RegusterDto regusterdto) {
			   int count = employeeMapper.register(regusterdto);
			   return count;
		}
		public int delete(DeleteDto deletedto) {
			   int count = employeeMapper.delete(deletedto);
			   return count;
	}
}



