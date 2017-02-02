package in.evolve.upastithi.Teacher.Models;

import android.widget.TextView;

import java.io.Serializable;

/**
 * Created by RAJEEV YADAV on 2/2/2017.
 */
public class StudentAttendanceInfo implements Serializable {
    private String rollNo;
    private String name;
    private String attendance;
    public StudentAttendanceInfo(String rollNo,String name,String attendance) {
        this.rollNo=rollNo;
        this.name=name;
        this.attendance=attendance;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAttendance() {
        return attendance;
    }
}
