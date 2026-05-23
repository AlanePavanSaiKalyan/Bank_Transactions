package com.my_project.student_management.model;

import com.my_project.student_management.Main;

public class Student {
    private int id;
    private String name;
    private Double marks;
    private String school;

    public  Student(){};
    public Student(int id,String name,Double marks, String school){
        this.id = id;
        this.name = name;
        this.school = school;
        this.marks = marks;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String toString(){
        return "Id:"+id+", Name:"+name+", Marks:"+marks+", School:"+school;
    }
}
