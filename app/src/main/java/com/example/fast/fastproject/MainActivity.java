package com.example.fast.fastproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.fast.fastproject.base.act.BaseActivity;
import com.example.fast.fastproject.base.act.BaseNetActivity;
import com.example.fast.fastproject.entity.TestEntity;
import com.example.fast.fastproject.mvp.ApiContract;
import com.example.fast.fastproject.mvp.ViewsBuilder;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends BaseNetActivity implements
        ApiContract.View1,
        ApiContract.View2 {

    private List<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mLv = findViewById(R.id.listView);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                getData());
        mLv.setAdapter(mAdapter);
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Map<String, String> map = new HashMap<>();
                        map.put("count", "3");
                        mCommonPresenter.request1(map);
                        break;
                    case 1:
                        Map<String, String> map2 = new HashMap<>();
                        map2.put("count", "5");
                        mCommonPresenter.request2(map2);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    public List<String> getData() {
        List<String> data=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add("我是===》" + i);
        }
        return data;
    }

    @Override
    protected void convertBuilder(ViewsBuilder builder) {
        builder.setView1(this);
        builder.setView2(this);
    }

    @Override
    public void convert1(String data) {
        TestEntity testEntity = new Gson().fromJson(data, TestEntity.class);
        Log.i("fry", "请求1111的回调"+testEntity.getData().size());
        Toast.makeText(this, "请求1111的回调==>"+testEntity.getData().size(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void convert2(String data) {
        TestEntity testEntity = new Gson().fromJson(data, TestEntity.class);
        Log.i("fry", "请求222的回调"+testEntity.getData().size());
        Toast.makeText(this, "请求222的回调==>"+testEntity.getData().size(), Toast.LENGTH_SHORT).show();
    }


}
