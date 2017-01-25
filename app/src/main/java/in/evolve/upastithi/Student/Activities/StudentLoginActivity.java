package in.evolve.upastithi.Student.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import in.evolve.upastithi.R;

public class StudentLoginActivity extends AppCompatActivity {


    private EditText studentRollInput;
    private EditText studentPassInput;
    private Button studentLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        studentRollInput = (EditText) findViewById(R.id.student_roll_input);
        studentPassInput = (EditText) findViewById(R.id.student_password_input);
        studentLoginButton = (Button) findViewById(R.id.btn_student_login);

        studentLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent studentLanding = new Intent(StudentLoginActivity.this,StudentLandingActivity.class);
                startActivity(studentLanding);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
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
}
