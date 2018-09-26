package remmy.ru.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Contact extends ListActivity implements AdapterView.OnItemLongClickListener {

    final String[] catNamesArray = new String[] { "Рыжик", "Барсик", "Мурзик",
            "Мурка", "Васька", "Томасина", "Бобик", "Кристина", "Пушок",
            "Дымка", "Кузя", "Китти", "Барбос", "Масяня", "Симба" };
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.contact);
//        android.app.ActionBar actionBar = getActionBar();
//        actionBar.setTitle("Контакт");

        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, catNamesArray);
        setListAdapter(mAdapter);
        getListView().setOnItemLongClickListener(this);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(this, TaskCreateActivity.class);
        String selectedItem = l.getItemAtPosition(position).toString();
        intent.putExtra("fname", selectedItem);
        startActivity(intent);
    }


    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem = parent.getItemAtPosition(position).toString();


        Toast.makeText(getApplicationContext(),
                "Вы выбрали " + selectedItem, Toast.LENGTH_SHORT).show();

        return true;
    }
}
