/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institute;

/**
 *
 * @author Shwartskopff
 */
public class Teacher extends Person {
    private AcademDegree degree;
    private String specialty;

    public Teacher(String name, Gender gender, String department, AcademDegree degree, String specialty) {
        super(name, gender, department, "teaches");
        setAcademDegree(degree);
        setSpecialty(specialty);
    }

    public AcademDegree getAcademDegree() {
        return degree;
    }
    
    public String getSpecialty() {
        return specialty;
    }

    public void setAcademDegree(AcademDegree degree) {
        if(degree != null) {  
        this.degree = degree;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым");
        }
    }

    public void setSpecialty(String specialty) {
        if(specialty != null) {  
        this.specialty = specialty;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым");
        }
    }

    @Override
    public String getDetailInfo() {
        return getGender().getPron() + " has " + degree + " degree in " + specialty + ".";
    }
}
