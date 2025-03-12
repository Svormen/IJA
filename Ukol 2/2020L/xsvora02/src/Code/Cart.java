package Code;


import java.util.HashMap;
import java.util.Scanner;

/**
 * Class Cart for storing cart goods
 * @author Jozef Čásar
 * @author Slavomír Svorada
 */
public class Cart {
    /**
     * cartList contains numbers of carts and goods for them
     */
    public HashMap<Integer, String> cartList = new HashMap<>();
    private int i = 0;
    public void addToCart(String item) {
        cartList.put(i, item);
        i++;
    }

    /*public void cart(Goods itemList){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] list = new String[5];
        int i = 0;
        Integer j = 1;
        /** Getting the goods for cart to enter the dot */
    /*    while (!s.equals(".")) {
            /** If numbers of goods is 5 then insert goods into cartList and create new cart*/
    /*        if (i == 5) {
                cartList.put(j, list);
                itemList.getGoods(list);
                i = 0;
                j++;
            }
            /** Store goods into list */
    /*        list[i] = s;
            s = in.nextLine();
            i++;
        }
        /** Inserting goods to cartList */
    /*    if(i != 0) {
            cartList.put(j, list);
            itemList.getGoods(list);
            for(String x:cartList.get(j)){
                System.out.println(x);
            }
        }
    }*/
}
