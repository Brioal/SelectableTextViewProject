package com.brioal.selectabletextviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.brioal.selectabletextview.OnWordClickListener;
import com.brioal.selectabletextview.SelectableTextView;

public class MainActivity extends AppCompatActivity {
    private SelectableTextView mTextView;
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.main_selectableTextView);
        mTextView.setSelectTextBackColorRes(R.color.colorAccent);
        mTextView.setText("“Second Fool” opened-his eyes and stared at the mud and thatch roof over his head. The quilt covering his body was a deep yellow color and had a musty smell. It was so old that its original color could no longer be distinguished.\n" +
                "\n" +
                "Next to him lay his second brother, Han Zhu, who appeared to be in a deep slumber. Snores intermittently floated over as he slept.\n" +
                "\n" +
                "Five feet from the bed was an earthen wall that had suffered from numerous cracks due to the passage of time. From the other side of the wall came the nagging voice of his mother and the occasional deep breathing of his father who was smoking his pipe.\n" +
                "\n" +
                "Second Fool slowly closed his eyes, trying to force himself to sleep. He knew that if he didn’t go to sleep now, he wouldn’t be able to wake up early the next day. If he woke up late, he would not be able to go up to the mountains with his good friends to gather firewood.\n" +
                "\n" +
                "Second Fool’s real name was Han Li. This elegant name was not given to him by his parents. When he was born, his parents had offered two pieces of cornbread to the village’s Elder Zhang in exchange for giving the baby Han Li a second name.\n" +
                "\n" +
                "(TL: “Second Fool” [er leng zi 二愣子] in Mandarin has a pleasing sound despite its meaning)");
        mTextView.setOnWordClickListener(new OnWordClickListener() {
            @Override
            protected void onNoDoubleClick(String word) {
                showToast(word);
            }
        });
    }

    public void showToast(String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(msg);
        }
        mToast.show();
    }

}
