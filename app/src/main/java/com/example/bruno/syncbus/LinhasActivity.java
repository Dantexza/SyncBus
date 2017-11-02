package com.example.bruno.syncbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.app.ListActivity;
import android.widget.TextView;

public class LinhasActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linhas);

        String[] values = new String[]{"200 - Pq. Tecnologico","201 - Bairinho","202 - Bom Retiro","204 - Pq. Novo Horizonte","205 - Eug. de Melo","206 - Santa Inês"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);
        setListAdapter(adapter);
        AdapterView.OnItemClickListener item = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        };
    }


}
