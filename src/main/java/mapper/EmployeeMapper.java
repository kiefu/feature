package mapper;
import java.util.List;

import dto.EmployeeDto;
import dto.RegusterDto;
import entity.Employee;

public interface  EmployeeMapper {
     	Employee getEmployee(int id, String name);

		List<EmployeeDto> getEmployeeAll();

		int update(EmployeeDto dto);

		int register(RegusterDto dto);

		int delete(int id);
		}

