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
public class RegularStudent extends Student {
    private int course;
    private Stage stage;

    public RegularStudent(String name, Gender gender, String department, Stage stage, int course) {
        super(name, gender, department);
        setCourse(course);
        setStage(stage);
    }
    
    public int getCourse() {
        return course;
    }
    public Stage getStage() {
        return stage;
    }

    public void setCourse(int course) {
        if(course >= 0 || course < 6) {
           this.course = course; 
        } else {
            throw new IllegalArgumentException("Номер курса должен быть от 0 до 6");
        }
    }

    
    public void setStage(Stage stage) {
        if(stage != null) {  
        this.stage = stage;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым");
        }
    }

    @Override
    public String getDetailInfo() {
        return getGender().getPron() + " is " + course + "'th year "
                + stage + " student.";
    }
}
