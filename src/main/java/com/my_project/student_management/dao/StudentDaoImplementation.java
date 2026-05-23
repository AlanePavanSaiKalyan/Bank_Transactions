package com.my_project.student_management.dao;

import com.my_project.student_management.config.DbConnection;
import com.my_project.student_management.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDaoImplementation implements StudentDao {
    @Override
    public void addStudent(Student student){
        String qurey = "Insert into students(id,name,marks,school) values(?,?,?,?)";
    try( Connection connection = DbConnection.getConnection();
         PreparedStatement ps = connection.prepareStatement(qurey);){
        ps.setInt(1,student.getId());
        ps.setString(2,student.getName());
        ps.setDouble(3,student.getMarks());
        ps.setString(4,student.getSchool());
       int rows= ps.executeUpdate();
       if(rows>0){
           System.out.println("Student added successfully");
       }
       else {
           System.out.println("Failed To add student");
       }
    }catch (Exception e){
        e.printStackTrace();
    }
    }

    @Override
    public void updateStudent(Student student) {
        StringBuilder query = new StringBuilder("UPDATE students set ");
        if(student.getName()!=null){
            query.append("name = ?,");
        }
        if(student.getMarks() != null){
            query.append("marks = ?,");
        }
        if(student.getSchool()!=null){
            query.append("school = ?,");
        }
        query.deleteCharAt(query.length()-1);
        query.append(" Where id = ?");

        try{
            Connection connection = DbConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(new String(query));
            int index = 1;
            if(student.getName() != null){
                ps.setString(index++,student.getName());
            };
            if(student.getMarks() != null){
                ps.setDouble(index++,student.getMarks());
            }
            if(student.getSchool()!= null){
                ps.setString(index++,student.getSchool());
            }
            ps.setInt(index,student.getId());
            int rows = ps.executeUpdate();
            if(rows>0){
                System.out.println("Student updated successfully");
            }
            else System.out.println("Failed to update Student");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Student> getStudents() {
        ArrayList<Student> s = new ArrayList<>();
        String query = "Select * from students";
        try{
            Connection connection = DbConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next()){
                s.add(new Student(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getDouble("marks"),resultSet.getString("school")));
            }
            return s;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteStudent(int id) {
    String query = "DELETE from students where id = ?";
    try {
        Connection connection = DbConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
       int rows =  preparedStatement.executeUpdate();
        if(rows>0){
            System.out.println("Student deleted successfully");
        }
        else {
            System.out.println("Failed to delete Student");
        }
    }catch (Exception e){
        e.printStackTrace();
    }
    }
}
