package lk.chathurabuddi.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import lk.chathurabuddi.interactivestory.R;
import lk.chathurabuddi.interactivestory.model.Page;

public class StoryActivity extends AppCompatActivity {

    private Page[] pages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));
        if(name==null || name.isEmpty()){
            name = "Friend";
        }
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}
