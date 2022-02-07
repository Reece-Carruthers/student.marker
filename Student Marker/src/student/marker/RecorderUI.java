/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.marker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 *
 * @author elite
 */
public class RecorderUI {
    
    
    public Integer display(){
        
        try{
            BufferedReader cons = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the size of the student group: ");
            Integer numStudents = Integer.parseInt(cons.readLine());
            
            return numStudents;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return -1;
        }
        
    }
    
    public String[] enterMarks(){
        
        String[] studentRecord;
        
        try{
            BufferedReader cons = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name of the student: ");
            String studentName = cons.readLine();
            System.out.println("Enter the mark of the student: ");
            String studentMark = cons.readLine();
        

            studentRecord = new String[2] ;
           
            studentRecord[0] = studentName;
            studentRecord[1] = studentMark;
           
            
            return studentRecord;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
