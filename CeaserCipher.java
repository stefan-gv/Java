public class CeaserCipher{
    public static void main(String[] args){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String cipher = "gnwj gfw eaddagf ewjuzsflk sfv ugmflafy";
        solve(alphabet, cipher);
    }

    public static void solve(String theAlphabet, String notSolvedCipher){
        String copyOfCipher = notSolvedCipher;
        for (int shift = 1; shift<26; shift++){
            for (int indexOfCipher = 0; indexOfCipher<notSolvedCipher.length(); indexOfCipher++){
                int indexOfAlphabet = theAlphabet.indexOf(notSolvedCipher.charAt(indexOfCipher));
                
                if (notSolvedCipher.charAt(indexOfCipher) == ' '){
                    char[] copyOfCipherChars = copyOfCipher.toCharArray();
                    copyOfCipherChars[indexOfCipher] = ' ';
                    copyOfCipher = String.valueOf(copyOfCipherChars); 
                }
                
                else if ((indexOfAlphabet + shift)>25){
                    int shiftedIndexOfAlphabet = (indexOfAlphabet+shift)-26;
                    char[] copyOfCipherChars = copyOfCipher.toCharArray();
                    copyOfCipherChars[indexOfCipher] = theAlphabet.charAt(shiftedIndexOfAlphabet);
                    copyOfCipher = String.valueOf(copyOfCipherChars);
                }else {
                    char[] copyOfCipherChars = copyOfCipher.toCharArray();
                    copyOfCipherChars[indexOfCipher] = theAlphabet.charAt(indexOfAlphabet+shift);
                    copyOfCipher = String.valueOf(copyOfCipherChars);
                }     
            }
            System.out.println(copyOfCipher);
        }
    }
}