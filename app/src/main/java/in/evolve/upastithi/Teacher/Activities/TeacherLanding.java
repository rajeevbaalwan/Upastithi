package in.evolve.upastithi.Teacher.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import in.evolve.upastithi.R;

public class TeacherLanding extends AppCompatActivity {
    private Button attendance;
    private Button viewAttendance;
    private Button editAttendance;
    private Button marks;
    private Button viewMarks;
    private Button editMarks;
    private LinearLayout attendanceViewEdit;
    private LinearLayout marksViewEdit;
    private int attendanceClicked;
    private int marksClicked;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_landing);
        attendance= (Button) findViewById(R.id.attendance_button);
        viewAttendance= (Button) findViewById(R.id.view_attendance);
        editAttendance= (Button) findViewById(R.id.edit_attendance);

        attendanceViewEdit= (LinearLayout) findViewById(R.id.attendance_view_edit_button_layout);
        marksViewEdit= (LinearLayout) findViewById(R.id.marks_view_edit_button_layout);

        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation= AnimationUtils.loadAnimation(TeacherLanding.this,R.anim.vanish);
                attendance.startAnimation(animation);
                attendance.setVisibility(View.GONE);
                attendanceClicked=1;

                if(marksClicked==1)
                {
                    animation=AnimationUtils.loadAnimation(TeacherLanding.this,R.anim.glow);
                    marks.startAnimation(animation);
                    marks.setVisibility(View.VISIBLE);
                    marksViewEdit.setVisibility(View.GONE);
                }
                else marksClicked=0;

                animation=AnimationUtils.loadAnimation(TeacherLanding.this,R.anim.left_to_right_slide);
                attendanceViewEdit.startAnimation(animation);
                attendanceViewEdit.setVisibility(View.VISIBLE);

            }
        });

        marks= (Button) findViewById(R.id.marks_button);
        viewMarks= (Button) findViewById(R.id.view_marks);
        editMarks= (Button) findViewById(R.id.edit_marks);

        marks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation=AnimationUtils.loadAnimation(TeacherLanding.this,R.anim.vanish);
                marks.startAnimation(animation);
                marks.setVisibility(View.GONE);
                marksClicked=1;

                if(attendanceClicked==1)
                {
                    animation=AnimationUtils.loadAnimation(TeacherLanding.this,R.anim.glow);
                    attendance.startAnimation(animation);
                    attendance.setVisibility(View.VISIBLE);
                    attendanceViewEdit.setVisibility(View.GONE);
                }
                else attendanceClicked=0;
                animation =AnimationUtils.loadAnimation(TeacherLanding.this,R.anim.right_to_left_slide);
                marksViewEdit.startAnimation(animation);
                marksViewEdit.setVisibility(View.VISIBLE);

            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }
}
