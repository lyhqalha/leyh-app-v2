package com.leyhqalha.app;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

private int dp(float value) {
    return (int) (value * getResources().getDisplayMetrics().density + 0.5f);
}

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    LinearLayout root = new LinearLayout(this);
    root.setOrientation(LinearLayout.VERTICAL);
    root.setGravity(Gravity.CENTER);
    root.setPadding(dp(24), dp(24), dp(24), dp(24));
    root.setLayoutDirection(ViewGroup.LAYOUT_DIRECTION_RTL);
    root.setBackgroundColor(Color.rgb(250, 247, 239));

    TextView title = new TextView(this);
    title.setText("ليه قالها");
    title.setTextColor(Color.rgb(105, 83, 32));
    title.setTextSize(34);
    title.setGravity(Gravity.CENTER);
    title.setTypeface(null, Typeface.BOLD);
    root.addView(title, new LinearLayout.LayoutParams(-1, -2));

    TextView subtitle = new TextView(this);
    subtitle.setText("قصة الحديث النبوي وسبب وروده");
    subtitle.setTextColor(Color.rgb(75, 70, 60));
    subtitle.setTextSize(18);
    subtitle.setGravity(Gravity.CENTER);

    LinearLayout.LayoutParams subParams =
            new LinearLayout.LayoutParams(-1, -2);
    subParams.topMargin = dp(12);
    root.addView(subtitle, subParams);

    TextView note = new TextView(this);
    note.setText("بدأنا بنسخة نظيفة. سنضيف الأحاديث والقصص والصوت بعد اختبار البناء.");
    note.setTextColor(Color.rgb(90, 86, 76));
    note.setTextSize(15);
    note.setGravity(Gravity.CENTER);
    note.setPadding(dp(16), dp(20), dp(16), dp(20));

    LinearLayout.LayoutParams noteParams =
            new LinearLayout.LayoutParams(-1, -2);
    noteParams.topMargin = dp(24);
    root.addView(note, noteParams);

    setContentView(root);
}

}
