package com.londonappbrewery.destini;

/**
 * Created by Persi on 19-12-2017.
 */

public class Story {
    private int topAns;
    private  int bottomAns;
    private  int currentStory;
    private  int topButton;
    private int bottomButton;
    private Story topStory;
    private Story bottomStory;

    Story(int atopAns,int abottomAns,int acurrentStory,int atopButton,int abottomButton,Story atopStory,Story abottomStory){
        topAns=atopAns;
        bottomAns=abottomAns;
        currentStory=acurrentStory;
        topStory=atopStory;
        bottomStory=abottomStory;
        topButton=atopButton;
        bottomButton=abottomButton;
    }

    public int getTopAns() {
        return topAns;
    }

    public int getBottomAns() {
        return bottomAns;
    }


    public Story getTopStory() {
        return topStory;
    }

    public Story getBottomStory() {
        return bottomStory;
    }
}
