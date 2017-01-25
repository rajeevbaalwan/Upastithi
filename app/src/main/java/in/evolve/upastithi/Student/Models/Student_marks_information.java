package in.evolve.upastithi.Student.Models;

import android.content.Context;

import java.io.Serializable;

/**
 * Created by RAJEEV YADAV on 1/25/2017.
 */
public class Student_marks_information implements Serializable {

    private Context context;
    private String subject;
    private String sess1;
    private String sess2;

    public Student_marks_information(Context context,String subject,String sess1,String sess2)
    {
        this.context=context;
        this.subject=subject;
        this.sess1=sess1;
        this.sess2=sess2;
    }

    public String getSubject() {
        return subject;
    }

    public String getSess1() {
        return sess1;
    }

    public String getSess2() {
        return sess2;
    }
}
