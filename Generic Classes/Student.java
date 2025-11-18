/* Type your code here for class Student. */
class Student implements Comparable<Student>{
   private String firstName;
   private String lastName;
   private double GPA;

   public Student(String first, String last, double gradeAverage){
      this.firstName = first;
      this.lastName = last;
      this.GPA = gradeAverage;
   }
   @Override
   public int compareTo(Student otherStudent){
      int gpaComparison = Double.compare(otherStudent.GPA, this.GPA);
      if(gpaComparison !=  0){
         return gpaComparison;
      }
      int lastNameComparison = this.lastName.compareTo(otherStudent.lastName);
      if (lastNameComparison != 0){
         return lastNameComparison;
      }
      return this.firstName.compareTo(otherStudent.firstName);
   }

   @Override
   public String toString(){
      return String.format("%.2f %s, %s", GPA, lastName, firstName);
   }
}
