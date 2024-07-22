class hellow{
        public static void main(String a[])
     {
        
      char f = 'a';
       f= (char)(f+1);  // explicity conersion or
        System.out.println(f);
      char x ='a';
      x+=1;
      System.err.println(x);
      int q =257;
      byte k=(byte)q;
      System.out.println(k);
      //type promotion
      byte b=10;
      byte B=30;
      int result= b*B;
      int z=++B;
      System.out.println(z);
      System.out.println(result);
     }

}