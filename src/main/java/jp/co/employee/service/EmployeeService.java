package jp.co.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.employee.dto.EmployeeDto;
import jp.co.employee.dto.RegusterDto;
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
	    public Employee getEmployee(Integer id, String name) {
	    	Employee entity = employeeMapper.getEmployee(id,name);
	        return entity;
	    }
		/**
		 * @author tono
		 * 全件取得
		 *
		 * */
	    public List<EmployeeDto> getEmployeeAll() {
	        List<EmployeeDto> employeeList = employeeMapper.getEmployeeAll();
	        return employeeList;
	    }

		public int update(EmployeeDto dto) {
			   int count = employeeMapper.update(dto);
			   return count;
		}
		public int register(RegusterDto dto) {
			   int count = employeeMapper.register(dto);
			   return count;
		}
		public int delete(EmployeeDto dto) {
			   int count = employeeMapper.delete(dto);
			   return count;
	}
	}

