package fr.marcwrobel.jbanking;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCard implements Serializable{
    public String creditCardNumber;
    public static final String regex = "^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|" +
    "(?<mastercard>5[1-5][0-9]{14})|" +
    "(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|" +
    "(?<amex>3[47][0-9]{13})|" +
    "(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|" +
    "(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))$";

    public static final Pattern pattern = Pattern.compile(CreditCard.regex);
    public static  Matcher matcher;

    public CreditCard(String number){
        this.creditCardNumber = number.replaceAll("-", "");;
        CreditCard.matcher = pattern.matcher(this.creditCardNumber);
    }

    public boolean checkValidation(){
        return CreditCard.matcher.matches();
    }

    public boolean checkValidationChecksum(){
        String ccNumber = this.creditCardNumber.replaceAll("-", "");
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--)
        {
          int n = Integer.parseInt(ccNumber.substring(i, i + 1));
          if (alternate)
          {
            n *= 2;
            if (n > 9)
            {
              n = (n % 10) + 1;
            }
          }
          sum += n;
          alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    public String checkFormat() {
        if(!this.checkValidation() || !this.checkValidationChecksum()) 
            return "Creditcard is not valid";
        String[] cards = {"visa", "mastercard", "amex", "diners", "jcb"};
        for (String card : cards) {
            if (CreditCard.matcher.group(card) != null) return card;
        }
        return "Unknowed Error!";
    }
}
