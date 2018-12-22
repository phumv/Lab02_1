package com.phumv.lab02_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    //khởi tạo kiểu dữ liệu cho mảng arr (data source)
    private String[] arr = {"Teo", "Ty", "Bin", "Bo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //lấy đối tượng listview dựa vào id
        lv = (ListView) findViewById(R.id.lv_person);
        //gán data source vào array adapter
        ArrayAdapter adapter = new ArrayAdapter
                (this, android.R.layout.simple_list_item_1, arr);
        //đưa data source vào listview
        lv.setAdapter(adapter);
        final TextView tvSelection = (TextView) findViewById(R.id.tv_selection);
        //Thiết lập sự kiện cho Listview, khi chọn phần tử nào thì hiển thị lên TextView
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        //đối số arg2 là vị trí phần tử trong Data Source (arr)
                        tvSelection.setText("position :" + arg2 + " ; value =" + arr[arg2]);
                    }
                });


    }
}
