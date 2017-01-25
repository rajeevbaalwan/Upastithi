package in.evolve.upastithi.Student.Adapters;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import in.evolve.upastithi.Student.Models.Student_marks_information;

/**
 * Created by RAJEEV YADAV on 1/25/2017.
 */
public class AttendanceAdapter extends RecyclerView.Adapter {
    public AttendanceAdapter(FragmentActivity activity, List<Student_marks_information> data) {
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
