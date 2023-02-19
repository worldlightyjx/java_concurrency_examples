package com.yang.designpatterns.observer;

import java.util.Observable;

public class Course extends Observable {
    private  String courseName;


    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void produceQuestion(Course course, Question question){
        System.out.println();
        setChanged();
        notifyObservers(question);
    }
}
