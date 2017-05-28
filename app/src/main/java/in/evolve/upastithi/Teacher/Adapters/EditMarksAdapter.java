package in.evolve.upastithi.Teacher.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Teacher.Models.StudentAttendanceInfo;

/**
 * Created by Namit Yadav on 02-02-2017.
 */
public class EditMarksAdapter extends RecyclerView.Adapter<EditMarksAdapter.EditMarksViewHolder>{

    private Context context;
    private List<StudentAttendanceInfo> list;
    private String[] sess1Marks;
    private String[] sess2Marks;
    private String[] semMarks;

    public EditMarksAdapter(Context context, List<StudentAttendanceInfo> list, String[] sess1Marks, String[] sess2Marks, String[] semMarks) {
        this.context = context;
        this.list=list;
        this.sess1Marks=sess1Marks;
        this.sess2Marks=sess2Marks;
        this.semMarks=semMarks;
    }

    @Override
    public EditMarksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new EditMarksViewHolder(LayoutInflater.from(context).inflate(R.layout.teacher_panel_edit_marks_custom_single_row,parent,false));
    }

    @Override
    public void onBindViewHolder(EditMarksViewHolder holder, int position) {
        holder.rollNo.setText(list.get(position).getRollNo());
        holder.name.setText(list.get(position).getName());
        holder.sess1Marks.setHint(sess1Marks[position]);
        holder.sess2Marks.setHint(sess2Marks[position]);
        holder.semMarks.setHint(semMarks[position]);
        holder.totalMarks.setHint((Integer.parseInt(sess1Marks[position])+Integer.parseInt(sess2Marks[position])
                                                                 +Integer.parseInt(semMarks[position]))+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected class EditMarksViewHolder extends RecyclerView.ViewHolder {
        TextView rollNo;
        TextView name;
        EditText sess1Marks;
        EditText sess2Marks;
        EditText semMarks;
        EditText totalMarks;
        public EditMarksViewHolder(View itemView) {
            super(itemView);
            rollNo= (TextView) itemView.findViewById(R.id.teacher_view_marks_student_roll_no);
            name= (TextView) itemView.findViewById(R.id.teacher_view_marks_student_name);
            sess1Marks= (EditText) itemView.findViewById(R.id.teacher_edit_marks_sess_1_marks);
            sess2Marks= (EditText) itemView.findViewById(R.id.teacher_edit_marks_sess_2_marks);
            semMarks= (EditText) itemView.findViewById(R.id.teacher_edit_marks_sem_marks);
            totalMarks= (EditText) itemView.findViewById(R.id.teacher_edit_marks_total_marks);
        }
    }

}
