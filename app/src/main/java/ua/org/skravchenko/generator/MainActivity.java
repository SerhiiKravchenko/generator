package ua.org.skravchenko.generator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

  private android.widget.Button bPlus;
  private android.widget.Button bMinus;
  private android.widget.Button bGenerate;
  private android.widget.TextView tvTactCount;
  private android.widget.LinearLayout llUpLayout;
  private android.widget.LinearLayout llDownLayout;


  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_main);

    bPlus = (android.widget.Button) findViewById(R.id.bPlus);
    bMinus = (android.widget.Button) findViewById(R.id.bMinus);
    bGenerate = (android.widget.Button) findViewById(R.id.bGenerate);
    tvTactCount = (android.widget.TextView) findViewById(R.id.tvTactCount);
    llUpLayout = (android.widget.LinearLayout) findViewById(R.id.llUpLayout);
    llDownLayout = (android.widget.LinearLayout) findViewById(R.id.llDownLayout);




}








  }



