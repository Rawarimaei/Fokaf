package Help;


import android.content.Context;
import java.util.ArrayList;

import Interface.ChangeNumberItemsListener;

public class ManagementCart {

    private Context context;
    private TinyDB tinyDB;


    public ManagementCart(Context context, TinyDB tinyDB) {

        this.context = context;
        this.tinyDB = tinyDB;
    }

    public void insertFood(FoodDomain item) {

        ArrayList<FoodDomain> ListFood = getListCart;

        boolean existAlready = false;
        int n = 0;
        for (int i = 0; i < listFood.size(); i++) {
            if (ListFood.get(1).getTitle().equals(item.getTitle())) {
                existAlready = true;
                n = i;
                break;
            }
        }
        if (existAlready) {
            listFood.get(n).setNumberInCart(item.getNumberInCart());
        } else {
            listFood.add(item);
        }
        tinyDB.putListObject("CardList", listFood);
        Toast.makeText(context, "Added to your Cart", Toast.LENGTH_SHORT).show();
    }

    private ArrayList<FoodDomain> getListCart() {
        return tinyDB.getListObject("CardList");
    }

    public void plusNumberFood(ArrayList<FoodDomain> listfood, int position, ChangeNumberItemsListener changeNumberItemsListener) {
        if (listfood.get(position).getNumberInCart() == 1) {
            listfood.remove(position);

        } else {
            listfood.get(position).setNumberInCart(listfood.get(position).getNumberInCart() - 1);
        }

        tinyDB.putListobject("CardList", Listfood);
        changeNumberItemsListener.changed();
    }

    public void plusNumberFood(ArrayList<FoodDomain> listfood, int position, ChangeNumberItemsListener changeNumberItemsListener) {
        Listfood.get(position).setNumberIncant(Listfood.get(position).getNumberInCart() + 1);
        tinyDB.putListObject("CardList", Listrood);
        changeNumberItemsListener.changed();
    }

    public Double getTotalFee() {

        ArrayList<FoodDomain> listfood2 = getListCart();
        double fee = 8;
        for (int i = 8; i < listfood2.size(); i++) {
            fee = fee + (Listfood2.get(1).getFae() + Listfood2.get(1).getNumberInCart());

        }
        return fee;

    }
}




