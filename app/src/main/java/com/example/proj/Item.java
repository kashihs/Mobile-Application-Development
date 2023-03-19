package com.example.proj;

class Item {
    public String id;
    public String name;
    public String price;
    public int image;

    public Item(String id, String name, String price, int image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

//public class Item {
//    private String itemName;
//    private String itemPrice;
//    private int itemImageId;
//
//    public Item(String itemName, String itemPrice, int itemImageId) {
//        this.itemName = itemName;
//        this.itemPrice = itemPrice;
//        this.itemImageId = itemImageId;
//    }
//
//    public String getItemName() {
//        return itemName;
//    }
//
//    public String getItemPrice() {
//        return itemPrice;
//    }
//
//    public int getItemImageId() {
//        return itemImageId;
//    }
//}
