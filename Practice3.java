/*
Write a class Worker and derive classes DailyWorker and SalariedWorker from it. 
Every worker has a name and a salary rate.
Write method ComPay (int hours) to compute the week pay of every worker. 
A Daily Worker is paid on the basis of the number of days he/she works.
The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are.
Test this program to calculate the pay of workers.
*/
class worker
{
String name;
int empno;
worker(int no,String n)
{ 
  empno=no; name=n;
}
void show()
{
System.out.println("\n--------------------------");
System.out.println("Employee number : "+empno);
System.out.println("Employee name : "+name);
}
}
class dailyworker extends worker
{
int rate;
dailyworker(int no,String n,int r)
{
super(no,n);
rate=r;
}
void compay(int h)
{
show();
System.out.println("Salary : "+rate*h);
}
}
class salariedworker extends worker
{
int rate;
salariedworker(int no,String n,int r)
{
super(no,n);
rate=r;
}
int hour=40;
void compay()
{
show();
System.out.println("Salary : "+rate*hour);
}
}
//--------- main -----------
class Practice3
{
public static void main(String args[])
{
dailyworker d=new dailyworker(254,"Arjun",75);
salariedworker s=new salariedworker(666,"Unni",100);
d.compay(45);
s.compay();
}
}