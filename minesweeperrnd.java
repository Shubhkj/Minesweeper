import java.util.*;
class minesweeperrnd
{
public static void main(String args[])
{
Scanner z=new Scanner(System.in);
System.out.println("Grid size");
int n=z.nextInt();
int a[][]=new int[n][n];
int i,j,c,b,bo,bom;
Random rr=new Random();
System.out.println("ENTER NO OF BOMBS");
bo=z.nextInt();
bom=bo;
for(i=1;i<=bo;i++)
{
b=rr.nextInt(n);
c=rr.nextInt(n);
if(a[b][c]>=10)
{
bo++;
continue;
}
a[b][c]=10+a[b][c];
try
{
a[b-1][c-1]++;
}
catch(ArrayIndexOutOfBoundsException zz)
{}
try
{
a[b-1][c]++;
}
catch(ArrayIndexOutOfBoundsException zz)
{}
try
{
a[b-1][c+1]++;
}
catch(ArrayIndexOutOfBoundsException zz)
{}
try
{
a[b][c-1]++;
}
catch(ArrayIndexOutOfBoundsException zz)
{}
try
{
a[b][c+1]++;
}
catch(ArrayIndexOutOfBoundsException zz)
{}
try
{
a[b+1][c-1]++;
}
catch(ArrayIndexOutOfBoundsException zz)
{}
try
{
a[b+1][c]++;
}
catch(ArrayIndexOutOfBoundsException zz)
{}
try
{
a[b+1][c+1]++;
}
catch(ArrayIndexOutOfBoundsException zz)
{}
}


String aa[][]=new String[n][n];

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
aa[i][j]=" ";
}


for(i=0;i<n;i++)
{
System.out.print("|");
     for(j=0;j<n;j++)
     System.out.print(aa[i][j]+"|");
System.out.println();
     if(i<(n-1))
     {
     for(b=0;b<n;b++)
     System.out.print("--");
     System.out.println("-");
     }
}

System.out.println();
System.out.println("1 for play");
System.out.println("2 for flag");
System.out.println("3 for doubt");

int r1,c1,ch,q=0,d1=0,f1=0;
String t1="";

while(true)
{
if(d1<=bom || f1<=bom)
{
     for(i=0;i<n;i++)
     {
          for(j=0;j<n;j++)
          {
               if(aa[i][j].equalsIgnoreCase(" "))
               q++;
          }
     }
}
     if(q==bom)
          break;
     else
          q=0;

     System.out.println("Dimensions");
     r1=z.nextInt();
     c1=z.nextInt();
     ch=z.nextInt();
if(r1>=n || c1>=n || r1<0 || c1<0 || ch<1 || ch>3)
{
System.out.println("Wrong Input");
continue;
}

if(ch==1)
{
          t1=""+a[r1][c1];
          if(Integer.parseInt(t1)>=10)
          break;
}
if(ch==2)
{
          t1="F";
          f1++;
}
if(ch==3)
{
          t1="D";
          d1++;
}
aa[r1][c1]=t1;

     for(i=0;i<n;i++)
     {
     System.out.print("|");
          for(j=0;j<n;j++)
          System.out.print(aa[i][j]+"|");
     System.out.println();
     if(i<(n-1))
          {
          for(b=0;b<n;b++)
               System.out.print("--");
          System.out.println("-");
          }
}

System.out.println();
}
int sc=0;

for(i=0;i<n;i++)
{
     for(j=0;j<n;j++)
     {
          if(aa[i][j].equalsIgnoreCase("D")||aa[i][j].equalsIgnoreCase(" "))
          sc=sc+0;
          else
          {
               if(aa[i][j].equalsIgnoreCase("F"))
               {
                    if(a[i][j]>=10)
                    sc=sc+5;
                    else
                    sc=sc+0;
               }
               else
               sc=sc+a[i][j];
          }
     }
}
System.out.println("Score = "+sc);

}
}

