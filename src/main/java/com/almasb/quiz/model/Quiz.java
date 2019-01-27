package com.almasb.quiz.model;

import java.util.List;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class Quiz {

    private List<QuestionModel.Question> questions;

    public Quiz() { }

    public Quiz(List<QuestionModel.Question> questions) {
        this.questions = questions;
    }

    public List<QuestionModel.Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionModel.Question> questions) {
        this.questions = questions;
    }
}
