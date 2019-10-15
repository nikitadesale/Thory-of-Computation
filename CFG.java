import java.util.Scanner; 
package examples;
// L = { a^n b^m ; n+m=even } 
class GFG {   
    // dfa tells the number associated 
    // with the present state. 
    static int dfa = 0; 
    static void start(char c) 
    { 
        if (c == 'a') { 
            dfa = 1; 
        } 
        else if (c == 'b') { 
            dfa = 2; 
        } 
  // -1 is used to check for any invalid symbol 
        else { 
            dfa = -1; 
        } 
    } 
    // the first state (Q1) of DFA 
    static void state1(char c) 
    { 
        if (c == 'a') { 
            dfa = 0; 
        } 
        else if (c == 'b') { 
            dfa = 5; 
        } 
        else { 
            dfa = -1; 
        } 
    } 
    // second state (Q2) of DFA 
    static void state2(char c) 
    { 
        if (c == 'b') { 
            dfa = 3; 
        } 
        else { 
            dfa = -1; 
        } 
    } 
    // third state (Q3)of DFA 
    static void state3(char c) 
    { 
        if (c == 'b') { 
            dfa = 4; 
        } 
        else { 
            dfa = -1; 
        } 
    } 
    // fourth state (Q4) of DFA 
    static void state4(char c) 
    { 
        if (c == 'b') { 
            dfa = 3; 
        } 
        else { 
            dfa = -1; 
        } 
    } 
    // fifth state (Q5) of DFA 
    static void state5(char c) 
    { 
        if (c == 'b') { 
            dfa = 6; 
        } 
        else { 
            dfa = -1; 
        } 
    } 
    // sixth state (Q6) of DFA 
    static void state6(char c) 
    { 
        if (c == 'b') { 
            dfa = 5; 
        } 
        else { 
            dfa = -1; 
        } 
    } 
    static int isAccepted(char str[]) 
    { 
        // store length of string 
        int i, len = str.length; 
  
        for (i = 0; i < len; i++) { 
            if (dfa == 0) 
                start(str[i]); 
            else if (dfa == 1) 
                state1(str[i]); 
            else if (dfa == 2) 
                state2(str[i]); 
            else if (dfa == 3) 
                state3(str[i]); 
            else if (dfa == 4) 
                state4(str[i]); 
            else if (dfa == 5) 
                state5(str[i]); 
            else if (dfa == 6) 
                state6(str[i]); 
  
            else
                return 0; 
        } 
        if (dfa == 3 || dfa == 5) 
            return 1; 
        else
            return 0; 
    } 
    // Driver code 
    public static void main(String[] args) 
    { 
        char str[];
        Scanner sc = new Scanner(System.in);
 	System.out.println("Enter a string"); 
        str = sc.next().toCharArray();
        //char str[] = "aaabbb".toCharArray(); 
        if (isAccepted(str) == 1) 
            System.out.println("ACCEPTED"); 
        else
            System.out.println("NOT ACCEPTED"); 
        
    } 
} 
