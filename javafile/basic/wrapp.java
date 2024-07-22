class wrapp {
    public static void main(String a[]){
        int num=9;
        System.out.println(num);
        //Integer num1=new Integer(num);  //boxing
        Integer num1=num; //autoboxing
        System.out.println(num1);

    //converting  object value to int value 
    int num2= num1.intValue();  //unboxing
    //int num2=num1  // auto-unboxing
    System.out.println(num2);

    String s1="5";
     int s =Integer.parseInt(s1);
    System.out.println(s*2);
}
}
