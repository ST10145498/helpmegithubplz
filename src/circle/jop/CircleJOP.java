/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle.jop;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CircleJOP {

    public static void main(String[] args) {
        // Program -->JOP-->circle JOP
        String name;
        int age;
        double weight;
        
  //housekeeping 
    JOptionPane.showMessageDialog(null,"Enter your profile data");
         
  //request value and assign to the variables -- no pars--its a STRING
  name = JOptionPane.showInputDialog(null,"Enter your name>>>");
         
  age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age>>>"));
  
  weight = Double.parseDouble(JOptionPane.showInputDialog(null,"enter your weight>>>"));
  
  JOptionPane.showMessageDialog(null,"your captured details are as follows>>>"
     +"\nName: " + name
     +"\nAge: " + age
     +"\nWeight: " + weight);
         
        
        
       
    }
    
}
