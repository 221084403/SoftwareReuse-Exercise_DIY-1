/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.employeemanager;

import java.util.*;
import za.ac.tut.comparatorsort.SortEmployee;
import za.ac.tut.employeeregisterinterface.EmployeeRegisterInterface;
import za.ac.tut.entities.Employee;

/**
 *
 * @author MNCEDISI
 */
public class EmployeeManger implements EmployeeRegisterInterface
{
    private ArrayList<Employee> list;

    public EmployeeManger() 
    {
        list = new ArrayList<>();
    }
    
    @Override
    public void recordEmployeeTemp(Employee employee) 
    {
        list.add(employee);
    }

    @Override
    public void sortEmployee()
    {
        Collections.sort(list ,new SortEmployee().reversed());
    }

    @Override
    public ArrayList<Employee> displayEmployee() 
    {
        return list;
    }  
}
