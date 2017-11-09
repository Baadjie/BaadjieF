package firebase.android.myinfo.baadjief;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    FrameLayout frameLayout;
    LayoutInflater inflater;
    CataAdapter cataAdapter;
    GridView gridView;


    Context context;
    View view;

//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
//
//
//                case R.id.navigation_dashboard:
//
//                    inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                    view = inflater.inflate(R.layout.activity_catalog, null);
//                    frameLayout.removeAllViews();
//
//                    gridView = (GridView) view.findViewById(R.id.grid);
//                    // ListView listView= (ListView) view.findViewById(R.id.grid);
//                    final ArrayList<CatalogJava> catalogJavas = new ArrayList<>();
//
//                    catalogJavas.add(new CatalogJava("R30 = 30 medium,   R35 =30 large ", "Eggs", R.drawable.pb12));
//                    catalogJavas.add(new CatalogJava("R250 =50kg", "Feed bag", R.drawable.feeds));
//                    catalogJavas.add(new CatalogJava("Two weeks old broilers 100 =R650", "Broiler", R.drawable.chic));
//                    catalogJavas.add(new CatalogJava("R40 =1", "Broiler", R.drawable.bb));
//                    //     catalogJavas.add(new CatalogJava("R250 =50kg","Feed bag",R.drawable.feeds));
////                    catalogJavas.add(new CatalogJava("pastor","baloyi",R.drawable.wd));
////                    catalogJavas.add(new CatalogJava("pastor","baloyi",R.drawable.wd));
//                    cataAdapter = new CataAdapter(MainActivity.this, catalogJavas);
//                    gridView.setAdapter(cataAdapter);
//
//                    gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                        @Override
//                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                            CatalogJava catalogJava = catalogJavas.get(position);
//                            Toast.makeText(MainActivity.this, " you must login and make order ", Toast.LENGTH_SHORT).show();
//                            Intent intent = new Intent(MainActivity.this, Sign_in.class);
//                            startActivity(intent);
//                        }
//                    });
//
//
//                    frameLayout.removeAllViews();
//                    frameLayout.addView(view);
//                    return true;
//
//
//
//                case R.id.navigation_notifications:
//
//                    inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                    view = inflater.inflate(R.layout.activity_main3,null);
//
//                    Button btnLog = (Button) view.findViewById(R.id.btn_login);
//                    Intent inte=new Intent(MainActivity.this,Main3Activity.class);
//                    startActivity(inte);
//
////                    btnLog.setOnClickListener(new View.OnClickListener() {
////                        @Override
////                        public void onClick(View v) {
////                            Intent intent=new Intent(MainActivity.this,Main3Activity.class);
////                            startActivity(intent);
////                        }
////                    });
//
//
//                    frameLayout.addView(view);
//
//                    frameLayout.removeAllViews();
//
//                    return true;
//
//            }
//
//
//            return false;
//        }
//
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = (FrameLayout) findViewById(R.id.content);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        frameLayout.removeAllViews();
                        fragment = HomeFragment.newInstance();
                        frameLayout.removeAllViews();
                        break;
                    case R.id.navigation_dashboard:

                        fragment=CatFragment.newInstance();
                        frameLayout.removeAllViews();
                        break;
                    case R.id.navigation_notifications:
                        frameLayout.removeAllViews();
                        fragment = BlankFragment.newInstance();
                        break;

                }

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.content, fragment);
                transaction.commit();
                return true;
            }
        });

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content, HomeFragment.newInstance());
       // transaction.replace(R.id.content,CatFragment.newInstance());
        transaction.commit();






    }



}
