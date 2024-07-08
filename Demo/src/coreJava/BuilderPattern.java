package coreJava;

public class BuilderPattern {
	public BuilderPattern startbrowser()
	{
		System.out.println("Browser will start...");
		return this;
	}
	public BuilderPattern runApplication()
{
		System.out.println("Application will run...");
		return this;
	
	}
	public void stopbrowser()
	{
		System.out.println("Browser will stop...");
	}

	public static void main(String[] args) {
		BuilderPattern b1=new BuilderPattern();
		b1.startbrowser().runApplication().stopbrowser();


	}

}
