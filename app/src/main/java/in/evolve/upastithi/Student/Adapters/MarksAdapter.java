package in.evolve.upastithi.Student.Adapters;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Student.Models.StudentMarksInformation;

/**
 * Created by RAJEEV YADAV on 1/25/2017.
 */
public class MarksAdapter extends RecyclerView.Adapter<MarksAdapter.MarksViewHolder>{

    private List<StudentMarksInformation> list;
    private FragmentActivity activity;
    public MarksAdapter(FragmentActivity activity, List<StudentMarksInformation> list)
    {
        this.activity=activity;
        this.list=list;
    }
    @Override
    public MarksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MarksViewHolder(LayoutInflater.from(activity).inflate(R.layout.student_panel_marks_custom_single_row,parent,false),viewType);
    }

    @Override
    public void onBindViewHolder(MarksViewHolder holder, int position) {
        holder.subject.setText(list.get(position).getSubject());
        holder.sess1Marks.setText(list.get(position).getSess1());
        holder.sess2Marks.setText(list.get(position).getSess2());
        holder.semMarks.setText(list.get(position).getSemMarks());
        holder.totalMarks.setText(Integer.parseInt(list.get(position).getSess1())+Integer.parseInt(list.get(position).getSess2())
                          +Integer.parseInt(list.get(position).getSemMarks())+"");
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MarksViewHolder extends RecyclerView.ViewHolder{

        TextView sess1Marks;
        TextView sess2Marks;
        TextView subject;
        TextView semMarks;
        TextView totalMarks;
        public MarksViewHolder(View itemView, int viewType) {
            super(itemView);

            subject= (TextView) itemView.findViewById(R.id.marks_subject_student);
            sess1Marks= (TextView) itemView.findViewById(R.id.ses1_student);
            sess2Marks= (TextView) itemView.findViewById(R.id.ses2_student);
            semMarks= (TextView) itemView.findViewById(R.id.sem_student);
            totalMarks= (TextView) itemView.findViewById(R.id.total_student);
        }
    }
}
