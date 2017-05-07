package service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.EmployeeDto;
import entity.Employee;
import mapper.EmployeeMapper;

@Service
public class EmployeeService {
		@Autowired
	    private EmployeeMapper employeeMapper;

	    public EmployeeDto getEmployee(Integer id) {
	    	EmployeeDto dto = new EmployeeDto();
	    	Employee entity = employeeMapper.getEmployee(id);
	        return dto;
	    }

	    public List<EmployeeDto> getSearchAll() {
	        List<Employee> employeeList = employeeMapper.getEmployeeAll();
	        List<EmployeeDto> resultList = convertToDto(employeeList);
	        return resultList;
	    }

	    private List<EmployeeDto> convertToDto(List<Employee> employeeList) {
	        List<EmployeeDto> resultList = new LinkedList<>();
	        for (Employee entity : employeeList) {
	        	EmployeeDto dto = new EmployeeDto();
	            BeanUtils.copyProperties(entity, dto);
	            resultList.add(dto);
	        }
	        return resultList;
	    }
		public int update(EmployeeDto dto) {
			   int count = employeeMapper.update(dto);
			   return count;
		}
		public int delete(int id) {
			   int count = employeeMapper.delete(id);
			   return count;
	}
	}

