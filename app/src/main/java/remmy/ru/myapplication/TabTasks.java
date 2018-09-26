package remmy.ru.myapplication;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class TabTasks extends ListFragment {

    final String[] catNamesArray = new String[] { "Рыжик", "Барсик", "Мурзик",
            "Мурка", "Васька", "Томасина", "Бобик", "Кристина", "Пушок",
            "Дымка", "Кузя", "Китти", "Барбос", "Масяня", "Симба" };
    private ArrayAdapter<String> mAdapter;
//    private ArrayList<String> catNamesList = new ArrayList<>(Arrays.asList(catNamesArray));
//    ListView taskItem;
//    JSONAdapter jSONAdapter;

    public TabTasks() {
    }



    private static final String ARG_SECTION_NUMBER = "section_number";
    public static TabTasks newInstance(int sectionNumber) {
        TabTasks fragment = new TabTasks();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tasks, container, false);

        mAdapter = new ArrayAdapter<>(this.getContext(), android.R.layout.simple_list_item_1, catNamesArray);
        setListAdapter(mAdapter);
//        getListView().setOnItemLongClickListener((AdapterView.OnItemLongClickListener) this);
//        taskItem = (ListView) rootView.findViewById(R.id.taskItem);
//
//        JSONObject jo = new JSONObject();
//        try {
//            jo.put("firstName", "Dell");
//            jo.put("lastName", "Blue");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        JSONObject jo2 = new JSONObject();
//        try {
//            jo2.put("firstName", "MSI");
//            jo2.put("lastName", "Red");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//
//        JSONArray jArray = new JSONArray();
//        jArray.put(jo);
//        jArray.put(jo2);
//
//        jSONAdapter = new JSONAdapter(getActivity(), jArray);//jArray is your json array
//
//        //Set the above adapter as the adapter of choice for our list
//        taskItem.setAdapter(jSONAdapter);


        return rootView;
    }
}
