package com.digitalmirko.autoimageflipperlibrarydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FlipperLayout flipperLayout = (FlipperLayout) findViewById(R.id.flipper_layout);
        int num_of_pages = 10;
        for (int i = 0; i < num_of_pages; i++) {
            FlipperView view = new FlipperView(getBaseContext());
//            view.setImageDrawable(R.drawable.image1) // Use one of setImageUrl() or setImageDrawable() functions, otherwise IllegalStateException will be thrown

            switch(i){
                case 0:
                    view.setImageDrawable(R.drawable.image1);
                    break;
                case 1:
                    view.setImageDrawable(R.drawable.image2);
                    break;
                case 2:
                    view.setImageDrawable(R.drawable.image3);
                    break;
                case 3:
                    view.setImageDrawable(R.drawable.image4);
                    break;
                case 4:
                    view.setImageDrawable(R.drawable.image5);
                    break;
                case 5:
                    view.setImageDrawable(R.drawable.image6);
                    break;
                case 6:
                    view.setImageDrawable(R.drawable.image7);
                    break;
                case 7:
                    view.setImageDrawable(R.drawable.image8);
                    break;
                case 8:
                    view.setImageDrawable(R.drawable.image9);
                    break;
                case 9:
                    view.setImageDrawable(R.drawable.image10);
                    break;
            }

            view.setImageScaleType(ImageView.ScaleType.CENTER_CROP) //You can use any ScaleType
//                    .setDescription("Description")
                    .setOnFlipperClickListener(new FlipperView.OnFlipperClickListener() {
                        @Override
                        public void onFlipperClick(FlipperView flipperView) {
                            //Handle View Click here
                            int position = flipperLayout.getCurrentPagePosition() + 1;
                            Toast.makeText(MainActivity.this, "Position " + position,
                                    Toast.LENGTH_SHORT).show();
                        }
                    });
            flipperLayout.setScrollTimeInSec(8); //setting up scroll time, by default it's 3 seconds
//            flipperLayout.getScrollTimeInSec(); //returns the scroll time in sec
//            flipperLayout.getCurrentPagePosition(); //returns the current position of pager
            flipperLayout.addFlipperView(view);
        }
    }
}
