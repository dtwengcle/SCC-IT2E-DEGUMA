
package degumae;

import java.util.Scanner;
        
public class Grades {
    public void getgrade(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter no. of Grades");
        int np = sc.nextInt();
        
      Grades[] gr = new Grades[Scounts];
      
      for (int i = 0; i < Scounts; i++){
          
          gr[i] =new Grades();
          
          System.out.println("\nEnter details of Grades");
          System.out.println("ID: ");
          System.out.println("Name: ");
          System.out.println("Prelim: ");
          double p = scan.nextDouble();
          System.out.println("Midterm: ");
          double m = scan.nextDouble();
          System.out.println("Pre Final: ");
          double pf = scan.nextDouble();
          System.out.println("Final: ");
          double f = scan.nextDouble();
          
          gr[i].addGrades(name, id, p, m, pf, f);
     
      }
      
      for (int i = 0; i < gr.length; i++){
          gr[i]. viewGrades();
      }
      
        System.out.println("No. of Students " + scounts);
        int passed = 0, failed = 0;
        double totalave = 0;
        
        for (int i = 0; i < gr. lenght; i++){
            totalave += gr[i].average;
            if(gr[i]. average < 3.0){
                passed++;
            }else{
            failed++;
            {
                System.out.println("---------------------------------------");
                System.out.println("Total Class Average: %.2f\n", (totalave / scount));
                System.out.println("No. of Passed: " + passed);
                System.out.println("No. of Failed: " + failed);
            }
        
            
        }
    
      
    }
    
}
