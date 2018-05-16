package ua.org.skravchenko.generator;

import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private Button bPlus;
  private Button bMinus;
  private Button bGenerate;
  private TextView tvTactCount;
  private LinearLayout llContentLayout;
  private int tactCount = 1;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_main);

    bPlus = (Button) findViewById(R.id.bPlus);
    bMinus = (Button) findViewById(R.id.bMinus);
    bGenerate = (Button) findViewById(R.id.bGenerate);
    tvTactCount = (TextView) findViewById(R.id.tvTactCount);
    llContentLayout = (LinearLayout) findViewById(R.id.llContentLayout);

    bPlus.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        if (tactCount < 8) {
          tactCount++;
          tvTactCount.setText(tactCount+"");
        }
      }
    });
    bMinus.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        if (tactCount != 1) {
          tactCount--;
          tvTactCount.setText(tactCount+"");
        }
      }
    });

    bGenerate.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        if (tactCount <= 4) {
          llContentLayout.removeAllViews();
          LinearLayout llRoot = new LinearLayout(getApplicationContext());
          llRoot.setOrientation(LinearLayout.HORIZONTAL);
          llRoot.setWeightSum(4);
          llRoot.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,2));
          for (int i =0;i<tactCount;i++){
            ImageButton iElement = new ImageButton(getApplicationContext());
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1);
            iElement.setImageResource(R.drawable.ic_launcher_foreground);
            iElement.setLayoutParams(params);
            llRoot.addView(iElement);
          }
          llContentLayout.addView(llRoot);
        } else {
        }
      }
    });


  }

}



