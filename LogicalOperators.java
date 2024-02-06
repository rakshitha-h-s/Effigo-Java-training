public class LogicalOperators {
    public static void main(String[] args) {
        String option = "cash";
        String option2="credit";
        boolean cashOrCredit = option.equals("cash") && option2.equals("credit");
        System.out.println(cashOrCredit);
        char letter = 'A';
        boolean isVowel = (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');
        System.out.println(isVowel);
        String move = "stay";
        boolean isHitOrStay = (!move.equals("hit")) ;
        System.out.println(isHitOrStay);
    }
}
