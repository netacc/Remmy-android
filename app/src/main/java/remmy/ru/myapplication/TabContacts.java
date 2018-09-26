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

public class TabContacts extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */

    ListView lstTest;
    //Array Adapter that will hold our ArrayList and display the items on the ListView
    JSONAdapter jSONAdapter ;
    private static final String ARG_SECTION_NUMBER = "section_number";

    public TabContacts() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TabContacts newInstance(int sectionNumber) {
        TabContacts fragment = new TabContacts();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.cardview_activity, container, false);


//        JSONObject jo = new JSONObject();
//        try {
//            jo.put("firstName", "John");
//            jo.put("lastName", "Doe");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        JSONObject jo2 = new JSONObject();
//        try {
//            jo2.put("firstName", "Smith");
//            jo2.put("lastName", "John");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//
//
//        JSONArray jArray = new JSONArray();
//        jArray.put(jo);
//        jArray.put(jo2);
//
//        jSONAdapter = new JSONAdapter (getActivity(), jArray);//jArray is your json array
//
//        //Set the above adapter as the adapter of choice for our list
//        lstTest.setAdapter(jSONAdapter );


        return rootView;
    }
}