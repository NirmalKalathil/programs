class product
{
int pcode;
String pname;
int pprice;
 
 product(int code,String name,int price)
{
pcode=code;
pname=name;
pprice=price;
}
void display()
{
System.out.println("Product code="+pcode);
System.out.println("Product name="+pname);
System.out.println("Product price="+pprice);
}
}
class product1
{
public static void main(String[]args)
{
product ob1=new product(123,"pen",10);
product ob2=new product(423,"pencil",5);
product ob3=new product(233,"book",30);
System.out.println("\n Product with the lowest price");
if (ob1.pprice <ob2.pprice)
if (ob1.pprice <ob3.pprice)
ob1.display();
else
ob3.display();
else if(ob3.pprice<ob2.pprice)
ob3.display();
else 
ob2.display();
}
}
