package remmy.ru.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TabTasks extends Fragment {


    ListView taskItem;
    JSONAdapter jSONAdapter;

    public TabTasks() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TabTasks newInstance(int sectionNumber) {
        TabTasks fragment = new TabTasks();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tasks, container, false);
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
