package com.example.hasansafwanhajjar.thedateforhasan;

import android.app.DialogFragment;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

/**
 * Created by Hasan Safwan Hajjar on 05/02/2018.
 */

public class popActivity extends DialogFragment implements View.OnClickListener {
    View view ;
    DatePicker datePicker;
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container,Bundle saveInstanceState){
        view=inflater.inflate(layout.pop_activity,container,false);
        Button btnDone=(Button) view.findViewById(R.id.btn_done);
        datePicker =(DatePicker) View.findViewById(R.id.datePicker);
        btnDone.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v){
        this.dismiss();
        String myTime =datePicker.getYear()+"-"+datePicker.getMonth()+"-"+datePicker.getDayOfMonth();
        MainActivity ma =(MainActivity) getActivity();
        ma.SetDate(myTime);
    }

}
