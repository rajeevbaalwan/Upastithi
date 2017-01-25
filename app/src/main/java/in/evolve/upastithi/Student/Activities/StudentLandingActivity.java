package in.evolve.upastithi.Student.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Student.Adapters.PagerAdapter;
import in.evolve.upastithi.Student.Fragments.TabAssignments;
import in.evolve.upastithi.Student.Fragments.TabAttendance;
import in.evolve.upastithi.Student.Fragments.TabMarks;
import in.evolve.upastithi.Student.Fragments.TabQueries;

public class StudentLandingActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_landing);

        tabLayout = (TabLayout) findViewById(R.id.student_tab_layout);
        viewPager = (ViewPager) findViewById(R.id.student_view_pager);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setUpViewPager(ViewPager viewPager){

        pagerAdapter.addFragment(new TabAttendance(),"Attendance");
        pagerAdapter.addFragment(new TabMarks(),"Marks");
        pagerAdapter.addFragment(new TabAssignments(),"Assignments");
        pagerAdapter.addFragment(new TabQueries(),"Queries");
        viewPager.setAdapter(pagerAdapter);

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
