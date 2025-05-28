public class OperatorPrecedence {
    public static void main(String[] args){
        int result=20+5*4;
        System.out.println("operator precedence: Brackets,Of,Division,Multiplication,Addition,Subtraction");
        System.out.println("the result of 20+5*4 is (20+(5*4))=40 :"+result);

        int result2=(20+5)*4;
        System.out.println("the result of (((20+5)=25)*4)=100  is "+ result2 );
    }
    
}