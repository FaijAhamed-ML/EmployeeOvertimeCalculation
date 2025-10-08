import java.util.Scanner;
public class arrayPractice{
    public static void main(String[] args) {
        Scanner got=new Scanner(System.in);
        int[][] OT=new int[4][3];
        for(int i=0; i<OT.length; i++){
            for(int j=0; j<OT[0].length; j++){
                int k=j+1;
                int l=i+1;
                System.out.print("Enter the month "+k+" OT "+"from Employee "+l+" : ");
                OT[i][j]= got.nextInt();
            }
        }
        System.out.println("+------------------------+-------------------------+-------------------------+-------------------------+");
        System.out.println("|                        |        Month 1          |        Month 2          |        Month 3          |");
        System.out.println("+------------------------+-------------------------+-------------------------+-------------------------+");
        for (int i=0; i<OT.length;i++ ){
            int j=i+1;
        System.out.println("|  Employee "+j+"            |          "+OT[i][0]+"             |           "+OT[i][1]+"            |          "+OT[i][2]+"             |");
        System.out.println("+------------------------+-------------------------+-------------------------+-------------------------+");
    }
    double overTimePerHour=500.0;
    System.out.println("+------------------------+-------------------------+");
    System.out.println("|   Employee Number      |        Month 1          |");
    System.out.println("+------------------------+-------------------------+");
    int maxOtEmpId=0;
    double maxOtPayment=0.0;
    for(int i=0; i<OT.length ;i++){
        int I=i+1;
        double employeePayment=0;
        for(int j=0; j<OT[0].length;j++){      
             double overTimePayment=overTimePerHour*OT[i][j];
             employeePayment+=overTimePayment;
        }
        if (employeePayment>maxOtPayment){
            maxOtPayment=employeePayment;
            maxOtEmpId=i;
        }
        System.out.println("|           "+I+"            |        "+employeePayment+"0         |");
        System.out.println("+------------------------+-------------------------+");
    }
    int acctualEmployee=maxOtEmpId+1;
    System.out.println("higest OT got employee is :"+acctualEmployee+" and his OT is : "+maxOtPayment);
    }
}
