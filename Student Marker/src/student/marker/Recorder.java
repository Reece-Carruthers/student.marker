/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.marker;

import java.util.ArrayList;


/**
 *
 * @author elite
 */
public class Recorder {
    
    MarkCollection markCollection;
    RecorderUI userInterface;
    Integer classSize;
    
    public Recorder(){
        this.userInterface = new RecorderUI();
        
        this.classSize = userInterface.display();
        
        if(classSize == -1){
            System.out.println("An error has occured! ENsure you are typing a number");
        }else{
            CreateClass(classSize);
        }
        
        EnterMark();
        
        GetStatistics();
        
    }
    
  
    private void CreateClass(Integer classSize){
        
        
        this.markCollection = new MarkCollection();
        markCollection.setSize(classSize);

    }
    
    private void EnterMark(){
        
        for(int i = 0 ; i < markCollection.getMarkCollection().size();i++){
            String[] nameMarks = userInterface.enterMarks();
            String name = nameMarks[0];
            Integer mark = Integer.parseInt(nameMarks[1]);
            
            MarkRecord studentRecord = (MarkRecord) markCollection.getMarkCollection().get(i);
            studentRecord.setName(name);
            studentRecord.setMark(mark); 
        }
        

    }
    
    private void GetStatistics(){
        ArrayList<MarkRecord> marks = markCollection.getMarkCollection();
        
        Integer amountOfPasses = 0;
        Integer totalMark = 0;
        
        for(int i = 0; i < marks.size();i++){
            MarkRecord studentRecord = marks.get(i);
            String studentName = studentRecord.getName();
            String studentMark = String.valueOf(studentRecord.getMark());
            
            System.out.println("Student: "+ studentName +" achieved a mark of: "+ studentMark +"\n");
            if(studentRecord.getMark() >= 50){
                amountOfPasses += 1;
            }
            totalMark += studentRecord.getMark();
        }
        System.out.println("In total there were: "+ amountOfPasses + " passes out of "+ String.valueOf(marks.size()) + " students\n");
        System.out.println("The class average was: " + (totalMark / marks.size()));
    }
    
}