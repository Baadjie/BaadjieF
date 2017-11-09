package firebase.android.myinfo.baadjief;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Baadjie on 2017/09/29.
 */

public class CataAdapter extends ArrayAdapter<CatalogJava> {



    public CataAdapter(Context context, ArrayList<CatalogJava> catalogJavas) {
        super(context, 0, catalogJavas);


    }




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        CatalogJava catalogJava=getItem(position);

        View view=convertView;

        if(view==null){


            view= LayoutInflater.from(getContext()).inflate(R.layout.cat_layout,parent,false);

            TextView txtName,txtPrice;
            ImageView imageView;

            txtName= (TextView) view.findViewById(R.id.textView);
            txtName.setText(catalogJava.getName());

            txtPrice= (TextView) view.findViewById(R.id.textView2);
            txtPrice.setText(catalogJava.getPrice());

            imageView= (ImageView) view.findViewById(R.id.imageView);

            imageView.setImageResource(catalogJava.getImage());
        }
        return view;


    }
}
