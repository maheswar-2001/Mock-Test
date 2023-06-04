public class a_non_repeating {
    public static void main(String args[]) {
     
        String inputStr ="loveleetcode";

        for(char i :inputStr.toCharArray()){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "
            	+inputStr.indexOf(i));
            break;
        }
        }
    }
}


