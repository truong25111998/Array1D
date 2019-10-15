package intmanager;
import java.util.Random;
import java.util.Scanner;

public class IntManager {
    private int [] arrInt ;
    int sum = 0;
    
    public IntManager(){
        
        arrInt = new int[20];
        System.out.println(arrInt);
        Random rd = new Random();    
        intArray();
    }
    
    private void intArray(){     
        Random rd = new Random();
        for(int i = 0; i<arrInt.length; i++){
            arrInt[i] = rd.nextInt(51)+ 50;
            
        }
    }
    
    public int sum(){
        intArray();
        int sum = 0;
        for(int i = 0; i<arrInt.length; i++){
            sum = sum + arrInt[i];
        }
        System.out.println("sum is: "+sum);
        return sum;
    }
    public void sum1(int m){
        intArray();
        Scanner sc = new Scanner(System.in);     
        for(int i = 0; i<arrInt.length; i++){
            for(int j = i; j<arrInt.length; j++){
                if(arrInt[i] + arrInt[j] == m)
                    System.out.println("vi tri ma tong bang 150: " + arrInt[i] + arrInt[j]);
            }    
        }
        
    }
            public void sumlessm (int m){   
            int start = 0;
            int init = 0;
            for(int i = 0; i<arrInt.length; i++){
                if(arrInt[i] < 8){
                    init = i;
                    break;
                }
            }
            for(int i = init; i< arrInt.length; i++){
                if(arrInt[i]+ sum >=8 || i == arrInt.length - 1 ){
                    for(int j=start; j<i; j++){
                        System.out.println(arrInt[j] + " ");
                    }
                    sum = 0;
                    System.out.println();
                    for (int j = i; j<arrInt.length; j++)
                    {
                        if(arrInt[j]<8)
                        {
                            start = j;
                            break;
                        }
                    }                   
                }
                else 
                    sum = sum + arrInt[i];
            }
        }
    
    public int sumle(){
        intArray();  
        for(int i = 0; i<arrInt.length; i++){
            if(arrInt[i] % 2 == 1){
                System.out.println("so le trong day la: "+ arrInt[i]);
                sum = sum + arrInt[i];
            }                      
        }
        System.out.println(sum);
        return sum;
    }
    public int sumnt(){
        intArray();
        int sum = 0;
        for(int i = 0; i<arrInt.length; i++){
            check c = new check(sum);
            c.kt();
            if(c.isPrimary() == true)
                sum = sum + arrInt[i];
        }
        System.out.println(sum);
        return sum;
    }
    
}
