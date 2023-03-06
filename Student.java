// created by team in KL
public class Student {
    // data/attributes
    Name name;
    String kp;
    String address;
    String schoolname;
     float[] marks = new float[5];

    // methods or operations
    float calcAvg() {
        float sum=0;
        float avg=0;
        for(int i=0; i<5;i++){
            sum+= marks[i];
        }
        avg= sum/5;
        return avg;
    }

    float calcMin() {
         float minMark = 101;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < minMark) {
                minMark = marks[i];
            }
        }   
        return minMark;
    }

    void setName(Name name) {
        this.name = name;
    }

    void setMark(float mark, int i) throws Exception {
        if (mark < 0)
            throw new Exception("Error in mark detected");
        if (i <0)
            throw new Exception("Error in index detected");
        marks[i] = mark;
    }

    void displayMarks() {
        // print the marks
        for (int i=0; i<marks.length; i++) {
            System.out.println("marks at index "+i+" :"+marks[i]);
        }
    }

    }
