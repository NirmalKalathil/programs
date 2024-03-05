public class CPU 
{
 int price;
 CPU(int price)
 {
 this.price=price;
 }
 void display()
{
System.out.println ("\nCPU info");
System.out.println ("CPU price= "+price);
}
class Processor
{ 
int cores;
String producer;
Processor (int noC, String Anu)
{
cores = noC;
producer = Anu;
}
void display()
{
System.out.println ("\nProcessor info");
System.out.println ("No. of Cores = "+cores);
System.out.println ("Manufacturer = "+producer+"\n");
}
}
static class RAM 
{
int mem;
String manuf;
RAM (int memory, String producer)
{
mem = memory;
manuf = producer;
}
void display ( )
{
System.out.println ("\n RAM info");
System.out.println ("Memory = "+mem+" GB");
System.out.println ("Manufacturer = "+manuf+"\n");
}
}
public static void main(String[] args)
{
CPU cpuobj = new Cpu(30000); 
CPU.RAM obj1= new.RAM (8,"Intel");
CPU obj2 = new CPU ( ); 
CPU.Processor obj3 = obj2.new Processor (8,"Samsung");
obj1. display( );
obj3. display( );
}
}
