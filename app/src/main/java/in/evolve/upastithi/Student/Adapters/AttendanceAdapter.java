package in.evolve.upastithi.Student.Adapters;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Student.Models.StudentAttendanceInformation;
import in.evolve.upastithi.Student.Models.StudentMarksInformation;

/**
 * Created by RAJEEV YADAV on 1/25/2017.
 */
public class AttendanceAdapter extends RecyclerView.Adapter<AttendanceAdapter.AttendanceViewHolder> {
    private List<StudentAttendanceInformation> list;
    private FragmentActivity activity;
    public AttendanceAdapter(FragmentActivity activity,List<StudentAttendanceInformation> list) {

        this.activity = activity;
        this.list = list;
    }

    @Override
    public AttendanceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AttendanceViewHolder(LayoutInflater.from(activity).inflate(R.layout.student_panel_attendance_custom_single_item,parent,false),viewType);
    }

    @Override
    public void onBindViewHolder(AttendanceViewHolder holder, int position) {
        holder.subject.setText(list.get(position).getSubject());
        holder.attendance.setText(list.get(position).getAttendance());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class AttendanceViewHolder extends RecyclerView.ViewHolder{

        TextView subject;
        TextView attendance;

        public AttendanceViewHolder(View itemView, int viewType) {
            super(itemView);

            subject= (TextView) itemView.findViewById(R.id.attendance_subject_student);
            attendance= (TextView) itemView.findViewById(R.id.attendance_student);
        }
    }
}
