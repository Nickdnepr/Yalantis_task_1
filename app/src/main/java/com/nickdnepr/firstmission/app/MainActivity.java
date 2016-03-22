package com.nickdnepr.firstmission.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;


public class MainActivity extends Activity {
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView home = (ImageView) findViewById(android.R.id.home);
        home.setPadding(0, 0, 15, 0);
        ActionBar actionBar = getActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.show();
        //----------------------------------------------------------------
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<String> list = new ArrayList<String>();
        list.add("https://lh5.googleusercontent.com/-QLBuSvH9tSo/UtXIV4wgrfI/AAAAAAAABUE/coUM_sZALMk/w600-h600/%25D9%2584%25D8%25B3%25D9%2586%25D8%25A9%2B%2B%25D8%25A7%25D9%2584%25D8%25AC%25D8%25AF%25D9%258A%25D8%25AF%25D8%25A9%2B%25281%2529.png");
        list.add("https://s-media-cache-ak0.pinimg.com/736x/fa/06/fe/fa06fec6fe5d38147fad57d3b1ae5bf7.jpg");
        list.add("http://image.blingee.com/images18/content/output/000/000/000/77d/737212129_21943.gif");

        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(list, MainActivity.this.getApplicationContext());
        recyclerView.setAdapter(adapter);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        };

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        TextView textView10 = (TextView) findViewById(R.id.textView10);
        TextView textView11 = (TextView) findViewById(R.id.textView11);

        textView1.setOnClickListener(listener);
        textView2.setOnClickListener(listener);
        textView3.setOnClickListener(listener);
        textView4.setOnClickListener(listener);
        textView5.setOnClickListener(listener);
        textView6.setOnClickListener(listener);
        textView7.setOnClickListener(listener);
        textView8.setOnClickListener(listener);
        textView9.setOnClickListener(listener);
        textView10.setOnClickListener(listener);
        textView11.setOnClickListener(listener);


        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:

                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
//        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

//        return super.onOptionsItemSelected(item);
    }
}
