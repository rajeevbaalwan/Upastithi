package in.evolve.upastithi.Student.Fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Student.Adapters.AttendanceAdapter;
import in.evolve.upastithi.Student.Models.StudentAttendanceInformation;

/**
 * Created by RAJEEV YADAV on 10/27/2016.
 */
public class TabAttendance extends Fragment {

    private RecyclerView attendanceRecyclerView;
    private AttendanceAdapter adapter;
    private  String[] subject;
    private String[] attendance;
    public TabAttendance() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_pager_student_attendance,container,false);
        Resources res=getResources();
        subject=res.getStringArray(R.array.subject_name);
        attendance=res.getStringArray(R.array.sem_marks);

        attendanceRecyclerView= (RecyclerView) fragmentView.findViewById(R.id.attendance_recyclerView);
        adapter=new AttendanceAdapter(getActivity(),getData());
        attendanceRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        attendanceRecyclerView.setAdapter(adapter);
        return fragmentView;
    }

    private List<StudentAttendanceInformation> getData() {
        ArrayList<StudentAttendanceInformation> data=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            data.add(new StudentAttendanceInformation(subject[i],attendance[i]));
        }
        return data;
    }
}
