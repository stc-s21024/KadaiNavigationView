package jp.suntech.s21024.kadainavigationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lvMenu = findViewById(R.id.lvMenu);
        lvMenu.setOnItemClickListener(new ListItemClickListener());
    }
    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long l){
//            String item = (String)parent.getItemAtPosition(position);
            TextView tvText = (TextView)view;
            String item = tvText.getText().toString();
            String show = "あなたが選んだ国：" + item;
            TextView out = findViewById(R.id.tv);
            out.setText(show);
        }
    }
}