package basics;

public class compression {
        public static void main(String[] args) {
            
        //compression operator
        boolean isSunUp = true;
        if (isSunUp ==true){
            System.out.println("Day");
        }
        else{
            System.out.println("night");
        }

        //logical operator
        //&&
        int a = 600;
        int b = 40;
        if(a<50 && b<50){
            System.out.println("both less than 50");
        }

        // conditonal statement - SWITCH
        int day = 1; // 1- monday, 2- tuesday

        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
            default:
                System.out.println("wed-sun");

        }

    }
}
