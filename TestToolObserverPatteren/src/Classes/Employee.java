/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Samir
 */
public abstract class Employee {

    protected String employeeName;
    protected String employeeCNIC;
    protected String employeeID;
    /**
     * @return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @return the employeeCNIC
     */
    public String getEmployeeCNIC() {
        return employeeCNIC;
    }

    /**
     * @param employeeCNIC the employeeCNIC to set
     */
    public void setEmployeeCNIC(String employeeCNIC) {
        this.employeeCNIC = employeeCNIC;
    }

    /**
     * @return the employeeID
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
