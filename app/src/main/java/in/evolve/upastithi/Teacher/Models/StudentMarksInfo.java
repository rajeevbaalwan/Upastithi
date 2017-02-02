package in.evolve.upastithi.Teacher.Models;

import java.io.Serializable;

/**
 * Created by RAJEEV YADAV on 2/2/2017.
 */
public class StudentMarksInfo implements Serializable {
    private String rollNo;
    private String name;
    private String sess1Marks;
    private String sess2Marks;
    private String semMarks;
    public StudentMarksInfo(String rollNo,String name,String sess1Marks,String sess2Marks,String semMarks) {
        this.rollNo=rollNo;
        this.name=name;
        this.sess1Marks=sess1Marks;
        this.sess2Marks=sess2Marks;
        this.semMarks=semMarks;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getSess1Marks() {
        return sess1Marks;
    }

    public String getSess2Marks() {
        return sess2Marks;
    }

    public String getSemMarks() {
        return semMarks;
    }
}
