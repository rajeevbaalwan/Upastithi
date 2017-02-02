package in.evolve.upastithi.Teacher.Activities;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Student.Adapters.AttendanceAdapter;
import in.evolve.upastithi.Student.Models.StudentAttendanceInformation;
import in.evolve.upastithi.Teacher.Adapters.ViewAttendanceAdapter;
import in.evolve.upastithi.Teacher.Models.StudentAttendanceInfo;

public class ViewAttendanceActivity extends AppCompatActivity {

    private RecyclerView viewAttendanceRecyclerView;
    private ViewAttendanceAdapter attendanceAdapter;
    private String[] studentName;
    private String[] studentRollNo;
    private String[] studentAttendance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_view_attendance);

        viewAttendanceRecyclerView= (RecyclerView) findViewById(R.id.teacher_view_attendance_recycler_view);
        Resources resources=getResources();
        studentName=resources.getStringArray(R.array.student_name);
        studentRollNo=resources.getStringArray(R.array.roll_no);
        studentAttendance=resources.getStringArray(R.array.sess_1_marks);

        attendanceAdapter=new ViewAttendanceAdapter(ViewAttendanceActivity.this,getData());
        viewAttendanceRecyclerView.setLayoutManager(new LinearLayoutManager(ViewAttendanceActivity.this));
        viewAttendanceRecyclerView.setAdapter(attendanceAdapter);
    }

    private List<StudentAttendanceInfo> getData() {
        List<StudentAttendanceInfo> list=new ArrayList<>();

        for(int i=0;i<10;i++)
        {
            list.add(new StudentAttendanceInfo(studentRollNo[i],studentName[i],studentAttendance[i]));
        }
        return list;
    }
}
