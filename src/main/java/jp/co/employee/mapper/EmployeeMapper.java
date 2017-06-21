package jp.co.employee.mapper;
import java.util.List;

import jp.co.employee.dto.DeleteDto;
import jp.co.employee.dto.RegisterDto;
import jp.co.employee.dto.SearchDto;
import jp.co.employee.dto.UpdateDto;
import jp.co.employee.entity.Employee;
import jp.co.employee.form.SearchForm;

public interface  EmployeeMapper {

		List<SearchDto> getEmployee(SearchForm searchform);

		int update(UpdateDto updatedto);

		int register(RegisterDto regusterdto);

		int delete(DeleteDto deletedto);

		Employee getEmployee(int id);

		}

