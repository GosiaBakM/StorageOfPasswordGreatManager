package generator;

import java.util.Random;

public class StrongPasswordGenerator implements PasswordGenerator {

        private String lowerCase = "abcdefghijklmnoprstuwxyz";
        private String upperCase = "ABCDEFGHIJKLMNOPSRTWUXYZ";
        private String digit = "0123456789";
        private String specialSigns = "~!@#$%^&*?><:_-";
        private String password;
        private char [] arrayPassword;
        private char [] arrayOfAllTypesOFCharacters = new char [4];


    @Override
    public String generate(int length) {
        Random randomValue = new Random();
        arrayPassword = new char[length];
        for (int i = 0; i < (arrayPassword.length); i ++){
            int randomIndexOfLowerCase= randomValue.nextInt(lowerCase.length()-1);
            int randomIndexOfUpperCase= randomValue.nextInt(upperCase.length()-1);
            int randomIndexOfNumbers= randomValue.nextInt(digit.length()-1);
            int randomIndexOfspecialSigns= randomValue.nextInt(specialSigns.length()-1);

            //System.out.println(randomIndex);
            char singleLowerCase = lowerCase.charAt(randomIndexOfLowerCase);
            char singleUpperCase = upperCase.charAt(randomIndexOfUpperCase);
            char singleNumber = digit.charAt(randomIndexOfNumbers);
            char singleSpecialSign = specialSigns.charAt(randomIndexOfspecialSigns);

            arrayOfAllTypesOFCharacters[0] = singleLowerCase;
            arrayOfAllTypesOFCharacters[1] = singleUpperCase;
            arrayOfAllTypesOFCharacters[2] = singleNumber;
            arrayOfAllTypesOFCharacters[3] = singleSpecialSign;

            int randomIndexOfSpecifiedChar = randomValue.nextInt(arrayOfAllTypesOFCharacters.length);
            int letterCounter = 0;
            int digitCounter = 0;
            int specialTypeCounter = 0;

            if (letterCounter < 4 && digitCounter <1 && specialTypeCounter == 0 ){
                letterCounter++;
                arrayPassword[i] = arrayOfAllTypesOFCharacters[randomIndexOfSpecifiedChar];
                continue;
            }

            else if((randomIndexOfSpecifiedChar == 0 || randomIndexOfSpecifiedChar == 1) && letterCounter < 5 ){
                letterCounter++;
                arrayPassword[i] = arrayOfAllTypesOFCharacters[randomIndexOfSpecifiedChar];
                continue;
            }

            else if(randomIndexOfSpecifiedChar == 2 && digitCounter <1){
                digitCounter++;
                arrayPassword[i] = arrayOfAllTypesOFCharacters[2];
                continue;
            }

            else {
                arrayPassword[i] = arrayOfAllTypesOFCharacters[3];
                specialTypeCounter++;
                continue;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (char k: arrayPassword
                ) {
            stringBuilder.append(Character.toString(k));
        }
        password = stringBuilder.toString();
        return password;
    }

    @Override
    public GeneratorType getType() {
        return GeneratorType.STRONG_PASSWORD;
    }
}
