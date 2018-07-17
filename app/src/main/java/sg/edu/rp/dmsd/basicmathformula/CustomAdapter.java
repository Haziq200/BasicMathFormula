package sg.edu.rp.dmsd.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17010603 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<MathFormula> mathFormulas;

    public CustomAdapter(@NonNull Context context, int resource,  @NonNull ArrayList objects) {
        super(context, resource,  objects);
        parent_context = context;
        layout_id = resource;
        mathFormulas = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvArea = rowView.findViewById(R.id.textViewArea);
        TextView tvFormula = rowView.findViewById(R.id.textViewFormula);
        TextView tvType = rowView.findViewById(R.id.textViewType);
        MathFormula currentFormula = mathFormulas.get(position);
        String name = currentFormula.getName();
        String formula = currentFormula.getFormula();
        String type = currentFormula.getType();
        tvArea.setText(name);
        tvFormula.setText(formula);
        tvType.setText(type);
        return rowView;
    }
}
