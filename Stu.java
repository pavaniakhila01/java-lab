import java.util.Scanner; 
class Stu
{ 
 int sno; 
 String sname; 
 Stu() 
 { 
  sno=1; 
  sname="rama";
 }
   Stu(int sno1,String sname1)
  {
   this.sno=sno1;
   this.sname=sname1;
  } 
  Stu( Stu s)
  {
   sno=s.sno;
   sname=s.sname;
  }


  void display()
  { 
   System.out.println(sno + " " +  sname);
  } 
  public static void main(String args[])
  {
    Stu s=new  Stu();
   s.display();
   Stu s1=new Stu(3,"sita");
   s1.display();
   Scanner ob=new Scanner(System.in); 
    System.out.println("Enter student number");

   int sno2=ob.nextInt();
   System.out.println("Enter student name");


   String sname2=ob.next();
   Stu s3=new Stu(sno2,sname2);
   s3.display();

   Stu s4=new Stu(s3);

    System.out.println("s3 is copied to s4");
    s4.display();
  }
 }