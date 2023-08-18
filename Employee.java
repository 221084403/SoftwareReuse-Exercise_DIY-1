/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

/**
 *
 * @author MNCEDISI
 */
public class Employee 
{
    private double tempareture;
    private int staffNum;

    public Employee(double tempareture, int staffNum) 
    {
        this.tempareture = tempareture;
        this.staffNum = staffNum;
    }

    public double getTempareture() {
        return tempareture;
    }

    public void setTempareture(double tempareture) {
        this.tempareture = tempareture;
    }

    public int getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(int staffNum) {
        this.staffNum = staffNum;
    }
}
