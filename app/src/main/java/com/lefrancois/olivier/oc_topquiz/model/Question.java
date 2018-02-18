package com.lefrancois.olivier.oc_topquiz.model;

import java.util.List;

/**
 * Created by olivier on 18/02/2018.
 */

public class Question {

    private String mQuestion;
    private List<String> mChoiceList;
    private int mAnswerIndex;

    public Question(String question, List<String> choiceList, int answerIndex) {
        mQuestion = question;
        mChoiceList = choiceList;
        mAnswerIndex = answerIndex;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public List<String> getChoiceList() {
        return mChoiceList;
    }

    public void setChoiceList(List<String> choiceList) {
        if (choiceList != null) {
            mChoiceList = choiceList;
        } else {
            throw new IllegalArgumentException("Array cannot be null");
        }
    }

    public int getAnswerIndex() {
        return mAnswerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        if (answerIndex > 0 || answerIndex <= mChoiceList.size()) {
            mAnswerIndex = answerIndex;
        } else {
            throw new IllegalArgumentException("Answer index is out of bound");
        }
    }

    @Override
    public String toString() {
        return "Question{" +
                "mQuestion='" + mQuestion + '\'' +
                ", mChoiceList=" + mChoiceList +
                ", mAnswerIndex=" + mAnswerIndex +
                '}';
    }
}
