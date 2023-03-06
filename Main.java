// application team in UTP

public class Main
{
    // application code
    public static void main(String[] args) throws Exception {
        Student sofea = new Student();
        Name name = new Name();
        //name (first, middle, last) prompt from Name class
        name.setFName("Fatin");
        name.setMName("Sofea");
        name.setLName("Rokis");
        sofea.setName(name); //name variable exist in student class, which they prompt from Name class
        
        
        Student adila = new Student();
         name = new Name();
        //name (first, middle, last) prompt from Name class
        name.setFName("Adila");
        name.setMName("Izzati");
        name.setLName("Munir");
        //name prompt from Name class, function setName(firstname, middlename, lastname)
        adila.setName(name);


        Student imran = new Student();
         name = new Name();
        name.setFName("Syed");
        name.setMName("imran");
        imran.setName(name);

        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(sofea);//sofea added, automatically assigned to the first index
        sb2023.add(adila, 1);// adila added, specifically assigned on index 1
        sb2023.add(imran,2);//imran added, specifically assigned on index 2

        //method to find name(could be first, middle, last name)
        boolean isIn = sb2023.find("Fadhilah");



        Teacher cikguminah = new Teacher();

            
        try {  // try block.. something in here can cause exception
            sofea.setMark(10, 0);
            sofea.setMark(20, 1);
            sofea.setMark(100, 2);
        } catch (Exception ex) {  // catch block.. action to be taken
            // in case of Exception
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }
        
        sofea.displayMarks();
        
        // calculate and print the avg for sofea
        float avg = 0;
        avg = sofea.calcAvg();
        System.out.println("Avg = " + avg);

        // calculate the min marks for sofea
        System.out.println("Min = " + sofea.calcMin());
    }
}
