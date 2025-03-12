package ija.ija2020.homework1.store;

import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsItem;
import java.time.LocalDate;

public class StoreGoodsItem implements GoodsItem {
    private Goods g_goods;

    public StoreGoodsItem(Goods goods, LocalDate localDate) {
        g_goods = goods;
    }

    @Override
    public Goods goods() {
        return g_goods;
    }

    @Override
    public boolean sell() {
        return g_goods.remove(this);
    }
}
