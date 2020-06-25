package com.ajzamora.jokepresenter;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class JokePresenter extends AppCompatActivity {
    public static final String EXTRA_JOKE = "joke";
    private TextView mJokeTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_presenter);
        initUI();

        Intent intent = getIntent();
        if (intent == null) finish();
        else setJokeText(intent.getStringExtra(EXTRA_JOKE));

    }

    private void initUI() {
        mJokeTv = findViewById(R.id.tv_joke_main);
    }

    private void setJokeText(String joke) {
        if (TextUtils.isEmpty(joke)) joke = getString(R.string.default_joke_text);
        mJokeTv.setText(joke);
    }
}
