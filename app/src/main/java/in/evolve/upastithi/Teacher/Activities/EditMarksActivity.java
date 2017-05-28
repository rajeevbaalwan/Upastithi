package in.evolve.upastithi.Teacher.Activities;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import in.evolve.upastithi.R;
import in.evolve.upastithi.Teacher.Adapters.EditMarksAdapter;
import in.evolve.upastithi.Teacher.Models.StudentAttendanceInfo;

public class EditMarksActivity extends AppCompatActivity {

    private RecyclerView editMarksRecyclerView;
    private EditMarksAdapter editMarksAdapetr;
    private String[] rollNo;
    private String[] name;
    private String[] sess1Marks;
    private String[] sess2Marks;
    private String[] semMarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_edit_marks);

        Resources resources=getResources();
        rollNo=resources.getStringArray(R.array.roll_no);
        name=resources.getStringArray(R.array.student_name);
        sess1Marks=resources.getStringArray(R.array.sess_1_marks);
        sess2Marks=resources.getStringArray(R.array.sess_2_marks);
        semMarks=resources.getStringArray(R.array.sem_marks);

        editMarksRecyclerView= (RecyclerView) findViewById(R.id.teacher_edit_marks_recycler_view);
        editMarksAdapetr=new EditMarksAdapter(EditMarksActivity.this,getData(),sess1Marks,sess2Marks,semMarks);
        editMarksRecyclerView.setLayoutManager(new LinearLayoutManager(EditMarksActivity.this));
        editMarksRecyclerView.setAdapter(editMarksAdapetr);
    }

    private List<StudentAttendanceInfo> getData() {
        List<StudentAttendanceInfo> list=new ArrayList<>();

        for(int i=0;i<10;i++)
        {
            list.add(new StudentAttendanceInfo(rollNo[i],name[i],null));
        }
        return list;
    }
}
