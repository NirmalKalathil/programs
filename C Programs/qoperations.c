#include<stdio.h>
#include<stdlib.h>
void enqueue();
void dequeue();
void display();
int front=-1,rear=-1,maxsize;
int queue[10];
int main()
{
int choice;
printf("Enter the size of the queue");
scanf("%d",&maxsize);
printf("/n queue operations using array");
printf("\n1.Insert \n 2.delete\n 3.display \n 4.exit");
while(choice!=4)
{
printf("Enter the choice");
scanf("%d",&choice);
switch(choice)
{
case 1:
enqueue();
break;
case 2:
dequeue();
break;
case 3:
display();
break;
case 4:
exit(0);
break;
default:
printf("/nEnter valid choice");
}
}
return 0;
}
void enqueue()  
{  
int item;  
printf("\nEnter the element\n");  
scanf("\n%d",&item);      
if(rear ==maxsize-1)  
{  
printf("\noverflow\n");  
return;  
}  
if(front == -1 && rear == -1)  
{  
front = 0;  
rear = 0;  
}  
else   
{  
rear =rear+1;  
 }  
 queue[rear] = item;  
printf("\nvalue inserted ");       
}
 void dequeue()  
{  
int item;   
if (front == -1 || front > rear)  
{  
printf("\nunderflow\n");  
return;              
 }  
else  
{  
item = queue[front];  
if(front == rear)  
{  
front = -1;  
 rear = -1 ; 
 }  
else   
{  
front = front + 1;  
}  
printf("\nvalue deleted ");  
}        
}  
void display()
{
int i;
if(rear==-1)
{
printf("\nempty queue\n "); 
}
else
{
printf("\nelements in the queue are\n "); 
for(i=front;i<=rear;i++)
{
printf("\n%d",queue[i]);
}
}
}

