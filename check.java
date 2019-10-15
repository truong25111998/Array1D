package intmanager;


public class check {
    private int number;
    private boolean isPrimary;
    
    public check (int number){
        this.number = number;
    }
    public void kt(){
        int sql = (int)Math.sqrt(number);
        for ( int i = 2; i<=sql ; i++){
            if(number % i == 0){
                isPrimary = false;
                return;
            }
        }
        isPrimary = true;
    }

    boolean isPrimary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
