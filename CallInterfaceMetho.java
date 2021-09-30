public class CallInterfaceMetho {
     public static void main(String args[]){
         InterfaceDemo demo = new InterfaceDemoImpl();
         demo.displayName("Adithya");
         demo.displayNameAndDesignation("Adithya", "Java Developer");
         demo.displayNameDefault("Adithya");
      }
}