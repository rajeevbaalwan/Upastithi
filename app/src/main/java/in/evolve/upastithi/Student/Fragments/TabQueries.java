package in.evolve.upastithi.Student.Fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Student.Activities.StudentChatActivity;

/**
 * Created by RAJEEV YADAV on 10/27/2016.
 */
public class TabQueries extends Fragment {

    private Button queryButton;
    public TabQueries() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_pager_student_queires,container,false);
        Spinner spinner= (Spinner) fragmentView.findViewById(R.id.student_query_teacher_select_spinner);
        queryButton= (Button) fragmentView.findViewById(R.id.make_query_button);
        Resources resources=getResources();

        String[] teacher=resources.getStringArray(R.array.teacher_names);
        List<String> list=new ArrayList<>(Arrays.asList(teacher));

        ArrayAdapter<String> spinnerArrayAdapter=new ArrayAdapter<String>(getActivity(),
                                        R.layout.spinner_single_item,list){

            @Override
            public boolean isEnabled(int position) {
                if(position==0)
                    return false;
                else
                    return  true;
            }

            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent) {
                View view= super.getDropDownView(position, convertView, parent);
                TextView textView= (TextView) view;

                if(position%2==1)
                    textView.setBackgroundColor(Color.parseColor("#ffffff"));
                else textView.setBackgroundColor(Color.parseColor("#eceff7"));
                return view;
            }
        };

        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner_single_item);
        spinner.setAdapter(spinnerArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        queryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),StudentChatActivity.class);
                startActivity(intent);
            }
        });
        return fragmentView;
    }
}
