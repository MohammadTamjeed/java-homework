//
//package season316;
//
//   public class Season316 {
//
//        public static void main(String[] args) {
//        
//            double randx = (double)Math.random()*50;
//           
//            double randy = (double)Math.random()*100;
//            
//            System.out.println("X:"+randx+" & Y:"+randy);
//            
//        
//        
//        }
//    
//}


public class Season316 {
    public static void main(String[] args) {
        // عرض و ارتفاع مستطیل
        double width = 100;
        double height = 200;

        // تولید مختصات تصادفی
        double x = (Math.random() - 0.5) * width;  // بین -50 و 50
        double y = (Math.random() - 0.5) * height; // بین -100 و 100

        System.out.println("Random point is (" + x + ", " + y + ")");
    }
}
