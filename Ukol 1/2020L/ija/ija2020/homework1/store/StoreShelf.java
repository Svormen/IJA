package ija.ija2020.homework1.store;

import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsItem;
import ija.ija2020.homework1.goods.GoodsShelf;
import java.util.HashMap;
import java.util.ArrayList;

public class StoreShelf implements GoodsShelf {
    private HashMap<String, ArrayList<GoodsItem>> shelf_arr_list = new HashMap<String, ArrayList<GoodsItem>>();

    @Override
    public void put(GoodsItem goodsItem) {
        if (shelf_arr_list.containsKey(goodsItem.goods().getName())) {
            shelf_arr_list.get(goodsItem.goods().getName()).add(goodsItem);
        } else {
            ArrayList<GoodsItem> new_shelf = new ArrayList<GoodsItem>();
            new_shelf.add(goodsItem);
            shelf_arr_list.put(goodsItem.goods().getName(), new_shelf);
        }
    }

    @Override
    public boolean containsGoods(Goods goods) {
        return shelf_arr_list.containsKey(goods.getName());
    }

    @Override
    public GoodsItem removeAny(Goods goods) {
        if (shelf_arr_list.containsKey(goods.getName())) {
            return shelf_arr_list.get(goods.getName()).remove(0);
        } else {
            return null;
        }
    }

    @Override
    public int size(Goods goods) {
        if (shelf_arr_list.containsKey(goods.getName())) {
            return shelf_arr_list.get(goods.getName()).size();
        } else {
            return 0;
        }
    }
}
