package in.evolve.upastithi.Teacher.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Student.Activities.StudentLandingActivity;

public class TeacherLoginActivity extends AppCompatActivity {

    private EditText teacherIdInput;
    private EditText teacherPassInput;
    private Button teacherLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);


        teacherIdInput = (EditText) findViewById(R.id.teacher_id_input);
        teacherPassInput = (EditText) findViewById(R.id.teacher_password_input);
        teacherLoginButton = (Button) findViewById(R.id.btn_teacher_login);

        teacherLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teacherLanding = new Intent(TeacherLoginActivity.this,TeacherLanding.class);
                startActivity(teacherLanding);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
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
