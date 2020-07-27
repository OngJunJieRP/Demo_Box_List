package sg.edu.rp.c346.id19032110.demoboxlist;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Box> boxList;

    public CustomAdapter(Context context, int resource, ArrayList<Box> objects) {
        super(context,resource,objects);

        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivColor = rowView.findViewById(R.id.imageViewColor);

        Box currentBox = boxList.get(position);

        if (currentBox.getColor() == "Blue"){
            ivColor.setImageResource(R.drawable.blue_box);
        }
        else if (currentBox.getColor() == "Orange"){
            ivColor.setImageResource(R.drawable.orange_box);
        }
        else if (currentBox.getColor() == "Brown"){
            ivColor.setImageResource(R.drawable.brown_box);
        }
        return rowView;
    }
}
