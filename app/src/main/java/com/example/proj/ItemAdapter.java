package com.example.proj;

//import android.content.Context;
//import android.graphics.drawable.shapes.Shape;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.List;
//
//public class ItemAdapter extends ArrayAdapter<Item> {
//    public ItemAdapter(Context context, int resource, List<Item> shapeList)
//    {
//        super(context,resource,shapeList);
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent)
//    {
//        Item shape = getItem(position);
//
//        if(convertView == null)
//        {
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
//        }
//
//        TextView itemName = (TextView) convertView.findViewById(R.id.item_title);
//        TextView itemPrice = (TextView) convertView.findViewById(R.id.item_price);
//        ImageView itemImage = (ImageView) convertView.findViewById(R.id.item_image);
//
//        itemName.setText(shape.getName());
//        itemPrice.setText(shape.getPrice());
//        itemImage.setImageResource(shape.getImage());
//
//        return convertView;
//    }
//}

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    private final ArrayList<Item> itemArrayList;

    public ItemAdapter(@NonNull Context context, int resource, ArrayList<Item> itemArrayList) {
        super(context, resource, itemArrayList);
        this.itemArrayList = itemArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int phraseIndex = position;
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item,
                    parent, false);
        }

        ImageView itemImage = convertView.findViewById(R.id.item_image);
        TextView itemNameView = convertView.findViewById(R.id.item_title);
        TextView itemPriceView = convertView.findViewById(R.id.item_price);
        Button buyNow = convertView.findViewById(R.id.buy_now);

        buyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String iName = itemArrayList.get(position).getName();
                String price = itemArrayList.get(position).getPrice();
                String message = "You have Successfully ordered: " + iName + "\nPrice: " + price + "\nGo back to logout or continue shopping";
                Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
            }
        });


        itemImage.setImageResource(itemArrayList.get(position).getImage());
        itemNameView.setText(itemArrayList.get(position).getName());
        itemPriceView.setText(itemArrayList.get(position).getPrice());

        return convertView;
    }
}
