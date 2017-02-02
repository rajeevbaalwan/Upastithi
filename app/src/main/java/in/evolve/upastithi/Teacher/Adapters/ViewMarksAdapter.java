package in.evolve.upastithi.Teacher.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Teacher.Models.StudentMarksInfo;

/**
 * Created by RAJEEV YADAV on 2/2/2017.
 */
public class ViewMarksAdapter extends RecyclerView.Adapter<ViewMarksAdapter.ViewMarksViewHolder> {
    private Context context;
    private List<StudentMarksInfo> list;
    public ViewMarksAdapter(Context context,List<StudentMarksInfo> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public ViewMarksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewMarksViewHolder(LayoutInflater.from(context).inflate(R.layout.teacher_panel_view_marks_custom_single_row,parent,false),viewType);
    }

    @Override
    public void onBindViewHolder(ViewMarksViewHolder holder, int position) {
        holder.rollNo.setText(list.get(position).getRollNo());
        holder.name.setText(list.get(position).getName());
        holder.sess1Marks.setText(list.get(position).getSess1Marks());
        holder.sess2Marks.setText(list.get(position).getSess2Marks());
        holder.semMarks.setText(list.get(position).getSemMarks());
        holder.totalMarks.setText(Integer.parseInt(list.get(position).getSess1Marks())+Integer.parseInt(list.get(position).getSess2Marks()) +
                Integer.parseInt(list.get(position).getSemMarks())+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected class ViewMarksViewHolder extends RecyclerView.ViewHolder {
        TextView rollNo;
        TextView name;
        TextView sess1Marks;
        TextView sess2Marks;
        TextView semMarks;
        TextView totalMarks;
        public ViewMarksViewHolder(View itemView, int viewType) {
            super(itemView);
            rollNo= (TextView) itemView.findViewById(R.id.teacher_view_marks_student_roll_no);
            name= (TextView) itemView.findViewById(R.id.teacher_view_marks_student_name);
            sess1Marks= (TextView) itemView.findViewById(R.id.teacher_view_marks_sess_1_marks);
            sess2Marks= (TextView) itemView.findViewById(R.id.teacher_view_marks_sess_2_marks);
            semMarks= (TextView) itemView.findViewById(R.id.teacher_view_marks_sem_marks);
            totalMarks= (TextView) itemView.findViewById(R.id.teacher_view_marks_total_marks);
        }
    }
}
