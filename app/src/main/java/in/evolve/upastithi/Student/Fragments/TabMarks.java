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
import in.evolve.upastithi.Student.Adapters.MarksAdapter;
import in.evolve.upastithi.Student.Models.StudentMarksInformation;

/**
 * Created by RAJEEV YADAV on 10/27/2016.
 */
public class TabMarks extends Fragment{

    private RecyclerView marksRecyclerView;
    private MarksAdapter adapter;
    private List<StudentMarksInformation> data;
    private String[] sess1Marks;
    private  String[] sess2Marks;
    private String[] subject;
    private  String[] semMarks;
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

        Resources res=getResources();
        sess1Marks=res.getStringArray(R.array.sess_1_marks);
        sess2Marks=res.getStringArray(R.array.sess_2_marks);
        subject=res.getStringArray(R.array.subject_name);
        semMarks=res.getStringArray(R.array.sem_marks);

        marksRecyclerView = (RecyclerView) fragmentView.findViewById(R.id.student_marks_recycler_view);
        adapter = new MarksAdapter(getActivity(),getData());
        marksRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        marksRecyclerView.setAdapter(adapter);

        return fragmentView;
    }


    public List<StudentMarksInformation> getData() {
        ArrayList<StudentMarksInformation> data=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            data.add(new StudentMarksInformation(subject[i],sess1Marks[i],sess2Marks[i],semMarks[i]));
        }
        return data;
    }
}
