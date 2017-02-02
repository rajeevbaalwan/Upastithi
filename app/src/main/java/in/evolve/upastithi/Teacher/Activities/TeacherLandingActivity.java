package in.evolve.upastithi.Teacher.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import in.evolve.upastithi.R;

public class TeacherLandingActivity extends AppCompatActivity implements View.OnClickListener {
    private Button attendance;
    private Button viewAttendanceButton;
    private Button editAttendanceButton;
    private Button marksButton;
    private Button viewMarksButton;
    private Button editMarksButton;
    private LinearLayout attendanceViewEditLayout;
    private LinearLayout marksViewEditLayout;
    private int attendanceClicked;
    private int marksClicked;
    private Animation animation;
    private Button studentRequestButton;
    private Button generateReportButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_landing);
        attendance= (Button) findViewById(R.id.attendance_button);
        viewAttendanceButton= (Button) findViewById(R.id.teacher_view_attendance);
        editAttendanceButton= (Button) findViewById(R.id.teacher_edit_attendance);
        studentRequestButton= (Button) findViewById(R.id.student_requests_button);
        generateReportButton= (Button) findViewById(R.id.generate_report);


        attendanceViewEditLayout= (LinearLayout) findViewById(R.id.attendance_view_edit_button_layout);
        marksViewEditLayout= (LinearLayout) findViewById(R.id.marks_view_edit_button_layout);

        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation= AnimationUtils.loadAnimation(TeacherLandingActivity.this,R.anim.vanish);
                attendance.startAnimation(animation);
                attendance.setVisibility(View.GONE);
                attendanceClicked=1;

                if(marksClicked==1)
                {
                    animation=AnimationUtils.loadAnimation(TeacherLandingActivity.this,R.anim.glow);
                    marksButton.startAnimation(animation);
                    marksButton.setVisibility(View.VISIBLE);
                    marksViewEditLayout.setVisibility(View.GONE);
                }
                else marksClicked=0;

                animation=AnimationUtils.loadAnimation(TeacherLandingActivity.this,R.anim.left_to_right_slide);
                attendanceViewEditLayout.startAnimation(animation);
                attendanceViewEditLayout.setVisibility(View.VISIBLE);

            }
        });

        marksButton= (Button) findViewById(R.id.marks_button);
        viewMarksButton= (Button) findViewById(R.id.teacher_view_marks);
        editMarksButton= (Button) findViewById(R.id.teacher_edit_marks);

        marksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation=AnimationUtils.loadAnimation(TeacherLandingActivity.this,R.anim.vanish);
                marksButton.startAnimation(animation);
                marksButton.setVisibility(View.GONE);
                marksClicked=1;

                if(attendanceClicked==1)
                {
                    animation=AnimationUtils.loadAnimation(TeacherLandingActivity.this,R.anim.glow);
                    attendance.startAnimation(animation);
                    attendance.setVisibility(View.VISIBLE);
                    attendanceViewEditLayout.setVisibility(View.GONE);
                }
                else attendanceClicked=0;
                animation =AnimationUtils.loadAnimation(TeacherLandingActivity.this,R.anim.right_to_left_slide);
                marksViewEditLayout.startAnimation(animation);
                marksViewEditLayout.setVisibility(View.VISIBLE);

            }
        });

        viewAttendanceButton.setOnClickListener(this);
        editAttendanceButton.setOnClickListener(this);
        viewMarksButton.setOnClickListener(this);
        editMarksButton.setOnClickListener(this);
        studentRequestButton.setOnClickListener(this);
        generateReportButton.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
     int id=v.getId();
        switch(id){
            case R.id.teacher_edit_attendance:
                Intent intent1= new Intent(TeacherLandingActivity.this,EditAttendanceSelectActivity.class);
                startActivity(intent1);
                break;
            case R.id.teacher_view_attendance:
                Intent intent2 = new Intent(TeacherLandingActivity.this, ViewAttendanceSelectActivity.class);
                startActivity(intent2);
                break;
            case R.id.teacher_view_marks:
                Intent intent3 = new Intent(TeacherLandingActivity.this, ViewMarksSelectActivity.class);
                startActivity(intent3);
                break;
            case R.id.teacher_edit_marks:
                Intent intent4 = new Intent(TeacherLandingActivity.this,EditMarksSelectActivity.class);
                startActivity(intent4);
                break;
            case R.id.generate_report:
                Intent intent5 = new Intent(TeacherLandingActivity.this, GenerateReportActivity.class);
                startActivity(intent5);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                break;
            case R.id.student_requests_button:
                Intent intent6 = new Intent(TeacherLandingActivity.this, StudentRequestActivity.class);
                startActivity(intent6);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                break;
        }
    }
}
