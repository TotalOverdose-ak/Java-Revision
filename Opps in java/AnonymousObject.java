public class AnonymousObject{
    static class Node{
        Node(){
            System.out.println("New object created");
        }
        public void show(){
            System.out.println("Fun show of obj");
        }
    }
    public static void main (String[] args) {

        //only create object without reference
        //this will not reuse it
        // new Node().show();
        //   new Node().show();
        
        
        // Node head = new Node(); //refrenced object 
        // //this will reuse
        // head.show();
        // head.show();
    }
} 