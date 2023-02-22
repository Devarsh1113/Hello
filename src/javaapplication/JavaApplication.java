/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;
import java.util.ArrayList;
public class JavaApplication {

	public static void main(String[] args)
	{
	Office SheridanSalesOffice = new Office("Sheridan Sales office" , "213 Mclauglin Rd");
	
	Employees Mandeep = new Employees("Mandeep" , 29);
	Employees McRoe =   new Employees("McRoe" , 26)  ;
	
	Cities Vaughan    = new Cities("Vaughan")   ;
	Cities Burlington = new Cities("Burlington");
	Cities Guelph     = new Cities("Guelph")    ;
	
	Cities Aurora  =  new Cities("Aurora") ;
	Cities Toronto =  new Cities("Toronto");
	
	Mandeep.addCities(Vaughan);
	Mandeep.addCities(Burlington);
	Mandeep.addCities(Guelph);
	
	McRoe.addCities(Aurora);
	McRoe.addCities(Toronto);
	
	SheridanSalesOffice.addEmployeeList(Mandeep);
	SheridanSalesOffice.addEmployeeList(McRoe);
	
	SheridanSalesOffice.About();

	}
}
 class Office
 {
	 String name;
	 String address;
	 ArrayList<Employees> employeeList = new ArrayList<>();
	 
	 public Office(String name, String address)
	 {
		 this.name=name;
		 this.address=address;
	 }
	 
	 public void addEmployeeList(Employees employee )
	 {
		employeeList.add(employee); 
	 }
	 
	 public void About()
	 {
		 System.out.println(name);
		 for (Employees employee : employeeList)
		 {
			employee.about();
		 }
	 }
 }
class Employees
{
	String name;
	int age;
	ArrayList<Cities> cities = new ArrayList<>();
	
	public Employees(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void addCities(Cities city)
	{
		cities.add(city);
	}
	public void about()
	{
		System.out.println("Mayor of City is: " + name + " and age of  Mayor is: " + age);
		for (Cities city : cities)
		{
			city.about();
		}
	}
}
class Cities
{
	String name;
	
	public Cities(String name)
	{
		this.name=name;
	}
	public void about()
	{
		System.out.println("The City is: " + name);
	}
}
    
