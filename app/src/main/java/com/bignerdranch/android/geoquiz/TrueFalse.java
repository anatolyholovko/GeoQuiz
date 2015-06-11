package com.bignerdranch.android.geoquiz;

public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public boolean isTruwQuestion() {
        return mTrueQuestion;
    }

    public void setTruwQuestion(boolean mTruwQuestion) {
        this.mTrueQuestion = mTruwQuestion;
    }
}
