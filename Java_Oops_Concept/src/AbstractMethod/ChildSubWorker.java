package AbstractMethod;

public class ChildSubWorker extends SubWorker{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildSubWorker cs=new ChildSubWorker();
		cs.hike();
		cs.Work();
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println("Finally implemented here");
	}

}
