
package degumae;

import java.util.Scanner;
        
public class grade {
    int scounts;
    double totalave = 0;
    public void getgrade(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter no. of Grades");
        scounts = scan.nextInt();
        
      Grades[] gr = new Grades[scounts];
      
      for (int i = 0; i < scounts; i++){
          
          gr[i] =new Grades();
          
          System.out.println("\nEnter details of Grades");
          System.out.println("ID: ");
          int id = scan.nextInt();
          System.out.println("Name: ");
          String name = scan.next();
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
        
        for (int i = 0; i < gr. length; i++){
            totalave += gr[i].ave;
            if(gr[i]. ave < 3.0){
                passed++;
            }else{
            failed++;
            {
                System.out.println("---------------------------------------");
                System.out.printf("Total Class Average: %.2f\n", (totalave / scounts));
                System.out.println("No. of Passed: " + passed);
                System.out.println("No. of Failed: " + failed);
            }
        
            
        }
    
      
    }
    }
    }