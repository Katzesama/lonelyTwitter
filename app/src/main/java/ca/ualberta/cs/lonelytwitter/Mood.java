/*
 * Mood
 *
 * Created by zp on 9/13/17.
 *
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Right Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represents a Mood
 *
 */
public abstract class Mood {
    private String mood;
    private Date date;

    /**
     *
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date mood date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * create Mood object
     */
    public Mood(){
        date = new Date();
    }

    /**
     *
     * @param date mood date
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     *
     * @return string
     */
    public abstract String getMood();
}
