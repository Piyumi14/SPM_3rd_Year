/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class AlecturerStaticsDetails extends AbstractTableModel {
    
      private static final String[] COLUMN_NAMES = {
       
          
        "category",
        "center",
        "faculty",
        "Department",
        "NoOFSub"
         
    };
    
    private static ArrayList<AlecStacModel> list;

    AlecturerStaticsDetails(ArrayList<AlecStacModel> sList) {
        list = sList;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getCategory();
            case 1:
                return list.get(rowIndex).getScenter();
            case 2:
                return list.get(rowIndex).getFaculty();
            case 3:
                return list.get(rowIndex).getDept();
            case 4:
                return list.get(rowIndex).getNoOFSub();    
            default:
                return "Error";
        }
    }

    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    
}
