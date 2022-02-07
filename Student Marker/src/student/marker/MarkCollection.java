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
public class MarkCollection {
    
    ArrayList markCollection;
    
    public void setSize(Integer classSize){
        markCollection = new ArrayList<MarkRecord>(classSize);
    
        for(int i = 0; i < classSize; i++){
            markCollection.add(new MarkRecord());
        }
    }

    public ArrayList getMarkCollection() {
        return markCollection;
    }
    
    
}
