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
public abstract class Student extends Person {
    public Student(String name, Gender gender, String department) {
        super(name, gender, department, "studies");
}
}
