package quyt.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<item> lst= new ArrayList<>();
        lst.add( new item("Nguyễn Văn A","124245251","hinh1"));
        lst.add(  new item("Nguyễn Văn B","815728","hinh2"));
        lst.add(  new item("Nguyễn Văn C","14134","hinh3"));
        lst.add(  new item("Nguyễn Văn D","124251","hinh4"));


        ListView listView=(ListView)findViewById(R.id.lv);
        MyAdapter myAdapter= new MyAdapter(this,lst);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //view: giao diện của dòng đang nhấn
                //i: vị trí nhấ
                item item= lst.get(i);
                //hiển thị toast
                Toast.makeText(MainActivity.this,item.ten,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
