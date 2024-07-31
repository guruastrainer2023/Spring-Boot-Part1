/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.bean.exam;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class Question {
    
    String questionText;
    int score;
    List<AnswerChoice> choices;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<AnswerChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<AnswerChoice> choices) {
        this.choices = choices;
    }
    
    
    
    
}
