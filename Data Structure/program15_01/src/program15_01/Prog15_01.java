package program15_01;

public class Prog15_01 {
    
    public static void main(String[] args) {
        int size = 4;
        Stack s = new Stack(size);
        Stack s1 = new Stack(size);

        //insertion
        for (int i = 0; i < size + 2; i++) {
            int x = 32 + (int) (Math.random() * 95);
            System.out.println(x + " --> " + (char) x);
            s.push((char) x);
        }
          
        System.out.println(" -----  ----  ---- ");
        
        Prog15_01 p = new Prog15_01();
        p.print(s);
        //removal and display
//        for (int i = 0; i < size + 2; i++) {
//            System.out.println("Item at the top: " + s.peek());
//
//            s.pop();
//        }
    }
    
    
      
        
        
    public void print(Stack s) {
        Stack temp = new Stack();
        
        while (!(s.isEmpty())) {
            temp.push(s.peek());
            s.pop();
        }
        
        while (!temp.isEmpty()) {
            System.out.println(temp.peek());
            s.push(temp.peek());
            temp.pop();
            
        }
        
        System.out.println(" -----  ----  ---- ");
        
    }
}
