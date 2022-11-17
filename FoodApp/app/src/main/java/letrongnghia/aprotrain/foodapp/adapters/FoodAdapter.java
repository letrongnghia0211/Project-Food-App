package letrongnghia.aprotrain.foodapp.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import letrongnghia.aprotrain.foodapp.database.Food;

public class FoodAdapter extends BaseAdapter {
    Context context;
    List<Food> dataList;
    public FoodAdapter(Context context, List<Food> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int i) {
        return dataList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
