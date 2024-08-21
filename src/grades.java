
public class grades {
    String sname;
    int sid;
    double p, m, pf, f;
    
    public void addGrades(String name, int id, double p, double m, double pf, double f){
    
        this.sname = name;
        this.sid = id;
        this.p = p;
        this.m = m;
        this. pf = pf;
        this.f = f;
    }
    
    public void viewGrades(){
        double ave = (this.p + this.m + this.pf + this.f)/4;
        String remarks = (ave > 3.0)? "Failed" : "Passed";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
               this.sid, this.sname, this.p, this.m, this.pf, this.f, ave, remarks);
    }  
      
        
    }
       
                    
   
