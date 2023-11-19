class fybca implements Runnable
{
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.print("\nfybca");
        }
    } 
}

class sybca implements Runnable
{
    public void run()
    {
        for(int i=0;i<6;i++)
        {
            System.out.print("\nSybca");
        }
    } 
}
class priority 
{
	public static void main(String args[])
{
	Thread t1 = new Thread(new fybca());
	Thread t2 = new Thread(new sybca());

	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(Thread.MAX_PRIORITY);
	t1.start();
	t2.start();
	System.out.println("tybca");
	
}

}