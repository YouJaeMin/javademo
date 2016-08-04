package java0804_jdbc;

import java.util.ArrayList;

import java0804_jdbc.dao.JoinDAO;
import java0804_jdbc.dto.DepartmentsDTO;
import java0804_jdbc.dto.EmployeesDTO;
import java0804_jdbc.dto.LocationsDTO;

public class Java200_jdbc {

	public static void main(String[] args) {
		JoinDAO dao = JoinDAO.getInstance();
		ArrayList<EmployeesDTO> aList = dao.listMethod();
		for (EmployeesDTO dto : aList) {
			DepartmentsDTO ddto = dto.getMdto();
			LocationsDTO ldto = dto.getLdto();
			System.out.printf("%-10d %-11s %-10d %-10d %-10s %-10d %-10s\n", dto.getEmployee_id(), dto.getFirst_name(),
					dto.getSalary(), ddto.getDepartment_id(), ddto.getDepartment_name(), ldto.getLocation_id(),
					ldto.getCity());
		}

	}// end main()

}// end class