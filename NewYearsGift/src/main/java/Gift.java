import java.util.*;
import java.lang.*;
public class Gift {

public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
// TODO Auto-generated method stub
System.out.println("Please Enter number of choclates present in the gift ");
int no_chocs=scanner.nextInt();
Chocs[] c=new Chocs[no_chocs];
double total_wt=0;
for(int i=0;i<no_chocs;i++)
{    Chocs tmp=new Chocs();
System.out.println("Enter the Name of the chocklate:");
String choc_name=scanner.next()+scanner.nextLine();
tmp.setItemName(choc_name);
System.out.println("Enter the Price of the chocklate:");
double choc_price=scanner.nextDouble();
tmp.setItemPrice(choc_price);
System.out.println("Enter the net weight(in gms) of the chocklate:");
double choc_weight=scanner.nextDouble();
tmp.setItemWeight(choc_weight);
total_wt+=choc_weight;
c[i]=tmp;

}

System.out.println("Please Enter no of Sweets present in the gift ");
int no_swts=scanner.nextInt();
int cnt_swts=0;
Sweet[] s=new Sweet[no_swts];
for(int i=0;i<no_swts;i++)
{    Sweet tmp1=new Sweet();
System.out.println("Enter the Name of the Sweet:");
String sweet_name=scanner.next()+scanner.nextLine();
tmp1.setItemName(sweet_name);
System.out.println("Enter the Price of the Sweet:");
double sweet_price=scanner.nextDouble();
tmp1.setItemPrice(sweet_price);
System.out.println("Enter the net weight(in gms) of the Sweet:");
double sweet_weight=scanner.nextDouble();
    total_wt+=sweet_weight;
    tmp1.setItemWeight(sweet_weight);
    if(sweet_weight>0 && sweet_weight<=240)
    cnt_swts++;
s[i]=tmp1;

}
System.out.println("Total weight of all  the Items present in the gift:"+total_wt);
for(int i=0;i<no_chocs-1;i++)
{
for(int j=0;j<no_chocs-1;j++)
{
if(c[j].getItemWeight()>c[j+1].getItemWeight())
{
Chocs tmp;
tmp=c[j+1];
c[j+1]=c[j];
c[j]=tmp;
}
}
}
System.out.println("Chocs after sorting by weights:");
for(int i=0;i<no_chocs;i++)
{
System.out.println(c[i].getItemName()+"\t"+c[i].getItemPrice()+"\t"+c[i].getItemWeight());
}

System.out.println("Number of sweets present in the predetermined range of 1-240 gms are :"+cnt_swts);

}

}