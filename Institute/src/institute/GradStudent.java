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
public class  GradStudent extends Student{
    private String thesisTitle;

    public GradStudent(String name, Gender gender, String department, String thesisTitle) {
        super(name, gender, department);
        setThesisTitle(thesisTitle);
    }
    
    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        if(thesisTitle != null && ! thesisTitle.equals("")) {  
        this.thesisTitle = thesisTitle;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым!");
        }
    }

    @Override
    public String getDetailInfo() {
        return getGender().getPronG() + " thesis title is \"" + thesisTitle + "\".";
}
}
