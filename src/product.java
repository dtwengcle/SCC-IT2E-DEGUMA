
public class products {
    
    int id;
    String name;
    double price;
    int stocks, sold;
    
    public void addProduct(int pid, String pname, double price, int pstocks, int solid){
        
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.stocks = pstocks;
        this.sold = psolds;        
    }
    
    public void viewProduct(){
        double profit = this.price * this.sold;
        double tep = this.stocks * this.price;
        String status = (this.stocks > o) ? "Available" : "Out-of-stock";
        
        System.out.println("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10.2f %-10s\n";
            this.id, this.name, this.price, this.stocks, this.sold, profit, tep, status;
               

    }
}
