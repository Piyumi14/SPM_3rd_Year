/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PIYUMI
 */
public class DBOperation {
    String url = "jdbc:mysql://localhost:3306/spm";
    String username = "root";
    String password = "root";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st;
    
    //Add Subject Details
    boolean addSubject(Subject s) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "Insert into subject values (?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, s.getSid());
            pst.setString(2, s.getAcademicYear());
            pst.setString(3, s.getSemester());
            pst.setString(4, s.getProgram());
            pst.setString(5, s.getGroupNo());
            pst.setString(6, s.getSubGroupNo());

            pst.executeUpdate();

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (Exception e) {
                    System.out.println(e);
                    return false;
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                    return false;
                }
            }
        }
    }
    
    //Get all Subject Details
    ArrayList<Subject> getSubjects() {
        try {
            ArrayList<Subject> list = new ArrayList<Subject>();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM subject";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                Subject s = new Subject();
                s.setSid(rs.getInt(1));
                s.setAcademicYear(rs.getString(2));
                s.setSemester(rs.getString(3));
                s.setProgram(rs.getString(4));
                s.setGroupNo(rs.getString(5));
                s.setSubGroupNo(rs.getString(6));
               
                list.add(s);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
  
     
     //Execute SQL
     public void executeSQLQuery(String query, String message){
         try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            st = con.createStatement();

            if((st.executeUpdate(query)) == 1){
                JOptionPane.showMessageDialog(null, "Data " +message+" Successfully");
            }else{
                JOptionPane.showMessageDialog(null, "Data Not " +message+" Successfully");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
     }
     
     //Add Tag Details
    boolean addTag(Tag t) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "Insert into tag values (?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, t.getTid());
            pst.setString(2, t.getTag());
            pst.setString(3, t.getDescription());
           
            pst.executeUpdate();

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (Exception e) {
                    System.out.println(e);
                    return false;
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                    return false;
                }
            }
        }
    }
    
    //Get all Subject Details
    ArrayList<Tag> getTags() {
        try {
            ArrayList<Tag> list = new ArrayList<Tag>();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM tag";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                Tag t = new Tag();
                t.setTid(rs.getInt(1));
                t.setTag(rs.getString(2));
                t.setDescription(rs.getString(3));
                
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    boolean addBuilding(BuildingModel b) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "Insert into building values (?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);
            
    

            pst.setInt(1, b.getBid());
            pst.setString(2, b.getbName());
            pst.setString(3, b.getCenter());
            pst.setString(4, b.getLocation());
            pst.setString(5, b.getNoOfFloors());
            pst.setString(6, b.getDepartment());

            pst.executeUpdate();

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (Exception e) {
                    System.out.println(e);
                    return false;
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                    return false;
                }
            }
        }
    }
    
    
     ArrayList<BuildingModel> getBuildingDetails() {
        try {
            ArrayList<BuildingModel> list = new ArrayList<BuildingModel>();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM building";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                BuildingModel buildingModel = new BuildingModel();
                buildingModel.setBid(rs.getInt(1));
                buildingModel.setCenter(rs.getString(3));
                buildingModel.setbName(rs.getString(2));
                buildingModel.setLocation(rs.getString(4));
                buildingModel.setNoOfFloors(rs.getString(5));
                buildingModel.setDepartment(rs.getString(6));
               
                list.add(buildingModel);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
     

}
