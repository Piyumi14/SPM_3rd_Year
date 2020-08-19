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
public class AsubjectStaticsDetails extends AbstractTableModel{
    
      private static final String[] COLUMN_NAMES = {
          
         
          
        "Subject Code",
        "Year",
        "Semester",
        "noOfLecHr",
         "noOfTuteHr" ,
        "noOfLabHr",
        "noOfEvlHr"
    };
    
    private static ArrayList<AsubjectStacModel> list;

    AsubjectStaticsDetails(ArrayList<AsubjectStacModel> sList) {
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
                return list.get(rowIndex).getScode();
            case 1:
                return list.get(rowIndex).getYear();
            case 2:
                return list.get(rowIndex).getSem();
            case 3:
                return list.get(rowIndex).getNoOfLecHr();
            case 4:
                return list.get(rowIndex).getNoOfTuteHr();
            case 5:
                return list.get(rowIndex).getNoOfLabHr();
            case 6:
                return list.get(rowIndex).getNoOfEvlHr();
            default:
                return "Error";
        }
    }

    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    
}
