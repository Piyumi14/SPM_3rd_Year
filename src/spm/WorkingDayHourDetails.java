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
 * @author ASUS
 */
public class WorkingDayHourDetails extends AbstractTableModel{
    
     private static final String[] COLUMN_NAMES = {
        "ID",
        "Working Days Per Week",
        "Working Days",
        "Working Time Per Week",
        "One Hour Slot",
        "Half Hour Slot",
        "Batch"
    };
    
    private static ArrayList<WorkingDayHour> list;

    WorkingDayHourDetails(ArrayList<WorkingDayHour> workingList) {
        list = workingList;
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
                return list.get(rowIndex).getWrkid();
            case 1:
                return list.get(rowIndex).getNoWrkDaysPWeek();
            case 2:
                return list.get(rowIndex).getWrkDays();
            case 3:
                return list.get(rowIndex).getWrkTimePDay();
            case 4:
                return list.get(rowIndex).getOneHourSlot();
            case 5:
                return list.get(rowIndex).getHalfHourSlot();
            case 6:
                return list.get(rowIndex).getBatch();
            default:
                return "Error";
        }
    }

    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }
}
