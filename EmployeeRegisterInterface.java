/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.employeeregisterinterface;

import java.util.ArrayList;
import za.ac.tut.entities.Employee;

/**
 *
 * @author MNCEDISI
 */
public interface EmployeeRegisterInterface 
{
    public void recordEmployeeTemp(Employee employee);
    
    public void sortEmployee();
    
    public ArrayList<Employee> displayEmployee();
}
