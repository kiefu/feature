package jp.co.employee.mapper;
import java.util.List;

import jp.co.employee.dto.DeleteDto;
import jp.co.employee.dto.RegisterDto;
import jp.co.employee.dto.SearchDto;
import jp.co.employee.dto.UpdateDto;
import jp.co.employee.entity.Employee;

public interface  EmployeeMapper {
		List<SearchDto> getEmployee(int id, String name);


		int update(UpdateDto updatedto);

		int register(RegisterDto regusterdto);

		int delete(DeleteDto deletedto);

		Employee getEmployee(int id);



		}

