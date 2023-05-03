class backLogException extends Exception{
    public backLogException(String s){
        super(s);
    }
}
public class Student1 {
    int rollNo;
    String name;
    int[] marks;

    double calcAvg(){
        int sum = 0;
        for(int num:this.marks){
            sum+=num;
        }
        return sum/this.marks.length;
    }

    Student1(int roll, String name, int[] m){
        this.rollNo = roll;
        this.name = name;
        try{
            this.marks = m;
            int count = 0;
            for(int num:marks){
                if(num<50){
                    count+=1;
                }
            }
            if(count>=2){
                throw new backLogException("Number of backlogs: "+count);
            }
        }catch(backLogException be){
            System.out.println(be.getMessage());
        }
    }

    public static void main(String args[]){
        int nums[] = {56,78,89,34,12};
        Student1 s = new Student1(1234,"Aaditya",nums);
        System.out.println(s.calcAvg());
    }
    
}