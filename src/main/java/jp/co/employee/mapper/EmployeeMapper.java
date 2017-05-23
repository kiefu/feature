package jp.co.employee.mapper;
import java.util.List;

import jp.co.employee.dto.EmployeeDto;
import jp.co.employee.dto.RegusterDto;
import jp.co.employee.entity.Employee;

public interface  EmployeeMapper {
     	Employee getEmployee(int id, String name);

		List<EmployeeDto> getEmployeeAll();

		int update(EmployeeDto dto);

		int register(RegusterDto dto);

		int delete(EmployeeDto dto);
		}

