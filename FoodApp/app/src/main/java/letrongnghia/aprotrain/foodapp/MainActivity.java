package letrongnghia.aprotrain.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import letrongnghia.aprotrain.foodapp.database.Food;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<Food> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view1);
        dataList.add(new Food(R.drawable.ham1, "Hamberger", "ngon", 120000));
        dataList.add(new Food(R.drawable.coffee1, "Coffee", "ngon", 100000));

    }


}