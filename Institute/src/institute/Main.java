/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institute;

import static institute.AcademDegree.MSc;
import static institute.AcademDegree.PhD;
import static institute.Gender.F;
import static institute.Gender.M;
import static institute.Stage.Bachelor;
import static institute.Stage.Master;



/**
 *
 * @author Shwartskopff
 */
public class Main {
    public static void main(String [] args) {
	Person[] person = {
	    new Teacher("Ronald  Turner", M, "Computer science", PhD, "Programming paradigms"),
	    new Teacher("Ruth Holling", F, "Jurisprudence", MSc, "Domestic arbitration"),
	    new RegularStudent("Leo Wilkinson", M, "Computer science", Bachelor, 3),
            new RegularStudent("Anna Cunningham", F, "World economy", Bachelor, 1),
            new RegularStudent("Jill Lundqvist", F, "Jurisprudence", Master, 1),
            new GradStudent("Ronald Correa", M, "Computer science", "Design of a functional programming language")
		};
        
         Person.printAll(person);
}
}
