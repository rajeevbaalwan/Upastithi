package in.evolve.upastithi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import in.evolve.upastithi.Student.Activities.StudentLandingActivity;
import in.evolve.upastithi.Student.Activities.StudentLoginActivity;
import in.evolve.upastithi.Teacher.Activities.TeacherLanding;
import in.evolve.upastithi.Teacher.Activities.TeacherLoginActivity;
import in.evolve.upastithi.Utilities.Utils;

public class LandingActivity extends AppCompatActivity {

    private  Button student;
    private Button teacher;
    private Button admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_landing);

        student= (Button) findViewById(R.id.student);
        teacher= (Button) findViewById(R.id.teacher);
        admin= (Button) findViewById(R.id.admin);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent studentLogin = new Intent(LandingActivity.this, StudentLoginActivity.class);
                startActivity(studentLogin);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }
        });

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LandingActivity.this, TeacherLoginActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }
        });


        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onStop() {
        super.onStop();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    @Override
    protected void onStart() {
        super.onStart();
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }
}
