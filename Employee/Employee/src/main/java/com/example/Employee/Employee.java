package com.example.Employee;

public class Employee {
private String employeeName;
private int employeeId;
public void SetData(String name,int id)
{
this.employeeName=name;
this.employeeId=id;

}

public void show()
{
System.out.println("EmployeeName :"+employeeName+ "\nEmployeeID :"+employeeId);
}
}