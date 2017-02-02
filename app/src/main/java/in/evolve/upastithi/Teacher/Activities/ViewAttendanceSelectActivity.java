package in.evolve.upastithi.Teacher.Activities;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class ViewAttendanceSelectActivity extends AppCompatActivity {

    private Spinner courseSpinner;
    private Spinner departmentSpinner;
    private Spinner yearSpinner;
    private Spinner subjectSpinner;
    private Button viewAttendanceButton;
    private String[] course;
    private String[] department;
    private String[] year;
    private String[] subject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_view_attendance);

        courseSpinner= (Spinner) findViewById(R.id.teacher_select_course_spinner);
        departmentSpinner= (Spinner) findViewById(R.id.teacher_select_department_spinner);
        yearSpinner= (Spinner) findViewById(R.id.teacher_select_year_spinner);
        subjectSpinner= (Spinner) findViewById(R.id.teacher_select_subject_spinner);
        viewAttendanceButton= (Button) findViewById(R.id.view_attendance_button);

        Resources resources=getResources();
        course=resources.getStringArray(R.array.courses);
        department=resources.getStringArray(R.array.department);
        year=resources.getStringArray(R.array.course_year);
        subject=resources.getStringArray(R.array.subject_name);

        List<String> courseList=new ArrayList<>(Arrays.asList(course));
        List<String> departmentList=new ArrayList<>(Arrays.asList(department));
        List<String> yearList=new ArrayList<>(Arrays.asList(year));
        List<String> subjectList=new ArrayList<>(Arrays.asList(subject));

        ArrayAdapter<String> courseAdapter=new ArrayAdapter<String>(this,
                R.layout.spinner_single_item,courseList){

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

        courseAdapter.setDropDownViewResource(R.layout.spinner_single_item);
        courseSpinner.setAdapter(courseAdapter);

        courseSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ArrayAdapter<String> departmentAdapter=new ArrayAdapter<String>(this,
                R.layout.spinner_single_item,departmentList){

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

        departmentAdapter.setDropDownViewResource(R.layout.spinner_single_item);
        departmentSpinner.setAdapter(departmentAdapter);

        departmentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ArrayAdapter<String> yearAdapter=new ArrayAdapter<String>(this,
                R.layout.spinner_single_item,yearList){

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

        yearAdapter.setDropDownViewResource(R.layout.spinner_single_item);
        yearSpinner.setAdapter(yearAdapter);

        yearSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<String> subjectAdapter=new ArrayAdapter<String>(this,
                R.layout.spinner_single_item,subjectList){

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

        yearAdapter.setDropDownViewResource(R.layout.spinner_single_item);
        subjectSpinner.setAdapter(subjectAdapter);

        yearSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        viewAttendanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ViewAttendanceSelectActivity.this,ViewAttendanceActivity.class);
                startActivity(intent);
            }
        });
    }
}
