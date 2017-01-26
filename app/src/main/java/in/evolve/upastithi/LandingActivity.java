package in.evolve.upastithi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import in.evolve.upastithi.Academic.Activities.AcademicLoginActivity;
import in.evolve.upastithi.Chairperson.Activities.ChairpersonLoginActivity;
import in.evolve.upastithi.Student.Activities.StudentLandingActivity;
import in.evolve.upastithi.Student.Activities.StudentLoginActivity;
import in.evolve.upastithi.Teacher.Activities.GenerateReportActivity;
import in.evolve.upastithi.Teacher.Activities.StudentRequestActivity;
import in.evolve.upastithi.Teacher.Activities.TeacherLanding;
import in.evolve.upastithi.Teacher.Activities.TeacherLoginActivity;
import in.evolve.upastithi.Utilities.Utils;
import in.evolve.upastithi.ViceChancellor.Activities.VcLoginActivity;

public class LandingActivity extends AppCompatActivity implements View.OnClickListener {

    private  Button student;
    private Button teacher;
    private Button viceChancellor;
    private Button chairperson;
    private Button academic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_landing);

        student= (Button) findViewById(R.id.student);
        teacher= (Button) findViewById(R.id.teacher);
        academic= (Button) findViewById(R.id.acedamic);
        viceChancellor= (Button) findViewById(R.id.vice_chancellor);
        chairperson= (Button) findViewById(R.id.chairperson);

        viceChancellor.setOnClickListener(this);
        chairperson.setOnClickListener(this);
        academic.setOnClickListener(this);
        teacher.setOnClickListener(this);
        student.setOnClickListener(this);

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

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id)
        {
            case R.id.vice_chancellor:
                Intent intent1 = new Intent(LandingActivity.this, VcLoginActivity.class);
                startActivity(intent1);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                break;
            case R.id.chairperson:
                Intent intent2 = new Intent(LandingActivity.this, ChairpersonLoginActivity.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                break;
            case R.id.acedamic:
                Intent intent3 = new Intent(LandingActivity.this, AcademicLoginActivity.class);
                startActivity(intent3);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                break;
            case R.id.teacher:
                Intent intent4 = new Intent(LandingActivity.this, TeacherLoginActivity.class);
                startActivity(intent4);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                break;
            case R.id.student:
                Intent intent5 = new Intent(LandingActivity.this, StudentLoginActivity.class);
                startActivity(intent5);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                break;
        }
    }
}
