/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duy.util.test;

import duy1.Utility.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author くろくん
 */
public class MathUtilityTest {

    @Test // bien ham trong class nay thanh public static void main()
    // nhow tbo thu vien  JUNIt
    // tai sao can vay , vi mac dinh app tu main() chuan
    // trong khi do minh can test thu ham thoi, ko can can thiep main()
    // vay minh can main() khac , @Test giups dieu do
    // nhung vi co nhieu main CPU bi boi roi khi f6
    // F6 danh cho nhung main F6
    // Shift F6 danh cho ben nay
    
    public  void getFactorial_Runswell_IfvaildArgument(){
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
       
    }
     // bat ngoai le ntn 
    // ngoai leko phai la 1 value de so sanh 
    // do do dung ham assertX() la ko dc
    // t phai dung 1 ham khac
    
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowException_IfvalidArgument(){
        
        MathUtility.getFactorial(-5);
        
    }
    // tui muo thay mau xanh tren server vaf thay tich xanh
    
}
