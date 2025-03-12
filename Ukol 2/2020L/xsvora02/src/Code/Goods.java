package Code;

import java.util.HashMap;

/**
 * Class Goods for storing the actual store goods
 * @author Jozef Čásar
 * @author Slavomír Svorada
 */
public class Goods{
    /**
     * goodsList containing all store goods
     */
    public HashMap<String, Integer> goodsList = new HashMap<>();

    /**
     * Function for putting new good or increment the count of good in the store
     * @param name the name of the goods
     * @param count the number of the goods to be stored
     */
    public void putGoods(String name, Integer count){
        /**Store can contain max 60 different goods */
        if (goodsList.size() > 60) {
            System.out.println("Sklad je plny");
            return;
        }
        if (goodsList.containsKey(name)) {
            /**Maximum count of good can be 20*/
            if (goodsList.get(name) > 20) {
                System.out.println("Pre dany druh tovaru nie je miesto");
                return;
            }
            goodsList.put(name, goodsList.get(name) + count);
        }
        //putting new good
        else
        {
            goodsList.put(name, count);
        }
          //System.out.println("Tovar: "+ name + " pocet kusov " + goodsList.get(name));
    }

    /**
     * Function for removing goods from store
     * @param list the list containing goods to be shipped from the store
     */
    public void getGoods(String[] list){
        try {
            for (int i = 0; i < list.length; i++) {
                if ((goodsList.containsKey(list[i])) && (goodsList.get(list[i]) > 0)) {
                    goodsList.put(list[i], goodsList.get(list[i]) - 1);
                    //System.out.println("Tovar: " + list[i] + " pocet kusov " + goodsList.get(list[i]));
                } else if (!list[i].equals("")) {
                    System.out.println("Tovar " + list[i] + " sa nenachadza na sklade");
                }
            }
        }
        catch (NullPointerException e) {
        }
    }

    /**
     * Function for removing one good from store
     * @param item the item representing one good
     */
    public void getGoodsItem(String item){
        if ((goodsList.containsKey(item)) && (goodsList.get(item) > 0)) {
            goodsList.put(item, goodsList.get(item) - 1);
        }
        else
            System.out.println("Tovar " + item + " je vypredany");

    }
}

