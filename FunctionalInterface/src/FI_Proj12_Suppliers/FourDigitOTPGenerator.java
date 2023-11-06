package FI_Proj12_Suppliers;

import java.util.Random;
import java.util.function.Supplier;

public class FourDigitOTPGenerator {
    public static void main(String[] args) {
        Supplier<String> otpGenerator = ()->{

          StringBuilder stringBuilder = new StringBuilder();
          for(int i=1;i<=6;i++){
              int randomNum = new Random().nextInt(10);
              stringBuilder.append(randomNum);
          }
          stringBuilder.insert(3,'-');
          return stringBuilder.toString();
        };

        for(int i = 0;i<5;i++){
            System.out.println("New OTP :: "+ otpGenerator.get() );
        }
    }
}
