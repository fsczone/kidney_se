/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sft.idea.hospital.kidny2017.se.supportive_sources;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author deepalsuranga
 */
public class data {
   
    public static ArrayList<String> province=new ArrayList<>();
    public static ArrayList<String> districts=new ArrayList<>();
    
    
    
    public static void md_changeview(JPanel jPanel1,JPanel jPanel2){
    
        if (!(jPanel1 == null)) {
            jPanel2.removeAll();
            jPanel2.repaint();
            jPanel2.revalidate();
            jPanel2.add(jPanel1);
            jPanel2.repaint();
            jPanel2.revalidate();

        } else if (jPanel1 == null) {

            
            jPanel2.removeAll();
            jPanel2.repaint();
            jPanel2.revalidate();
            jPanel2.add(jPanel1);
            jPanel2.repaint();
            jPanel2.revalidate();

        }
        
    }
    
    
    
}
