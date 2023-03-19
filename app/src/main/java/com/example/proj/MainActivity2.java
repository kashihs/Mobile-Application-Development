package com.example.proj;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ArrayList<Item> itemArrayList;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        itemArrayList = new ArrayList<>();

        Resources res = getResources();
        String[] allItems = res.getStringArray(R.array.items);
        String[] allPrices = res.getStringArray(R.array.prices);

        populateItems(allItems, allPrices);

        ItemAdapter adapter = new ItemAdapter(getApplicationContext(), R.layout.item, itemArrayList);
        listview = findViewById(R.id.items_list);
        listview.setAdapter(adapter);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Home");

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");


    }

    public void populateItems(String[] items, String[] prices) {
        itemArrayList.add(new Item("0", items[0], prices[0], R.drawable.davinci_code));
        itemArrayList.add(new Item("1", items[1], prices[1], R.drawable.girl_train));
        itemArrayList.add(new Item("2", items[2], prices[2], R.drawable.harry_potter));
        itemArrayList.add(new Item("3", items[3], prices[3], R.drawable.hunder_games));
        itemArrayList.add(new Item("4", items[4], prices[4], R.drawable.lord_rings));
        itemArrayList.add(new Item("5", items[5], prices[5], R.drawable.moby_dick));
        itemArrayList.add(new Item("6", items[6], prices[6], R.drawable.mocking_bird));
        itemArrayList.add(new Item("7", items[7], prices[7], R.drawable.the_godfather));
    }
}

//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class MainActivity2 extends AppCompatActivity
//{
//
//    public static ArrayList<Shape> shapeList = new ArrayList<Shape>();
//
//    private ListView listView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//
//        setupData();
//        setUpList();
//        setUpOnclickListener();
//    }
//
//    private void setupData()
//    {
//        Shape i1 = new Shape("0", "The davinci code", "599", R.drawable.davinci_code);
//        shapeList.add(i1);
//
//        Shape i2 = new Shape("1","The Girl On The Train", "699", R.drawable.girl_train);
//        shapeList.add(i2);
//
//    }
//
//    private void setUpList()
//    {
//        listView = (ListView) findViewById(R.id.shapesListView);
//
//        ShapeAdapter adapter = new ShapeAdapter(getApplicationContext(), 0, shapeList);
//        listView.setAdapter(adapter);
//    }
//
//    private void setUpOnclickListener()
//    {
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
//            {
//                Shape selectShape = (Shape) (listView.getItemAtPosition(position));
//                Intent showDetail = new Intent(getApplicationContext(), DetailActivity.class);
//                showDetail.putExtra("id",selectShape.getId());
//                startActivity(showDetail);
//            }
//        });
//
//    }
//}

//package com.example.proj;
//
//import android.content.Intent;
//import android.content.res.Resources;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.ActionBar;
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//
//public class MainActivity2 extends AppCompatActivity {
//
//    public static ArrayList<Item> arrayList = new ArrayList<Item>();
//
////    private ListView listView;
//      ListView listView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//
//        listView = (ListView) findViewById(R.id.items_list);
//
//        ItemAdapter adapter = new ItemAdapter(getApplicationContext(), 0, arrayList);
//        listView.setAdapter(adapter);
//
//        setupData();
//        setupList();
//        setupOnClickListener();
//
////        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
////            @Override
////            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
////                Item selectedItem = (Item) (listView.getItemAtPosition(position));
////                Intent intent = new Intent(view.getContext(), MainActivity3.class);
////                intent.putExtra("name", selectedItem.getName());
////                intent.putExtra("price", selectedItem.getPrice());
////                startActivity(intent);
////            }
////        });
//    }
//
//    private void setupData() {
//        Item i1 = new Item("0", "The Da Vinci Code", "499" ,R.drawable.davinci_code);
//        arrayList.add(i1);
//
//        Item i2 = new Item("1", "The Girl On The Train", "699" , R.drawable.girl_train);
//        arrayList.add(i2);
//
//        Item i3 = new Item("2", "Harry Potter", "399" , R.drawable.harry_potter);
//        arrayList.add(i3);
//
//    }
//
//    private void setupList() {
//        listView = (ListView) findViewById(R.id.items_list);
//        ItemAdapter adapter = new ItemAdapter(getApplicationContext(), 0, arrayList);
//        listView.setAdapter(adapter);
//    }
//
//    private void setupOnClickListener() {
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
//                Item selectedItem = (Item) (listView.getItemAtPosition(position));
//                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
//                intent.putExtra("name", selectedItem.getName());
//                intent.putExtra("price", selectedItem.getPrice());
//                startActivity(intent);
//            }
//        });
//    }
//
