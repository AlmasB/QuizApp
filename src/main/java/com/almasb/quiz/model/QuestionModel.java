package com.almasb.quiz.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class QuestionModel {

    public StringProperty text = new SimpleStringProperty();
    public StringProperty answerA = new SimpleStringProperty();
    public StringProperty answerB = new SimpleStringProperty();
    public StringProperty answerC = new SimpleStringProperty();
    public StringProperty answerD = new SimpleStringProperty();

    public Question toData() {
        return new Question(text.get(), answerA.get(), answerB.get(), answerC.get(), answerD.get());
    }

    @Override
    public String toString() {
        return text.get();
    }

    /**
     * By convention answerA is the right answer.
     *
     * @author Almas Baimagambetov (almaslvl@gmail.com)
     */
    public static class Question {

        private String text;

        private String answerA;
        private String answerB;
        private String answerC;
        private String answerD;

        public Question() { }

        public Question(String text, String answerA, String answerB, String answerC, String answerD) {
            this.text = text;
            this.answerA = answerA;
            this.answerB = answerB;
            this.answerC = answerC;
            this.answerD = answerD;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getAnswerA() {
            return answerA;
        }

        public void setAnswerA(String answerA) {
            this.answerA = answerA;
        }

        public String getAnswerB() {
            return answerB;
        }

        public void setAnswerB(String answerB) {
            this.answerB = answerB;
        }

        public String getAnswerC() {
            return answerC;
        }

        public void setAnswerC(String answerC) {
            this.answerC = answerC;
        }

        public String getAnswerD() {
            return answerD;
        }

        public void setAnswerD(String answerD) {
            this.answerD = answerD;
        }

        public QuestionModel toModel() {
            var model = new QuestionModel();
            model.text.set(text);
            model.answerA.set(answerA);
            model.answerB.set(answerB);
            model.answerC.set(answerC);
            model.answerD.set(answerD);
            return model;
        }
    }
}
