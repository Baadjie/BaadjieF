package firebase.android.myinfo.baadjief;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    Context context;

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }
    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        context=getContext();

        View view=inflater.inflate(R.layout.fragment_home, container, false);
        ImageView contact,gallery,about,location;
        contact= (ImageView) view.findViewById(R.id.imageView7);
        gallery= (ImageView) view.findViewById(R.id.imageView6);
        about= (ImageView) view.findViewById(R.id.imageView4);

        location= (ImageView) view.findViewById(R.id.imageView5);

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.za/maps/dir/-26.0239321,28.1849765/Muswane/@-24.6164951,28.3013332,8z/data=!3m1!4b1!4m9!4m8!1m0!1m5!1m1!1s0x1ec44cb40bc2ef45:0x68f6146a5a76a45!2m2!1d30.6286186!2d-23.1500041!3e0"));
                startActivity(intent2);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.soccerladuma.co.za/"));
                startActivity(intent1);
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Main3Activity.class);
                startActivity(intent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Main2Activity.class);
                startActivity(intent);
            }
        });

        return view;

    }

}
