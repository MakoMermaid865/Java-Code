/* Type your code here for class Course. */
class Course implements Comparable<Course>{
   private String department;
   private Integer number;

   public Course(String dept, Integer num){
      this.department = dept;
      this.number = num;
   }

   @Override 
   public int compareTo(Course otherCourse){
      int deptComparison = this.department.compareTo(otherCourse.department);
      if (deptComparison != 0){
         return deptComparison;
      }
      return this.number.compareTo(otherCourse.number);
   }
   @Override
   public String toString(){
      return department + " " + number;
   }
}
