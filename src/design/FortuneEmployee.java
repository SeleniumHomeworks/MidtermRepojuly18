package design;

import databases.ConnectToMongoDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo emp1 = new EmployeeInfo( "MR MAFI",305);
		EmployeeInfo emp2 = new EmployeeInfo("MR SELENIUM", 205);
		EmployeeInfo emp3 = new EmployeeInfo("mohammed", 234);
        String objective = "become a better employee";
        String target = "become number 1 employee of the company";
        emp1.assignDepartment("QA Tester");
		emp2.assignDepartment("Developer");
		emp3.assignDepartment("Bussiness Analyst");

		emp1.vacation();
		//emp2.vacation();
		//emp3.vacation();


		emp1.setSalary(10000);
		emp1.calculateSalary(emp1.getSalary());
		emp2.setSalary(9500);
		emp2.calculateSalary(emp2.getSalary());
		emp3.setSalary(8200);
		emp3.setSalary(emp3.getSalary());
		emp1.describeCcompany();
		emp1.describeCompany(objective, target);

		emp1.setPerformance(3);
		double bonus1 = (emp1.calculateEmployeeBonus(emp1.getSalary(), (int) emp1.getPerformance()));
		emp2.setPerformance(5);
		double bonus2 = (emp2.calculateEmployeeBonus(emp2.getSalary(), (int) emp2.getPerformance()));
		emp3.setPerformance(1);
		double bonus3 =( emp3.calculateEmployeeBonus(emp3.getSalary(), (int) emp3.getPerformance()));

		emp1.calculateEmployeePension(900);

        Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
        List<Object> employeeRecord101 = new ArrayList<Object>();
        employeeRecord101.add(emp1.employeeName());
        employeeRecord101.add(emp1.calculateSalary(emp1.getSalary()));
        employeeRecord101.add(bonus1);

        List<Object> employeeRecord102 = new ArrayList<Object>();
        employeeRecord102.add(emp2.employeeName());
        employeeRecord102.add(emp2.calculateSalary(emp2.getSalary()));
        employeeRecord102.add(bonus2);

        employeeInfo.put(101, employeeRecord101);
        employeeInfo.put(102, employeeRecord102);


}
}
