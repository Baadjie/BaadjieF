package firebase.android.myinfo.baadjief;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {



    private DatabaseReference databaseReference;
    private Products products;
    Button button;
    EditText edtCellno,edtName,edtCardNo,edtEmail;
    private CheckBox checkEggs,checkFeeds,checkBroi,checkTwo;
    double EGGS=30;
    double FEEDS=250;
    double amount=0;
    double BROILER=40;
    double YOUNG =650;
    int qauntity=0;
    private EditText qauntity1,qauntity2,qauntity3,qauntity4;

    double total=0;
    Context context;
    public static String answerTotal;

    public static BlankFragment newInstance() {
        BlankFragment fragment = new BlankFragment();
        return fragment;
    }
    public BlankFragment() {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);


        Calendar c=Calendar.getInstance();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        final String formatedDate=df.format(c.getTime());

        final TextView txtText= (TextView) view.findViewById(R.id.textView7);
        //TextView txtText=new TextView(this);
        txtText.setText("      " + formatedDate);

        products=new Products();
        context=getContext();

        button= (Button) view.findViewById(R.id.order);
        edtCellno= (EditText) view.findViewById(R.id.editText6);
        edtName= (EditText) view.findViewById(R.id.editText8);
        edtCardNo= (EditText) view.findViewById(R.id.editText7);
        edtEmail= (EditText) view.findViewById(R.id.editText4);
        checkEggs= (CheckBox) view.findViewById(R.id.checkBox);
        checkFeeds= (CheckBox) view.findViewById(R.id.checkBox2);
        checkBroi=(CheckBox) view.findViewById(R.id.checkBox3);
        checkTwo=(CheckBox) view.findViewById(R.id.checkBox4);
        qauntity1 = (EditText) view.findViewById(R.id.editText);
        qauntity2 = (EditText) view.findViewById(R.id.editText2);
        qauntity3 = (EditText) view.findViewById(R.id.editText3);
        qauntity4 = (EditText) view.findViewById(R.id.editText5);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                total=amount;

                //answerTotal=String.valueOf(total);
                databaseReference= FirebaseDatabase.getInstance().getReference();
                products.setCellno(edtCellno.getText().toString());
                products.setCustName(edtName.getText().toString());
                products.setCardNo(edtCardNo.getText().toString());
                products.setEmail(edtEmail.getText().toString());
                products.setTime(txtText.getText().toString());
                products.setTotal(total);
                databaseReference.child("Products").push().setValue(products);




                Toast.makeText(context, "thank you for making an order you will receive an email "+total, Toast.LENGTH_SHORT).show();


            }
        });
        checkTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkTwo.isChecked()){
                    amount=amount+YOUNG;
                    qauntity=Integer.parseInt(qauntity4.getText().toString());
                    amount=amount*qauntity;
                    Toast.makeText(context, " "   + "checked" +  "  R "+amount, Toast.LENGTH_SHORT).show();
                }
                else if(checkTwo.isChecked()==false){

                    amount=amount-amount;

                    Toast.makeText(context, " "+ "uncheked " +    "  "+amount, Toast.LENGTH_SHORT).show();

                }
            }
        });
        checkBroi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBroi.isChecked()){
                    amount=amount+BROILER;
                    qauntity=Integer.parseInt(qauntity3.getText().toString());
                    amount=amount*qauntity;
                    Toast.makeText(context, " "   + "checked" +  "  R "+amount, Toast.LENGTH_SHORT).show();
                }
                else if(checkBroi.isChecked()==false){

                    amount=amount-amount;

                    Toast.makeText(context, " "+ "uncheked " +    "  "+amount, Toast.LENGTH_SHORT).show();

                }
            }
        });

        checkFeeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkFeeds.isChecked()){
                    amount=amount+FEEDS;
                    qauntity=Integer.parseInt(qauntity2.getText().toString());
                    amount=amount*qauntity;
                    Toast.makeText(context, " "   + "checked" +  "  R "+amount, Toast.LENGTH_SHORT).show();
                }
                else if(checkFeeds.isChecked()==false){

                    amount=amount-amount;

                    Toast.makeText(context, " "+ "uncheked " +    "  "+amount, Toast.LENGTH_SHORT).show();

                }
            }
        });
        checkEggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkEggs.isChecked()){
                    amount=amount+EGGS;
                    qauntity=Integer.parseInt(qauntity1.getText().toString());
                    amount=amount*qauntity;
                    Toast.makeText(context, " "   + "checked" +  "  R "+amount, Toast.LENGTH_SHORT).show();
                }
                else if(checkEggs.isChecked()==false){

                    amount=amount-amount;

                    Toast.makeText(context, " "+ "uncheked " +    "  "+amount, Toast.LENGTH_SHORT).show();

                }
            }
        });

        return view;
    }



}
