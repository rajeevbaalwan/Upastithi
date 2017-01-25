package in.evolve.upastithi.Student.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.evolve.upastithi.R;

/**
 * Created by RAJEEV YADAV on 10/27/2016.
 */
public class TabAssignments extends Fragment {

    public TabAssignments() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_pager_student_assignment,container,false);
        return fragmentView;
    }
}
