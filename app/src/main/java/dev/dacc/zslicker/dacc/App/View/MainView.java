package dev.dacc.zslicker.dacc.App.View;

import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;

import dev.dacc.zslicker.dacc.R;

public class MainView {

    DAcc actionObject;
  //  ListView list;
    public MainView(DAcc object) {
        this.actionObject = object;
      //  list = this.actionObject.list;
    }

    public void setList(int current_income, int current_outlay_month) {
/*
        String ITEM_LIST = "item";
        String SUB_ITEM = "sub_item";

        HashMap<String, Object> hashmap = new HashMap<String, Object>(); // создаем объект
        ArrayList<HashMap<String, Object>> myList = new ArrayList<HashMap<String, Object>>();

        hashmap.put(ITEM_LIST, "Баланс"); // добавляем значение
        hashmap.put(SUB_ITEM, current_income);
        myList.add(hashmap); // добавляем объект в список

        hashmap = new HashMap<String, Object>(); // создаем объект
        hashmap.put(ITEM_LIST, "Потрачено за месяц"); // добавляем значение
        hashmap.put(SUB_ITEM, current_outlay_month);
        myList.add(hashmap); // добавляем объект в список

        SimpleAdapter adapter = new SimpleAdapter(actionObject.getApplicationContext(), myList,
                R.layout.my_list, new String[]{ITEM_LIST, SUB_ITEM},
                new int[]{R.id.item, R.id.sub_item});
        list.setAdapter(adapter);*/
    }
}
