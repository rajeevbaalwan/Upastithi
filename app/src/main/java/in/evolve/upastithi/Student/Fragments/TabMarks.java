package in.evolve.upastithi.Student.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Student.Adapters.AttendanceAdapter;
import in.evolve.upastithi.Student.Models.Student_marks_information;

/**
 * Created by RAJEEV YADAV on 10/27/2016.
 */
public class TabMarks extends Fragment{

    private RecyclerView marksRecyclerView;
    private AttendanceAdapter adapter;
    private List<Student_marks_information> data;

    public TabMarks() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_pager_student_marks, container, false);

        marksRecyclerView = (RecyclerView) fragmentView.findViewById(R.id.student_marks_recycler_view);
        adapter = new AttendanceAdapter(getActivity(), getData());
        marksRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        marksRecyclerView.setAdapter(adapter);
        return fragmentView;
    }


    public List<Student_marks_information> getData() {

        return data;
    }
}
