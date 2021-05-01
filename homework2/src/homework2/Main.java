package homework_2;

public class Main {

	public static void main(String[] args) {
    	Course course1 = new Course(1,"Yazilim Gelistirici Kamp C#-Angular","Engin Demiroð");
    	Course course2 = new Course(2,"Yazilim Gelistirici Kamp Java-React", "Engin Demiroð");
        Course course3 = new Course(3, "Programlama Giris Icin Temel Kurs","Engin Demirog");
        
        Course[] courses = { course1, course2, course3};
        
        for(Course course : courses) {
              System.out.println(course.courseName + " "+ course.teacherName);        	
        	
        };
        
        Instructor instructor1 = new Instructor(1, "Engin","Demirog");
        Instructor instructor2 = new Instructor(2,"Mehmet Emin","Kurtboga");
        
        Instructor[] instructors = {instructor1, instructor2};
          for (Instructor instructor : instructors) {
        	   System.out.println(instructor.name + instructor.surName);
          };
            
          CourseManager courseManager = new CourseManager();
          courseManager.registerCourse(course1);
          
          courseManager.registerCourse(course2);
          
          courseManager.registerCourse(course3);
          
          courseManager.previousLesson(course3);
          courseManager.previousLesson(course2);
          courseManager.previousLesson(course1);
	}
	
}
          
