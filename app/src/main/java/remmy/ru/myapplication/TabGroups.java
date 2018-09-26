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

public class TabGroups extends Fragment {

    ListView groupItem;
    JSONAdapter jSONAdapter ;
    public TabGroups() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TabGroups newInstance(int sectionNumber) {
        TabGroups fragment = new TabGroups();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.groups, container, false);
        groupItem= (ListView) rootView.findViewById(R.id.groupItem);

        JSONObject jo = new JSONObject();
        try {
            jo.put("firstName", "Jack");
            jo.put("lastName", "Snow");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JSONObject jo2 = new JSONObject();
        try {
            jo2.put("firstName", "Smith");
            jo2.put("lastName", "Vesson");
        } catch (JSONException e) {
            e.printStackTrace();
        }



        JSONArray jArray = new JSONArray();
        jArray.put(jo);
        jArray.put(jo2);

        jSONAdapter = new JSONAdapter (this.getActivity(), jArray);//jArray is your json array

        //Set the above adapter as the adapter of choice for our list
        groupItem.setAdapter(jSONAdapter );


        return rootView;
    }
}
