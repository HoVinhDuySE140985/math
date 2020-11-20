/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duy1.Utility;

/**
 *
 * @author くろくん
 */
public class MathUtility {
    
    public static final double PI = 3.14;
    
    public static int getFactorial(int n){
        if( n< 0 || n > 20)
            throw new IllegalArgumentException("N must be between 0..20");
        
        if(n == 0 || n == 1)
            return 1;
        // cho nay sai else la bi du
        // ngay cho nay chinh la n= 0..20
        long result = 1;
        for (int i = 2; i <= n ; i++) {
            result *= i;
        }
        return (int) result;
    }
}
// ta tu tin ham ta chay dc , chay dung
// nhung : team can chung minh dieu do, dam bao chat luong code chat luong ham
// muon chung minh ham chay dc hay ko ta can test thu
// test nghia la dua ham ra sai, goi ham vs cac tham so khac nhau
// vi du goi ham getFactorial( vs cac so khac nhau dua vao)
// getF(-5), getF(-1), getf(0), getF(5)....
//cac gia tri dau vao dai dien cho viec sai ham
//ta con goi la test case, cac tinh huong can test
// khi t lam test ham can quan tam 2 viec
//1. du kien ham TRA VE gia tri gi khi ham chay vs 1 dau vao nao do
//   du kien ham tra ve gia tri tui goi laf Expected Value
//   VD: ham tra ve 120 khi goi getF(5)
//2. ham chay vs 1 dau vao nao do, thi no goi la Actual Value
//   cai value tra ve cua ham la

//
//
//

//
//

//
//ki thuat 1 : : nhin bang mat va so sanh tung cap expected vs actual
//               chinh la ky thuat sout(expected) , sout (actual- ham oi ve j khi chay)
//ky thuat nay don gian , de lam , nhung mac sai sot do co qua nhieu cap
// expected actual can so sanh bang mat

//ky thuat 2 : nhin bang mat , ko can so sanh tung cap , de may so sanh  gium luon
//neu tat ca cac cap actual vs expected deu thoa, co 1 vai cap ko thoa
//thi ket luan ngay, ham sai, mau do cho tat ca
//dieu nay giai thich la : dung thi phai dung cho tat ca moi tinh huong ham chay
//chi can 1 thang sai la ham sai
 
// tuong duong cau: ham tui chay ngon lam  , dung 99%, lau lau sai ty
//nois cau dos : ham eo tin cay de sai
// ky thuat 2 nay dung mau sac , muon lam nhu vay thi phai sai them thu vien bo sung 
// chinh la File.Jar, .DLL dc cung cap them ngoai JDK
//cac thu vien nay thuoc ngon ngu lap trinh , dc goi chung la 
//Unit test framework,
//C# : thu vien cu the Junit, TestNG, xUnit
//PHP: PHPUnit
//C++ : CPPUnit
//.....

