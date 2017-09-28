/*
 * NormalTweet
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
 * represents normal tweet
 */
public class NormalTweet extends Tweet{
    /**
     *
     * @param message string
     */
    public NormalTweet(String message){
        super(message);
    }

    /**
     *
     * @param message string
     * @param date date
     */
    public NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     *
     * @return boolean
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
