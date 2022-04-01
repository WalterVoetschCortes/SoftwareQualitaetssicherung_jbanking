package fr.marcwrobel.jbanking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CreditCardTest {
    @Test
    @DisplayName("4263-5401-2146-3219 = true")
    void checkValideVisa(){
        CreditCard creditCard = new CreditCard("4263-5401-2146-3219");
        Boolean resultFormat = creditCard.checkValidation();
        assertEquals(true, resultFormat, "4263-5401-2146-3219 should equal true");
    }

    @ParameterizedTest(name = "{0} = {1}")
	@CsvSource({
			"4101-8915-5309-1424,  true", //visa
			"5466106385744025, true", //mastercard
			"374131931919204, true", //american express
            "30036592321275, true", //diners club
            "3540933292448852, true", //jcb
            "53101891553091424,  false", //wrong visa
			"5666106385744025, false", //wrong mastercard
			"3909126040313549775,  false", //wrong discover
			"3741319319192048, false", //wrong american express
            "300365923212753, false", //wrong diners club
            "35409332924488525, false", //wrong jcb
	})
    void checkValide(String inputString, Boolean expectedResult){
        CreditCard creditCard = new CreditCard(inputString);
        Boolean resultFormat = creditCard.checkValidation();
        assertEquals(expectedResult, resultFormat, inputString + " should equal " + expectedResult);  
    }

    @Test
    @DisplayName("4263-5401-2146-3219 = true")
    void checksumValideVisa(){
        CreditCard creditCard = new CreditCard("4263-5401-2146-3219");
        Boolean resultFormat = creditCard.checkValidationChecksum();
        assertEquals(true, resultFormat, "4263-5401-2146-3219 should equal true");
    }

    @ParameterizedTest(name = "{0} = {1}")
	@CsvSource({
        "4101-8915-5309-1424,  true", //visa
        "5466106385744025, true", //mastercard
        "374131931919204, true", //american express
        "30036592321275, true", //diners club
        "3540933292448852, true", //jcb
        "4101-8915-5309-1442,  false", //wrong visa
        "5466106385744052, false", //wrong mastercard
        "374131931919240, false", //wrong american express
        "30036592321257, false", //wrong diners club
        "3540933292448825, false", //wrong jcb
        "53101891553091424,  false", //wrong visa
		"5666106385744025, false", //wrong mastercard
		"3909126040313549775,  false", //wrong discover
	})
    void checkSumValide(String inputString, Boolean expectedResult){
        CreditCard creditCard = new CreditCard(inputString);
        Boolean resultFormat = creditCard.checkValidationChecksum();
        assertEquals(expectedResult, resultFormat, inputString + " should equal " + expectedResult);  
    }

    @Test
    @DisplayName("4263-5401-2146-3219 = visa")
    void checkFormatVisa(){
        CreditCard creditCard = new CreditCard("4263-5401-2146-3219");
        String resultFormat = creditCard.checkFormat();
        assertEquals("visa", resultFormat, "4263-5401-2146-3219 should equal visa");
    }

    @ParameterizedTest(name = "{0} = {1}")
	@CsvSource({
        "4101-8915-5309-1424,  visa", //visa
        "5466106385744025, mastercard", //mastercard
        "374131931919204, amex", //american express
        "30036592321275, diners", //diners club
        "3540933292448852, jcb", //jcb
        "4101-8915-5309-1442,  Creditcard is not valid", //wrong visa
        "5466106385744052, Creditcard is not valid", //wrong mastercard
        "374131931919240, Creditcard is not valid", //wrong american express
        "30036592321257, Creditcard is not valid", //wrong diners club
        "3540933292448825, Creditcard is not valid", //wrong jcb
        "53101891553091424,  Creditcard is not valid", //wrong visa
		"5666106385744025, Creditcard is not valid", //wrong mastercard
		"3909126040313549775,  Creditcard is not valid", //wrong discover
	})
    void checkFormat(String inputString, String expectedResult){
        CreditCard creditCard = new CreditCard(inputString);
        String resultFormat = creditCard.checkFormat();
        assertEquals(expectedResult, resultFormat, inputString + " should equal " + expectedResult);  
    }
}
