package com.software.digitals.layoutpractice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView mImageView = findViewById(R.id.mitchCircle);

        final AlphaAnimation alphaAnimation = new AlphaAnimation(0F, 1F);
        alphaAnimation.setDuration(1000);

        setupAnimation(mImageView, alphaAnimation);
    }

    private void setupAnimation(ImageView view, final Animation animation) {
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // If the button is checked, load the animation from the given resource
                // id instead of using the passed-in animation paramter. See the xml files
                // for the details on those animations.
                v.startAnimation(animation);
            }
        });
    }
}
