

import static org.junit.Assert.assertEquals;

import org.junit.Test;
  
public class Testlogic {  
  
    @Test  
    public void test(){  
      Addition t=new Addition();
    int actual=t.sum(10,20);
    
         
        assertEquals(30,actual); 
    }  
}  