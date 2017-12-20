package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryText;
    Button mTopButton;
    Button mBottomButton;
    Story mcurrentStory;
    boolean topOrbottom;//top=true,bottom=false


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText= (TextView) findViewById(R.id.storyTextView);
        mStoryText.setText(R.string.T1_Story);
        mTopButton=(Button) findViewById(R.id.buttonTop);
        mTopButton.setText(R.string.T1_Ans1);
        mBottomButton= (Button) findViewById(R.id.buttonBottom);
        mBottomButton.setText(R.string.T2_Ans2);
        Story s3=new Story(R.string.T6_End,R.string.T5_End,R.string.T3_Story,
                R.string.T3_Ans1,R.string.T3_Ans2,null,null);
        Story s2=new Story(R.string.T3_Story,R.string.T4_End,R.string.T2_Story,
                R.string.T2_Ans1,R.string.T2_Ans2,s3,null);
        Story s1=new Story(R.string.T3_Story,R.string.T2_Story,R.string.T1_Story,
                R.string.T1_Ans1,R.string.T1_Ans2,s3,s2);
        mcurrentStory=s1;

    }
    private void updateStory(boolean topOrbottom,Story current){
        if(topOrbottom==true){
            if(current!=null)
            {mStoryText.setText(current.getTopAns());
            mcurrentStory=current.getTopStory();}
            else{
                Log.d("destini","end of game");
            }
        }
        else{
            if(current!=null)
            {mStoryText.setText(current.getBottomAns());
            mcurrentStory=current.getBottomStory();}
            else{
                Log.d("destini","end of game2");
            }
        }

    }
    private  void updateButton(Story current){
        if(current==null){
            //mTopButton.
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);

        }
        else {
            mTopButton.setText(current.getTopAns());
            mBottomButton.setText(current.getBottomAns());
        }
    }
    public void playTop(View v){
        updateStory(true,mcurrentStory);
        updateButton(mcurrentStory);

    }
    public  void playBottom(View v){
        updateStory(false,mcurrentStory);
        updateButton(mcurrentStory);

    }
}
