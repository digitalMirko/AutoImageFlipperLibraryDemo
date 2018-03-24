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
        // using 10 images on the app
        int num_of_pages = 10;
        for (int i = 0; i < num_of_pages; i++) {
            FlipperView view = new FlipperView(getBaseContext());
//            view.setImageDrawable(R.drawable.image1) // Use one of setImageUrl() or setImageDrawable() functions, otherwise IllegalStateException will be thrown

            // 10 images available in the demo
            // images found on unsplash.com, author details included below about images used
            switch(i){
                case 0:
                    // Mosque down view - Photo by Afifi Zulkifle on Unsplash
                    view.setImageDrawable(R.drawable.image1);
                    break;
                case 1:
                    // New York Skyscrapers - Photo by Ryan Loughlin on Unsplash
                    view.setImageDrawable(R.drawable.image2);
                    break;
                case 2:
                    // Chicago Skyscrapers looking up at a plane - Photo by emily reider on Unsplash
                    view.setImageDrawable(R.drawable.image3);
                    break;
                case 3:
                    // Escalator - Photo by Jorik Kleen Unsplash
                    view.setImageDrawable(R.drawable.image4);
                    break;
                case 4:
                    // Singapore City Skyline - Photo by Xavier Lee on Unsplash
                    view.setImageDrawable(R.drawable.image5);
                    break;
                case 5:
                    // Asign Market - Photo by Alec Webskowski on Unsplash
                    view.setImageDrawable(R.drawable.image6);
                    break;
                case 6:
                    // Woman laying back on PacMan Screen - Photo by Erik Lucatero on Unsplash
                    view.setImageDrawable(R.drawable.image7);
                    break;
                case 7:
                    // Tennis Court down view - Photo by Izuddin Helmi Adnan on Unsplash
                    view.setImageDrawable(R.drawable.image8);
                    break;
                case 8:
                    // Cave opening at night Jonatan Pie on Unsplash
                    view.setImageDrawable(R.drawable.image9);
                    break;
                case 9:
                    // Brooklyn Winter, United States - Photo by Andre Benz on Unsplash
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
                            // Toast to show Image Position when user clicks the photo
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
