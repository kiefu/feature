package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.EmployeeDto;
import dto.RegusterDto;
import entity.Employee;
import mapper.EmployeeMapper;

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
	    public EmployeeDto getEmployee(Integer id, String name) {
	    	EmployeeDto dto = new EmployeeDto();
	    	Employee entity = employeeMapper.getEmployee(id,name);
	        return dto;
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
		public int delete(int id) {
			   int count = employeeMapper.delete(id);
			   return count;
	}
	}

