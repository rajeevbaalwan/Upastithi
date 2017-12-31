package in.evolve.upastithi;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import in.evolve.upastithi.Academic.Activities.AcademicLoginActivity;
import in.evolve.upastithi.Chairperson.Activities.ChairpersonLoginActivity;
import in.evolve.upastithi.Student.Activities.StudentLoginActivity;
import in.evolve.upastithi.Teacher.Activities.TeacherLoginActivity;
import in.evolve.upastithi.ViceChancellor.Activities.VcLoginActivity;

public class LandingActivity extends AppCompatActivity {

    private TextView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_landing);

        appName = (TextView) findViewById(R.id.app_name);
        appName.setTypeface(Typeface.createFromAsset(LandingActivity.this.getAssets(),"Xipital -BRK-.ttf"));



        new Handler()
        .postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(LandingActivity.this,WebsiteActivity.class);
                startActivity(in);
                LandingActivity.this.finish();
            }
        },3000);
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
