/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.comparatorsort;

import java.util.Comparator;
import za.ac.tut.entities.Employee;

/**
 *
 * @author MNCEDISI
 */
public class SortEmployee implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) 
    {
        int diff = 0;
        
        if(o1.getTempareture() < o2.getTempareture())
            diff = (int)(o1.getTempareture() - o2.getTempareture());
       
        return diff;
    } 
}
