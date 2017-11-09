package firebase.android.myinfo.baadjief;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CatFragment extends Fragment {

   // CataAdapter cataAdapter;
    Context context  ;//= getContext();

    public static CatFragment newInstance() {
        CatFragment fragment = new CatFragment();
        return fragment;
    }
    public CatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_cat, container, false);
context = getContext();
        GridView gridView;
        gridView = (GridView) view.findViewById(R.id.grid);
                   // ListView listView= (ListView) view.findViewById(R.id.grid);
                    final ArrayList<CatalogJava> catalogJavas = new ArrayList<>();

                  catalogJavas.add(new CatalogJava("R30 = 30 medium,   R35 =30 large ", "Eggs", R.drawable.pb12));
                   catalogJavas.add(new CatalogJava("R250 =50kg", "Feed bag", R.drawable.feeds));
                    catalogJavas.add(new CatalogJava("Two weeks old broilers 100 =R650", "Broiler", R.drawable.chic));
                   catalogJavas.add(new CatalogJava("R40 =1", "Broiler", R.drawable.bb));
                    //     catalogJavas.add(new CatalogJava("R250 =50kg","Feed bag",R.drawable.feeds));
                   catalogJavas.add(new CatalogJava("Two weeks old broilers 100 =R650","Broiler",R.drawable.chic));
                    catalogJavas.add(new CatalogJava("R250 =50kg", "Feed bag",R.drawable.feeds));

                  CataAdapter cataAdapter = new CataAdapter(context,catalogJavas);
                   gridView.setAdapter(cataAdapter);

        return view;
    }

}
