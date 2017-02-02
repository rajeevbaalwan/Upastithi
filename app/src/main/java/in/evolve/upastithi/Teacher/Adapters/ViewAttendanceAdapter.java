package in.evolve.upastithi.Teacher.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Teacher.Models.StudentAttendanceInfo;

/**
 * Created by RAJEEV YADAV on 2/2/2017.
 */
public class ViewAttendanceAdapter extends RecyclerView.Adapter<ViewAttendanceAdapter.AttendanceViewHolder> {

    private List<StudentAttendanceInfo> list;
    private Context context;
    public ViewAttendanceAdapter(Context context,List<StudentAttendanceInfo> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public AttendanceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AttendanceViewHolder(LayoutInflater.from(context).inflate(R.layout.teacher_panel_view_attendance_custom_single_row,parent,false),viewType);
    }

    @Override
    public void onBindViewHolder(AttendanceViewHolder holder, int position) {
       holder.rollNo.setText(list.get(position).getRollNo());
       holder.name.setText(list.get(position).getName());
        holder.attendance.setText(list.get(position).getAttendance());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected class AttendanceViewHolder extends RecyclerView.ViewHolder {
        TextView rollNo;
        TextView name;
        TextView attendance;
        public AttendanceViewHolder(View itemView, int viewType) {
            super(itemView);

            rollNo= (TextView) itemView.findViewById(R.id.teacher_view_attendance_student_roll_no);
            name= (TextView) itemView.findViewById(R.id.teacher_view_attendance_student_name);
            attendance= (TextView) itemView.findViewById(R.id.teacher_view_attendance_value);
        }
    }
}
