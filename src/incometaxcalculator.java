public class incometaxcalculator {
    public static void main(String[] args) {
        double maas = 3000001;
        double vergi;
        if(maas>=3000000){
            vergi = maas*40/100 +958800;
            System.out.println(vergi);
        }
        else if(maas>=870000){
            vergi = 213300+((maas-870000)*35/100);
            System.out.println(vergi);
        }
        else if(maas>=230000){
            vergi = 40500+((maas-230000)*27/100);
        }
        else if(maas>=110000){
            vergi = 16500+((maas-110000)*20/100);
            System.out.println(vergi);
        }
        else{
            vergi= maas*15/100;
            System.out.println(vergi);

        }

    }
}
