package design;

import java.util.Scanner;

public class EmployeeInfo extends EmployeeAbstract {

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */

    /*
     * declare few static and final fields and some non-static fields
     */
    static String companyName;
    static private int employeeId;
    private String employeeName;
    private String departamentName;
    private static double salary;
    private static double performance;
    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */
    public EmployeeInfo(int employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeInfo(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public void assignDepartment(String departamentName) {
        this.departamentName = departamentName;
    }

    public String getDepartamentName() {
        return departamentName;
    }

    public void describeCcompany() {
        companyName = " Google inc";
        System.out.println("the company name is" + companyName);
    }

    public void describeCompany(String objective) {
        System.out.println(objective);
    }

    public void describeCompany(String objective, String target) {
        System.out.println(objective);
        System.out.println(target);
    }

    public double calculateSalary(double salary) {
        double yearlySalary = salary * 12;
        return yearlySalary;
    }

    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */
    public static double calculateEmployeeBonus(double salary, int performance) {
        double yearlyBonus = 0;
        if (performance == 5) {
            yearlyBonus = salary * 0.1 * 12;
        } else if (performance == 4) {
            yearlyBonus = salary * 0.08 * 12;
        } else if (performance == 3) {
            yearlyBonus = salary * 0.06 * 12;
        } else if (performance == 2) {
            yearlyBonus = 0;
            System.out.println(" your performance is not enoght to get a bonus to sad ");
        } else {
            yearlyBonus = 0;
            System.out.println(" is not enought");
        }
        int total = 0;
        System.out.println("total employee bonus =" + total);

        return total;
    }

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     *
     */
    public static double calculateEmployeePension(double salary) {
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
        String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
        String currentYear = startYear.substring(startYear.length() - 4, startYear.length());
        //implement numbers of year from above two dates
        int start = Integer.parseInt(startYear);
        int current = Integer.parseInt(currentYear);
        //Calculate pension
        int numberOfYears = current - start;

        try {
            if (numberOfYears >= 5) {
                total = salary * .25;
            } else if (numberOfYears == 4) {
                total = salary * 0.20;
            } else if (numberOfYears == 3) {
                total = salary * .15;
            } else if (numberOfYears == 2) {
                total = salary * .10;
            } else if (numberOfYears == 1) {
                total = salary * .05;
            } else if (numberOfYears == 0) {
                total = 0;
            }
            System.out.println("total pension =  " + total);
            return total;


        } catch (Exception ex) {
            System.out.println(" error on this method ");
        }
        return numberOfYears;
    }


    public static void setPerformance(double performance) {
        EmployeeInfo.performance = performance;
    }

    public int employeeId() {
        return 0;
    }


    public String employeeName() {
        return null;
    }


    public void assignDepartment() {

    }


    public int calculateSalary() {
        return 0;
    }


    public void benefitLayout() {

    }


    public void vacation() {
        System.out.println("employees have no vacations in my company");
    }

    private static class DateConversion {

		public  DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
