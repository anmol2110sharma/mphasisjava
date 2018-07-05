package day5;
import java.util.*;
public class Employee
{
private int empId;
private String empName;
private double empSalary;
Employee(int empId,String empName,double empSalary)
{
	this.empId=empId;
	this.empName=empName;
	this.empSalary=empSalary;
}
public String toString()
{
	return empId+"\t"+empName+"\t"+empSalary;
}
}
