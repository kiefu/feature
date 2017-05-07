package mapper;
import java.util.List;

import dto.EmployeeDto;
import entity.Employee;

public interface  EmployeeMapper {
     	Employee getEmployee(int id);

		List<Employee> getEmployeeAll();

		int update(EmployeeDto dto);

		int delete(int id);
		}

