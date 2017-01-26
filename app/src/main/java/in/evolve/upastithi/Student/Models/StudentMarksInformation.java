package in.evolve.upastithi.Student.Models;

import android.content.Context;

import java.io.Serializable;

/**
 * Created by RAJEEV YADAV on 1/25/2017.
 */
public class StudentMarksInformation implements Serializable {

    private String subject;
    private String sess1;
    private String sess2;
    private String semMarks;
    public StudentMarksInformation(String subject, String sess1, String sess2, String semMarks)
    {

        this.subject=subject;
        this.sess1=sess1;
        this.sess2=sess2;
        this.semMarks=semMarks;
    }

    public String getSemMarks() {
        return semMarks;
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
