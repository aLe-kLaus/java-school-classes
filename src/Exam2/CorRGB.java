package Exam2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CorRGB {
    double R;
    double G;
    double B;

    String conversaoCMYK() {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.print("Entre com o valor da componente R (0 a 255): ");
        this.R = keyboard.nextDouble();

        System.out.print("Entre com o valor da componente G (0 a 255): ");
        this.G = keyboard.nextDouble();

        System.out.print("Entre com o valor da componente B (0 a 255): ");
        this.B = keyboard.nextDouble();

        if (R > 255 || R < 0 || G > 255 || G < 0 || B > 255 || B < 0) {
            return "O valores devem ser entre 0 e 255";
        }


        if (R + G + B == 0) {
            return "0.0 0.0 0.0 1.0";
        }

        double PorcentagemR = R / 255 * 100;
        double PorcentagemG = G / 255 * 100;
        double PorcentagemB = B / 255 * 100;

        double PorcentagemK = 100 - Math.max(Math.max(PorcentagemR, PorcentagemG), PorcentagemB);

        double C = (100 - PorcentagemR - PorcentagemK) / (100 - PorcentagemK);
        double M = (100 - PorcentagemG - PorcentagemK) / (100 - PorcentagemK);
        double Y = (100 - PorcentagemB - PorcentagemK) / (100 - PorcentagemK);
        double K = PorcentagemK / 100;

        String CMYK = df.format(C) + " " + df.format(M) + " " + df.format(Y) + " " + df.format(K);

        return CMYK;
    }
}
