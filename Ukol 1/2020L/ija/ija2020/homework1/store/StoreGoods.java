package ija.ija2020.homework1.store;

import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class StoreGoods implements Goods {
    private String g_name;
    private ArrayList<GoodsItem> arr_list = new ArrayList<GoodsItem>();
    public StoreGoods(String name){
        g_name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreGoods that = (StoreGoods) o;
        return Objects.equals(g_name, that.g_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(g_name);
    }

    @Override
    public String getName() {
        return g_name;
    }

    @Override
    public boolean addItem(GoodsItem goodsItem) {
        if(!arr_list.add(goodsItem)){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public GoodsItem newItem(LocalDate localDate) {
        GoodsItem new_item = new StoreGoodsItem(this, localDate);
        arr_list.add(new_item);
        return new_item;
    }

    @Override
    public boolean remove(GoodsItem goodsItem) {
        int get_info = arr_list.indexOf(goodsItem);
        if (get_info == -1) {
            return false;
        } else {
            arr_list.remove(get_info);
            return true;
        }
    }

    @Override
    public boolean empty() {
        if (arr_list.size() != 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int size() {
        return arr_list.size();
    }
}
