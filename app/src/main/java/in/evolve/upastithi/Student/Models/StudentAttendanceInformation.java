package in.evolve.upastithi.Student.Models;

import java.io.Serializable;

/**
 * Created by RAJEEV YADAV on 1/26/2017.
 */
public class StudentAttendanceInformation implements Serializable{
    String subject;
    String attendance;
    public StudentAttendanceInformation(String subject,String attendance)
    {
        this.subject=subject;
        this.attendance=attendance;
    }

    public String getSubject() {
        return subject;
    }

    public String getAttendance() {
        return attendance;
    }
}
