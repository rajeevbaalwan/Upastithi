package in.evolve.upastithi.Teacher.Activities;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Teacher.Adapters.ViewMarksAdapter;
import in.evolve.upastithi.Teacher.Models.StudentMarksInfo;

public class ViewMarksActivity extends AppCompatActivity {

    private RecyclerView viewMarksRecyclerView;
    private ViewMarksAdapter viewMarksAdapter;
    private String[] rollNo;
    private String[] name;
    private String[] sess1Marks;
    private String[] sess2Marks;
    private String[] semMarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_view_marks);

        Resources resources=getResources();
        rollNo=resources.getStringArray(R.array.roll_no);
        name=resources.getStringArray(R.array.student_name);
        sess1Marks=resources.getStringArray(R.array.sess_1_marks);
        sess2Marks=resources.getStringArray(R.array.sess_2_marks);
        semMarks=resources.getStringArray(R.array.sem_marks);

        viewMarksRecyclerView= (RecyclerView) findViewById(R.id.teacher_view_marks_recycler_view);
        viewMarksRecyclerView.setLayoutManager(new LinearLayoutManager(ViewMarksActivity.this));
        viewMarksAdapter=new ViewMarksAdapter(ViewMarksActivity.this,getData());
        viewMarksRecyclerView.setAdapter(viewMarksAdapter);

    }

    private List<StudentMarksInfo> getData() {
        List<StudentMarksInfo> list=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            list.add(new StudentMarksInfo(rollNo[i],name[i],sess1Marks[i],sess2Marks[i],semMarks[i]));
        }
        return list;
    }
}
