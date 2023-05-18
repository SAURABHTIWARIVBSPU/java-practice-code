package assignment;

public class A7 {
    public void driver(){
        complex c1=new complex();
        time t1=new time();
        t1.settime(3,41,50);
        t1.showtime();

        c1.setcomplex(10,20);
      c1.printcomplex();
    }
}
class complex{
    private int real,imag;
   public void setcomplex(int r ,int i){
        real=r;
        imag=i;

    }
    public void printcomplex(){
        System.out.println("Real="+real+    "imag="+imag);
    }
}
class time{
    private int hr, min, sec;
    public  void  settime(int h,int m, int s) {
        hr = h;
        min = m;
        sec = s;
    }
        public void showtime(){
            System.out.println(hr+":" + min+":" +sec);

    }


}
