/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author DELL
 */

    
public class Doctor implements Staff{

    @Override
    public void getSallary() {
        System.out.println("The sallary to Doctor is 15000");
    }

    @Override
    public void getYearsOfWork() {
        System.out.println("Experience Years to Doctor 8");
    }
    
