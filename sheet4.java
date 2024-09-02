public class PoorDog
{
int size;
string name;
public int getsize()
{
return size;
}
public string getName()
{
return name;
}
}
public class PoorDogTestDrive
{
public static void main (String[]args)
{
PoorDog one= new PoorDog();
System.out.println("Dog size is "+ one.getSize());
System.out.println("Dog name is "+ one.getName());
}
}
