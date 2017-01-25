package in.evolve.upastithi.Student.Adapters;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import in.evolve.upastithi.Student.Models.Student_marks_information;

/**
 * Created by RAJEEV YADAV on 1/25/2017.
 */
public class MarksAdapter extends RecyclerView.Adapter<MarksAdapter.MarksViewHolder>{

    private List<Student_marks_information> list;
    private FragmentActivity activity;
    public MarksAdapter(FragmentActivity activity, List<Student_marks_information> list)
    {
        this.activity=activity;
        this.list=list;
    }
    @Override
    public MarksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MarksViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class MarksViewHolder extends RecyclerView.ViewHolder{

        public MarksViewHolder(View itemView) {
            super(itemView);
        }
    }
}
