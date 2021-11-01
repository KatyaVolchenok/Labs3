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
public abstract class Person {
    private String name;
    private Gender gender;
    private String verb;
    private String department;
    
    
    public Person(String name, Gender gender, String verb, String department) {
        setName(name);
        setGender(gender);
        setVerb(verb);
        setDepartment(department);
    }
    
    public String getName() {
        return name;
    }
    
    public Gender getGender() {
        return gender;
    }
    
    public String getVerb() {
        return verb;
    }
    
    public String getDepartment() {
        return department;
    }    
    
    public void setName(String name) {
        if(name != null && ! name.equals("")) {  
        this.name = name;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым");
        }
    }
    
    public void setGender(Gender gender) {
        if(gender != null) {  
        this.gender = gender;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым");
        }
    }
   
    public void setVerb(String verb) {
        if(verb != null && ! verb.equals("")) {  
        this.verb = verb;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым");
        }
    }
    
    public void setDepartment(String department) {
        if(department != null && ! department.equals("")) {  
        this.department = department;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым");
        }
    }
   
    public void print() {
        System.out.println("This is " + name + ". " 
                + gender.getPron() + " " + verb + " at " + department + ".");
        System.out.println(getDetailInfo());
    }
    
   public abstract String getDetailInfo();
    
    public static void printAll(Person[] person) {
        for (Person p : person) {
            p.print();
            System.out.println();
        }
    }
}
