package cn.itsite.akeyboard.demo;

import android.inputmethodservice.KeyboardView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import cn.itsite.akeyboard.KeyboardHelper;

/**
 * @author leguang
 * @version v0.0.0
 * @E-mail langmanleguang@qq.com
 * @time 2017/11/2 0002 17:39
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private KeyboardView mKeyboardView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mKeyboardView = (KeyboardView) findViewById(R.id.keyboard);
        textView = (TextView) findViewById(R.id.textView);
        final KeyboardHelper keyboardHelper = new KeyboardHelper(mKeyboardView, textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keyboardHelper.show();
            }
        });
    }
}
