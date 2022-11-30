public class GradeAv {
    public static void main(String[] args){
        //Grades
        int prelim =75;
        int midterm = 81;
        int finals = 90;

        // Total grade average
        double gradeAv = (prelim + midterm + finals) /3;

        //Remark(Failed, passed, syntax error)
        String remark = "";

        //Assign remark value depending on gradeAv
        if(gradeAv < 75){
            remark = "Failed";

        }else if(gradeAv > 74 && gradeAv < 100 ){
            remark = "Passed";

        }else{
            remark = "Syntax Error";
        }

        //Ouput Grade Average
        System.out.println("Grade Average: "+gradeAv);

        //Output Remark
        System.out.println("Remark: "+ remark);
    }
}
