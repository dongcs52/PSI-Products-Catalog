package app.psi.productscatalog;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private int[] image = {R.drawable.tran,R.drawable.camera,R.drawable.camera2};
    private Handler handler = new Handler();

    private CardView menucamera,menuair,menuwaterfilter,menuradar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ทำ สไลด์โปรโมชั่น
        pager = (ViewPager) findViewById(R.id.viewpager);
        pager.setOffscreenPageLimit(1);
        pager.setAdapter(new InfiniteAdapter(this,image));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Log.i("Pager", String.valueOf(pager.getCurrentItem() + 1));
                pager.setCurrentItem(pager.getCurrentItem() + 1);
                handler.postDelayed(this,5000);

            }
        },5000);

        // addeven menucamera ในส่วนของ cardview_camera
        menucamera = (CardView)findViewById(R.id.cat_camera);
        menucamera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                opencamerapage();
            }
        });

        // addeven menuair ในส่วนของ cradview_air
        menuair = (CardView)findViewById(R.id.cat_air);
        menuair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openairpage();
            }
        });

        // addeven menuwaterfilter ในส่วนของ cradview_waterfilter
        menuwaterfilter = (CardView)findViewById(R.id.cat_water_purifier);
        menuwaterfilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwaterfilterpage();
            }
        });

        // addeven menuradar ในส่วนของ cradview_radar
        menuradar = (CardView)findViewById(R.id.cat_satellite);
        menuradar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openradarpage();
            }
        });
    }

    // function opencamerapage
    public void opencamerapage(){
        Intent intent = new Intent(this,camerapage2.class);
        startActivity(intent);
    }

    // function opencamerapage
    public void openairpage(){
        Intent intent = new Intent(this,airpage.class);
        startActivity(intent);
    }

    // function openwaterfilterpage
    public void openwaterfilterpage(){
        Intent intent = new Intent(this,waterfilterpage.class);
        startActivity(intent);
    }

    // function openradarpage
    public void openradarpage(){
        Intent intent = new Intent(this,radarpage.class);
        startActivity(intent);
    }


}
