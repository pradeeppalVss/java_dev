class Decision{
    public static void main(String[] args){
        // String a = "false";
        // if(Boolean.parseBoolean(a)){
        //     System.out.println("My age is greater than 5!!!");
        //     System.out.println("Type of a is "+a.getClass().getName());
        // }
        // else if(a == "true"){
        //     System.out.println("My age is equal to 4!!!");
        // }
        // else {
        //     System.out.println("My age is smaller than 5!!!");
        // }
        int a = 6;

        String result = switch(a){
            case 1->"My dog is 1 year old";
            case 2->"My dog is 2 year old";
            case 3->"My dog is 3 year old";
            case 4->"My dog is 4 year old";
            case 5->"My dog is 5 year old";
            default->"My dog was 5 year old";
        };
        System.out.println(result);
    }
}

