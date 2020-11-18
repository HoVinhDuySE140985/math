/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author くろくん
 */
public class Math {
    public static void main(String[] args) {
        long expected = 120 ;
        long actual = duy1.Utility.MathUtility.getFactorial(5);
        System.out.println("5!? expected : " + expected + "; actual: " + actual);
        // dung cho case tinh huong dau tien 
        
        expected = 720 ;
        actual = duy1.Utility.MathUtility.getFactorial(6);
        System.out.println("6!? expected : " + expected + "; actual: " + actual);
        // dung case 2
        
        // case 3:
        System.out.println("0!? expected : 1 ; actual: " + duy1.Utility.MathUtility.getFactorial(0));
        
        // case4: 
        // ki vong nhan ve ngoai le IllegalArgument
        //neu khi goi -5
        duy1.Utility.MathUtility.getFactorial(-5);
    }
}
// cat code len server GitHub
// nho kho tren github, url:
// nho username va pass va email vao github cua minh
// can tool de dong bo code len len server (github, gitlab, bitbucket)
// tool co the la cmd, GUI ,(Git Desktop, Source Tree)
// vi ta la pro, ta choi cmd
// cai git csm da noi tai trc
// can file dac biet de noi vs git tool rang ai len server ai ow lai local file nay goi la file.gitignore
// no se khac nhau content tuy vao IDE mminh sai , ngon ngu lap trinh minh sai
// co 1 ga dep cuc ky de thuong , lam san nhung file ung vs cac IDE , NNLT roi
//vo duong dan de lay file do  https://gitignore.io