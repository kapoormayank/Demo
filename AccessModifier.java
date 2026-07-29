// Java Demonstrate The Access Modifier
public class AccessModifier {
    // class in which access modifier or specifier
    public static class Modifiers{
        int x=5; // Default Access Modifier
        public String str= "Mayank Roy Kapoor"; // Public Access Modifier
        protected float age=19.5f; // Protected Access Modifier
        private String gender="Male"; // Private Access Modifier
        // Setter Function
        public void setGender(String gender){
            this.gender=gender;
        }
        // Getter Function
        public String getGender(){
            return this.gender;
        }
    }
    
    // Main function
    public static void main(String[] args) {
        Modifiers mode = new Modifiers();
        System.out.println("Default: "+mode.x);
        System.out.println("Public: "+mode.str);
        System.out.println("Protected: "+mode.age);
        System.out.println("Private: "+mode.gender);
    }
}
