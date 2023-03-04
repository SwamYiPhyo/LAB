package week6.HW;public class MainInfix2Postfix {
  public static void main(String[] args) {
        String operator = "+-*/";
        String expression = "(a+b-c)*d-(e+f)";
        //ab+c-d*ef+-
        System.out.println("Infix: " + expression);

        //Create a char stack
        ArrayStackChar stack = new ArrayStackChar();
        //split String to array of characters
        char[]exp = expression.toCharArray();

        System.out.print("\nPostfix: ");
        //For each character in the array
        for(char c : exp)
        {
            if(c != '+' && c != '-' && c != '*' && c != '/' && c != '(' && c!= ')')
            {
                System.out.print(c);
            }
            else if(c == '(')
            {
                stack.push(c);
            }
            else if(operator.indexOf(c) != -1)
            {
                if(stack.isEmpty())
                {
                    stack.push(c);
                }
                char p = (char) stack.peek();
                if(operator.indexOf(p) != -1)
                {
                    stack.pop();
                    System.out.print(p);
                    stack.push(c);
                }
                else if(p == '(')
                {
                    stack.push(c);
                }
            }
           else if(c == ')')
            {
                if(stack.isEmpty())
                {
                    System.out.println("expression is not matched");
                    break;
                }
                else {
                    do {
                        char p = (char) stack.pop();
                        System.out.print(p);
                    }while(stack.peek() != '(');
                    if(stack.peek() == '(')
                    {
                        stack.pop();
                    }
                }
            }
        }//end for each character

        //now all operators and operands are checked
        //is there any operator left in stack?
        //if stack is NOT empty
        if(!stack.isEmpty())
        {
            char p = (char) stack.peek();
            if(operator.indexOf(p) != -1)
            {
                stack.pop();
                System.out.print(p);
            }
            else if(p == '(') {
                System.out.println("expression is not matched");
            }
        }//end if stack is NOT empty
    }//end main method
}
