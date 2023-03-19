package com.example.proj;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
//    Item selectedItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout);

//        getSelectedItem();
//        setValues();

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String price = intent.getStringExtra("price");

        TextView summary = findViewById(R.id.finalSummary);
        summary.setText("Final Summary: \nName: " + name + "\nPrice: " + price + "\nThank you for shopping with us!");
    }

//    private void getSelectedItem() {
//        Intent prevIntent = getIntent();
//        String parseStringID = prevIntent.getStringExtra("id");
//        selectedItem = MainActivity2.arrayList.get(Integer.parseInt(parseStringID));
//
//
//    }
//
//    private void setValues() {
//        TextView itemName = (TextView) findViewById(R.id.item_title);
//        TextView itemPrice = (TextView) findViewById(R.id.item_price);
//        ImageView itemImage = (ImageView) findViewById(R.id.item_image);
//
//        itemName.setText(selectedItem.getName());
//        itemPrice.setText(selectedItem.getPrice());
//        itemImage.setImageResource(selectedItem.getImage());
//    }
}
