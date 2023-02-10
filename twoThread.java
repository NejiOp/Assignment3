package twothread;
public class twoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Runnable() {
			
			int num=0;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=50;i++)
				{
					num +=i;
					
				}
				double total=num/50;
				System.out.println("Average of first 50 nummber"+total);
				
			}
		};
		Runnable r2=new Runnable() {
			int[] arr= {10,15,20,25,30};
			@Override
			public void run() {
				for(int i:arr)
				{
					System.out.println("square of array number"+i*i);
				}
				
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();

	}

}
