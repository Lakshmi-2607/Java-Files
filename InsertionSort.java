class InsertionSort
{
public static void main(String[]args)
{
int i,key,j;
int a[]={58,25,76,12};
int n=a.length;
for(i=1;i<n;++i)
{
key=a[i];
j=i-1;
while((j>=0)&&a[j]>key)
{
a[j+1]=a[j];
j=j-1;
}
a[j+1]=key;
}
System.out.println("Sorted Array:");
for(i=0;i<n;++i)
System.out.println(" "+a[i]);
}
}