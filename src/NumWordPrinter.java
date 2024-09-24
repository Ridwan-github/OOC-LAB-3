public class NumWordPrinter {
    public String PrintWord(int n, boolean uppercase){
        String result;

        if (n % 2 == 0 && n % 11 == 0 && n % 13 == 0) {
            result = "EvenPrimeLucky";
        } else if (n % 2 == 0 && n % 11 == 0) {
            result = "EvenPrimeEleven";
        } else if (n % 2 == 0) {
            result = "Even";
        } else if (n % 11 == 0) {
            result = "PrimeEleven";
        } else if (n % 13 == 0) {
            result = "LuckyThirteen";
        } else {
            result = "OddOneOut";
        }
        if (uppercase) {
            result = result.toUpperCase();
        }

        return result;
    }
}
