/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.util.*;
import za.ac.tut.employeemanager.EmployeeManger;
import za.ac.tut.entities.Employee;

/**
 *
 * @author MNCEDISI
 */
public class EmployeeApp 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        EmployeeManger em = new EmployeeManger();
        
        for (int i = 0; i < 10; i++)
        {
            Employee employee = getEmployees(i);
            em.recordEmployeeTemp(employee);
        }
        
        em.sortEmployee();
        
        String display = displayEmployees(em);
        
        System.out.println(display);
  
    }

    private static Employee getEmployees(int i) 
    {
        Scanner  sc = new Scanner(System.in);
        
        String input = "\nEmployee :"+(1+i)+"\nEnter your temperature :";
        System.out.println(input);
        double temperature = sc.nextDouble();
        
        input = "Enter your staff number :";
        System.out.println(input);
        int staffNum = sc.nextInt();
        
        return new Employee(temperature, staffNum);
    }

    private static String displayEmployees(EmployeeManger em) 
    {
        ArrayList<Employee> list = em.displayEmployee();
        String output = "\n";
        
        for (Employee display : list) 
        {
            output+="Staff No    :"+display.getStaffNum()+"\n"+
                    "Temperature :"+display.getTempareture()+"\n\n";
        }
        
        return output;
    }
}
