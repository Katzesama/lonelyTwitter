/*
 * ImportantTweet
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
 * represents important tweet
 */
public class ImportantTweet extends Tweet {
    /**
     *
     * @param message importanttweet message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     *
     * @param message importanttweet message
     * @param date importanttweet date
     */
    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * return true the tweet is important
     *
     * @return true
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
