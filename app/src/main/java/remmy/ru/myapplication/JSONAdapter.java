package remmy.ru.myapplication;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JSONAdapter extends BaseAdapter implements ListAdapter {

    private final Activity activity;
    private final JSONArray jsonArray;
    protected JSONAdapter(Activity activity, JSONArray jsonArray) {
        assert activity != null;
        assert jsonArray != null;

        this.jsonArray = jsonArray;
        this.activity = activity;
    }


    @Override public int getCount() {
        if(null==jsonArray)
            return 0;
        else
            return jsonArray.length();
    }

    @Override public JSONObject getItem(int position) {
        if(null==jsonArray) return null;
        else
            return jsonArray.optJSONObject(position);
    }

    @Override public long getItemId(int position) {
        JSONObject jsonObject = getItem(position);

        return jsonObject.optLong("id");
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = activity.getLayoutInflater().inflate(R.layout.row, null);



        TextView text =(TextView)convertView.findViewById(R.id.txtAlertText);
        TextView text2 =(TextView)convertView.findViewById(R.id.txtTimeText);

        JSONObject json_data = getItem(position);
        if(null!=json_data ){
            String jj= null;
            String jj2= null;
            try {
                jj = json_data.getString("firstName");
                jj2 = json_data.getString("lastName");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            text.setText(jj);
            text2.setText(jj2);
        }

        return convertView;
    }
}